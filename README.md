# spring-boot-admin-demo
 Spring Boot Admin Demo
 
docker run -p 5050:80 -e PGADMIN_DEFAULT_EMAIL=berk@domain.com -e PGADMIN_DEFAULT_PASSWORD=postgres -d --name pgadmin4 dpage/pgadmin4

docker run -p 5432:5432 -e POSTGRES_PASSWORD=postgres -v pgdata:/var/lib/postgresql/data -d --name postgresql postgres
