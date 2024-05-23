# SpringBoot-JPA-REST
A web App with CRUD operations built on a Spring Boot Framework
![UML class](https://github.com/vasaikarSimii/SpringBoot-JPA-REST/assets/71291381/66ff5421-aefe-4838-9f16-16af4dd449a0)

DOCKER COMMANDS:
  docker build -t spring-boot-docker .
 1. docker images
 2. docker ps
 3. docker network ls
 4. docker network connect spring-net mysqldb
 5. docker network inspect
 6. docker network inspect spring-net
 7. docker run -p 9090:8080 --name spring-boot-docker --net spring-net -e MYSQL_HOST=mysqldb -e MYSQL_USER=root -e  MYSQL_PASSWORD=root -e MYSQL_PORT=3306 spring-boot-docker
