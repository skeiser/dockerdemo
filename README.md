# dockerdemo
Stuff related to docker demo


Docker notes:

-- centos install
 -it is interactive and assign a tty
docker run -it centos /bin/bash
yum check-update
yum install -y vim, edit tmp/testfile
Stop the container, run with the run command(starting another image). - No test file, no vim
docker start, docker attach to prior container, vim and test file are there.
