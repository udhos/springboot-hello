# springboot-hello

## Spring Boot Quick Start 1 - Introduction

https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x

Hint: Alt+Shift+O = organize code (include Java imports).

1. Install OpenJDK 11

https://developers.redhat.com/products/openjdk/download

2. Install Sprint Tools 4 for VSCode

https://spring.io/tools

3. Open the development folder in VSCode: Ctrl+K Ctrl+O

4. VSCode: Ctrl+Shift+P: Spring Initializr: Generate a Maven Project

* Language: Java
* Group Id: com.example
* Artifact Id: quickstart1
* Spring Boot version: 2.3.1

5. Run the application, it will run to completion and then exit

6. Add the dependency "spring-boot-starter-web" to pom.xml:

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
    </dependencies>

7. Now run the application again, it will run forever

Look at this line:

```
2020-07-24 03:09:10.780  INFO 10132 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
```

Open http://localhost:8080/

8. Run from cmd line:

```
set JAVA_HOME=C:\Program Files\RedHat\java-11-openjdk-11.0.7-1
.\mvnw.cmd clean install
java -jar target\quickstart1-0.0.1-SNAPSHOT.jar
```

More information about mvnw.cmd: https://github.com/takari/maven-wrapper

9. Look at file DemoApplication.java

See: [Using the @SpringBootApplication Annotation](https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-using-springbootapplication-annotation)

```
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
```

10. Create controller HelloController.java

```
    ‪//springboot-hello\quickstart1\src\main\java\com\example\quickstart1\hello\HelloController.java

    package com.example.quickstart1.hello;

    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController // This class is a rest controller
    public class HelloController {
        
        @RequestMapping("/hello") // Map all http methods for method /hello
        public String sayHi() {
            return "Hi";
        }
    }
```

Run the application, then open http://localhost:8080/hello

11. Create TopicController.java and Topic.java

```
    ‪//springboot-hello\quickstart1\src\main\java\com\example\quickstart1\topic\TopicController.java

    package com.example.quickstart1.topic;

    import java.util.Arrays;
    import java.util.List;

    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class TopicController {
        
        @RequestMapping("/topics")
        public List<Topic> getAllTopics() {
            return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
            );
        }
    }
```

```
    ‪//springboot-hello\quickstart1\src\main\java\com\example\quickstart1\topic\Topic.java

    package com.example.quickstart1.topic;

    public class Topic {
        
        private String id;
        private String name;
        private String description;

        public Topic() {
        }

        public Topic(String id, String name, String description) {
            super();
            this.id = id;
            this.name = name;
            this.description = description;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }
```

Run the application, then open http://localhost:8080/topics

12. Create TopicService.java and change TopicController.java

```
    ‪//springboot-hello\quickstart1\src\main\java\com\example\quickstart1\topic\TopicService.java

    package com.example.quickstart1.topic;

    import java.util.Arrays;
    import java.util.List;

    import org.springframework.stereotype.Service;

    @Service // Spring Business Service (singleton)
    public class TopicService {

        private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
        );

        public List<Topic> getAllTopics() {
            return topics;
        }
    }
```

```
    ‪//springboot-hello\quickstart1\src\main\java\com\example\quickstart1\topic\TopicController.java

    package com.example.quickstart1.topic;

    import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class TopicController {

        @Autowired // marks field as requiring dependency injection
        private TopicService topicService;

        @RequestMapping("/topics")
        public List<Topic> getAllTopics() {
            return topicService.getAllTopics();
        }
    }
```

Run the application, then open http://localhost:8080/topics


## Spring Framework Tutorial | Full Course

https://www.youtube.com/watch?v=If1Lw4pLLEo

## SPRING BOOT Vs SPRING - A Comparison

https://www.youtube.com/watch?v=bNFoN956P2A

## Spring Boot Tutorials | Full Course

https://www.youtube.com/watch?v=35EQXmHKZYs

## API Restful com Spring Boot, Kotlin e MongoDB

https://www.udemy.com/course/api-restful-kotlin-spring-boot-mongodb/
