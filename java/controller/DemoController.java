package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class DemoController {
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("message", message);
		mv.addObject("name", name);
		
		Context ctx = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<String> rdata = new ArrayList<String>();
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/MyDB");
			con = ds.getConnection();
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("select iddemodata, message from demodata");
			
			while(rs.next()){
				rdata.add("ID:" +rs.getString(1) + "   Message:" + rs.getString(2));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("data", rdata);
		
		return mv;
	}
}
