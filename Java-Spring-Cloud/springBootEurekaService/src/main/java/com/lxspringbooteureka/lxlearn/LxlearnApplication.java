package com.lxspringbooteureka.lxlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LxlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxlearnApplication.class, args);
    }

}


//
//     /Users/lixiang1008/Code/apache-maven-3.6.3
//     /System/Volumes/Data/Users/lixiang1008/.jenkins/workspace/springBrother/Java-Spring-Cloud/springBootRibbon

//打包后的位置
//      /Users/lixiang1008/.jenkins/workspace/springBrother/Java-Spring-Cloud/springBootRibbon/target/lxlearn-1.0-SNAPSHOT.jar

//    mvn clean package 打包后 eureka 的位置
//java -jar /Users/lixiang1008/.jenkins/workspace/springBrother/Java-Spring-Cloud/springBootEurekaService/target/lxlearn-0.0.1-SNAPSHOT.jar

//     jenkins
//     java -jar jenkins.war --httpPort=9998