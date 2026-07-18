# Spring Annotation Configuration

A Spring Core project demonstrating **annotation-based bean configuration** using `@Component`, `@Autowired`, and component scanning to understand the Spring IoC Container without XML bean definitions.

---

# 📖 Project Overview

This project is part of my Spring Framework learning journey.

The objective is to understand how Spring automatically discovers, creates, and injects beans using annotations instead of XML configuration.

The application simulates a simple **Smart Home System** consisting of:

* Smart Home
* Smart Room
* Smart Light

Spring automatically creates and wires all objects using annotation-based configuration.

---

# 🎯 Learning Objectives

* Understand Annotation-Based Configuration
* Learn the purpose of `@Component`
* Learn Constructor Dependency Injection using `@Autowired`
* Understand Component Scanning
* Learn Automatic Bean Discovery
* Understand how Spring IoC Container manages beans
* Compare XML Configuration with Annotation Configuration

---

# 🏗️ Project Structure

```text
src
└── main
    ├── java
    │
    │   └── org.smarthome
    │
    │       ├── app
    │       │      Main.java
    │       │
    │       ├── home
    │       │      SmartHome.java
    │       │
    │       ├── room
    │       │      SmartRoom.java
    │       │
    │       ├── device
    │       │      SmartLight.java
    │       │
    │       └── config
    │
    └── resources
            applicationContext.xml
```

---

# 📚 Object Relationship

```text
SmartHome
    │
    ▼
SmartRoom
    │
    ▼
SmartLight
```

The Spring IoC Container automatically creates the complete object graph and injects all required dependencies.

---

# ⚙️ Technologies Used

* Java 17
* Spring Framework (Spring Core)
* Maven
* Annotation-Based Configuration
* IntelliJ IDEA

---

# 🚀 Features

* Automatic Bean Discovery
* Constructor Dependency Injection
* Component Scanning
* Smart Home Simulation
* Loose Coupling using Spring IoC
* Annotation-Based Configuration

---

# 📝 Spring Annotations Used

## `@Component`

Marks a class as a Spring-managed bean.

```java
@Component
public class SmartLight {
}
```

---

## `@Autowired`

Automatically injects dependencies through the constructor.

```java
@Autowired
public SmartRoom(SmartLight smartLight) {
    this.smartLight = smartLight;
}
```

---

## Component Scanning

The application uses component scanning to discover beans automatically.

```xml
<context:component-scan base-package="org.smarthome"/>
```

---

# ▶️ How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Download Maven dependencies.
4. Run `Main.java`.
5. Spring scans the package for components.
6. The IoC Container creates and wires all beans.
7. Retrieve the `SmartHome` bean from the container.
8. Display Smart Home details.

---

# 📌 Key Concepts Practiced

* Spring IoC Container
* Dependency Injection
* Constructor Injection
* Annotation-Based Configuration
* `@Component`
* `@Autowired`
* Component Scanning
* Automatic Bean Discovery
* ApplicationContext
* ClassPathXmlApplicationContext
* Loose Coupling

---

# 🔄 Learning Progression

## Manual Dependency Injection

```java
SmartLight light = new SmartLight();
SmartRoom room = new SmartRoom(light);
SmartHome home = new SmartHome(room);
```

Objects were created manually using the `new` keyword.

---

## Spring XML Configuration

```xml
<bean id="smartHome" class="...">
    <constructor-arg ref="smartRoom"/>
</bean>
```

Spring created and injected beans using XML configuration.

---

## Spring Annotation Configuration

```java
@Component
public class SmartHome {

    private final SmartRoom smartRoom;

    @Autowired
    public SmartHome(SmartRoom smartRoom) {
        this.smartRoom = smartRoom;
    }
}
```

Spring automatically discovers and injects beans using annotations.

---

# 📈 Learning Outcomes

After completing this project, I gained practical experience with:

* Annotation-based bean configuration
* Automatic component scanning
* Constructor-based dependency injection
* Spring IoC Container
* Bean discovery using `@Component`
* Automatic wiring using `@Autowired`
* Replacing XML bean definitions with annotations

---

# 📚 Comparison

| Manual DI                 | Spring XML           | Spring Annotations               |
| ------------------------- | -------------------- | -------------------------------- |
| `new` keyword             | `<bean>` definitions | `@Component`                     |
| Manual wiring             | XML wiring           | Automatic wiring                 |
| Java code creates objects | XML creates objects  | Spring scans and creates objects |

---

# 🔜 Next Steps

The next project in this learning journey is:

**Spring Java-Based Configuration**

Topics to explore:

* `@Configuration`
* `@Bean`
* `AnnotationConfigApplicationContext`
* Removing XML completely

---

# 📂 Repository Purpose

This repository is part of my structured journey to learn the Spring Framework from fundamentals before moving to Spring Boot, Spring Data JPA, Spring Security, and Microservices.
