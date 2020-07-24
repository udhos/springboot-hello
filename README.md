# springboot-hello

## Spring Boot Quick Start 1 - Introduction

https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x

1. Install OpenJDK 11

https://developers.redhat.com/products/openjdk/download

2. Install Sprint Tools 4 for VSCode

https://spring.io/tools

3. Open the development folder in VSCode: Ctrl+K Ctrl+O

4. VSCode: Ctrl+Shift+P: Spring Initializr: Generate a Maven Project

Language: Java
Group Id: com.example
Artifact Id: quickstart1
Spring Boot version: 2.3.1

5. Run the application, it will run to completion and then exit

6. Add the dependency "spring-boot-starter-web" to pom.xml:

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
    </dependencies>

7. Now run the application again, it will run forever

8. Run from cmd line:

```
set JAVA_HOME=C:\Program Files\RedHat\java-11-openjdk-11.0.7-1
.\mvnw.cmd clean install
java -jar target\quickstart1-0.0.1-SNAPSHOT.jar
```

More information about mvnw.cmd: https://github.com/takari/maven-wrapper

9. Look at file DemoApplication.java

See: [Using the @SpringBootApplication Annotation](https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-using-springbootapplication-annotation)

    ‪//springboot-hello\quickstart1\src\main\java\com\example\quickstart1\DemoApplication.java

    package com.example.quickstart1;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
    public class DemoApplication {

        public static void main(String[] args) {
            SpringApplication.run(DemoApplication.class, args);
        }

    }

## Spring Framework Tutorial | Full Course

https://www.youtube.com/watch?v=If1Lw4pLLEo

## SPRING BOOT Vs SPRING - A Comparison

https://www.youtube.com/watch?v=bNFoN956P2A

## Spring Boot Tutorials | Full Course

https://www.youtube.com/watch?v=35EQXmHKZYs

## API Restful com Spring Boot, Kotlin e MongoDB

https://www.udemy.com/course/api-restful-kotlin-spring-boot-mongodb/
