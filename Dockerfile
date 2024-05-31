FROM openjdk:17
EXPOSE 8081
ADD target/swiggy_service.jar swiggy_service.jar
ENTRYPOINT ["java","-jar","/swiggy_service.jar"]