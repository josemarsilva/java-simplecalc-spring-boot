# README - java-simplecalc-spring-boot
Java Simple Calculator - Spring Boot

## 1. Introduction

This is repository of the project **java-simplecalc-spring-boot**.

## 2. Documentation

### 2.1. Use Case Diagram

![UseCaseDiagram-Context.png](./doc/UseCaseDiagram-Context.png) 


### 2.2. Deploy Diagram

![DeployDiagram-Context.png](./doc/DeployDiagram-Context.png) 


### 2.3. Packages and Class Class Diagram

![ClassDiagram-Context.png](./doc/ClassDiagram-Context.png) 

### 2.4. Branch Strategy Workflow

Branch:
* `master`: pronto para produção
* `develop`: último desenvolvimento pronto para produção

Consulte todos detalhes da [estratégia de branches e workflow](https://github.com/josemarsilva/eval-git#38-estrat%C3%A9gia-de-gerenciamento-de-branches) deste projeto.


## 3. Project

### 3.1. Preconditions

* Eclipse configured `JRE System Library[JSE1.8]`

```eclipse
+ JRE System Library -> click properties
  + Execution environment: JavaSE-1.8(jre1.8.09) -> click environment
    - Move JavaSE-1.8 from list "Execution Environment" to "Compatible Environment"
```

* `pom.xml` configuration:

```pom.xml
  :
	<properties>
        <java.version>1.8</java.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
	</properties>
  :
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.5.21.RELEASE</version>
	</parent>
  :
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
  :
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
  :
```

* Java JDK 1.8 (jar file includes runnable)
* Apache Maven 3.6 (recommended > 3.3)


### 3.2. Guide for Developers

* Clone source code using "git clone". Use branch "master" if branch "develop" is not available.
* Read, if avaliable, "2. Documentation"  and "3.X. Guides, Patterns, Standard, Conventions and Best Practices" to understand patterns, standards, conventions and best practices used in this project.
* Make your changes, commit and push on "develop" branch. Use branch "master" if branch "develop" is not available. Ask me permission, if not available permission to push.


### 3.3. Guide for Configuration

* n/a


### 3.4. Guide for Test

The following command line runs JUnit tests.

```bat
```


### 3.5. Guide for Deploy

The following command line builds a runnable (.jar) in `.\target\java-simplecalc-spring-boot-jar-with-dependencies.jar`

```bat
C:\..\java-simplecalc-spring-boot> mvn clean compile package assembly:single
```


### 3.6. Guide for Demonstration

* n/a


### 3.7. Patterns, Standard, Conventions and Best Practices

* n/a


## I - References

* [Introduction to Spring Boot ](https://www.youtube.com/watch?v=R9qanO4c7bY&list=PLzS3AYzXBoj8UcLsBN3UXd7Nf1T4ZyJa0)
* [Spring Boot Hello World Example in Eclipse](https://www.youtube.com/watch?v=Bro59wWFOgo&t=331s)

* [spring-boot-starter-parent correct version](https://stackoverflow.com/questions/41032446/springbootapplication-cannot-be-resolved-to-a-type)
* https://help.espring-bootpse.org/neon/index.jsp?topic=%2Forg.espring-bootpse.stardust.docs.wst%2Fhtml%2Fwst-integration%2Fconfiguration.html


* https://www.youtube.com/watch?v=Bro59wWFOgo&t=331s
* https://www.youtube.com/watch?v=PSP1-2cN7vM&list=PLBBog2r6uMCRzaJqr-uUC8gakwSxkPSBh
  - https://github.com/in28minutes/SpringBootForBeginners/tree/master/01.Spring-Boot-Introduction-In-10-Steps
  - https://github.com/in28minutes/SpringBootForBeginners/blob/master/Step01.md
  - https://github.com/in28minutes/SpringBootForBeginners/blob/master/Step02.md
  - https://github.com/in28minutes/SpringBootForBeginners/blob/master/Step03.md
* https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/
* http://www.springboottutorial.com/spring-boot-tutorials-for-beginners
* https://www.youtube.com/watch?v=ILRmPKEL4U0&index=1&list=PLBBog2r6uMCRzaJqr-uUC8gakwSxkPSBh
* http://www.springboottutorial.com/creating-rest-service-with-spring-boot