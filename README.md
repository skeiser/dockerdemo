Docker notes:


DB dockerdemo DockerDemo@1
-- centos install
 -it is interactive and assign a tty
docker run -it centos /bin/bash
yum check-update
yum install -y vim, edit tmp/testfile
Stop the container, run with the run command(starting another image). - No test file, no vim
docker start, docker attach to prior container, vim and test file are there.

https://hub.docker.com/_/tomcat/
tomcat 8 version container

Commands
control pq - exits container without shutdown
docker run -d (detached) 
docker run -it (interactive, tty assigned)
docker attach (connect to a running detached container)
docker ps -l (lists last run container)
docker top (container id) process list
docker inspect
docker port

Installs --
apt-get update && apt-get install -y iputils-ping inetutils-traceroute inetutils-telnet iproute2


**Plan

docker run ubuntu

*Interactive shell 
    docker run -it ubuntu /bin/bash


*Installing stuff using apt-get

* Stop and Start container  
    docker stop start kill restart and restart running containers
    attaches to pid 1 (usually init, but not in docker containers)

*Network

*Demo the difference between image, layers and container
-- base os
-- software
-- updated configs
-- union file system mount. all on top of each other
   top layer is the only writable layer

*copy file to and from container

*copy a war file/context to the tomcat server
* maybe connect ot Mysql Container

*creating an image from a container

*Dockerhub

*pushing newly created image to dockerhub

*Dockerfile

Download and run new docker image





