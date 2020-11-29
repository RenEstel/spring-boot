start:
	./mvnw spring-boot:run
docker-build:
	 docker build -t demo .
docker-run:
	docker run -p 8080:8080 renestel/demo
start:
	docker-compose up -d


