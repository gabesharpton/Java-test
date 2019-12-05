# Java-test

>OpenJDK is open source

**Misconceptions:**
---
No relation to Javascript- completely unrelated.
At one point it was the old annoying plug in.
---
**What it is:**
---
Java belongs to Oracle
Popular Backend language
It is a programming language but it is also, Runtime environment and Standard library.
Runtime Environment - place where java code is executed they abstract from the other 2 portions.
Standard library- contains much reusable functionalities which you can use in your apps so you don’t have to reinvent the wheel.
Those three points are called the Java Development Kit (JDK)

Application source code compiles to Application Bytecode. 
Most apps use third-party libraries, not just Java SE APIs.
You also need a JVM to run java programs
Java byte code is not machine code, it is a higher-level intermediate form that can be translated by the JVM to actual machine code.


First, you declare a class function ie public class Hello {}
The main method is inside {}. 
A method within {} groups statements that can be executed.

**How to compile:**
---
>Javac(<== run this in terminal) is the java compiler tool.
Bytecode sits on top of the standard library and we need a JVM to run the code.

**Philosophy:**
---
Portability - should be able to run on any platform, OS or hardware.
WORA - Write Once Run Anywhere
JVM for each OS/architecture
Java SE APIs platform-agnostic
Bytecode is portable

- *Reading code is more important than writing code*
- Maintainability over terseness
- Understandable code over clever code
- Java is quite conservative
>‘First, do no harm’
---
Increase Developer productivity and maintaining simplicity is for new java features
Existing code on new JVM should still run on updated code.
Java is good about controlled deprecation
---
**Why is it good to use Java?:**
---
Popularity about 10 million Java developers
Web-applications Backend services 
Data-intensive application
---
**Scalable Development:**
---
Hierarchical and structured codebases
{Modules{packages{classes}}}
Established coding practices
Strong tooling
Wealth of libraries
---
**Productivity: Manage runtime**
---
Automatic memory management - It all handles where and when to allocate memory in and code were to free memory.
Garbage collection - Before you run out of memory it will scan old memory and determine which is still in use and what is not.
Multi-threading

**When not to use Java:**
---
Real-time Systems - Self-driving cars or schedule as it might not be instant
Tight operating system integration - if u need low-level code to access to the operating system (device drivers) C or C++ is a better choice for this.

Quick prototyping
It’s not cutting-edge language. Not for the devs that like the new shiny features

**Compared to Javascript:**
---
Javascript is born in the browser, NodeJS took JS out of the browser and into servers
It uses NodeJS to manage runtime
They are somewhat syntactically similar
JS is an interpreted language no compilation step
Not statically typed
Single-threaded
You’ll have to launch multiple processes in coordination that are more expensive and harder than in Java.
===
**Desktop java:**
---
Apps that run on Single machine, interactive applications
Apps that have a GUI

*Abstract Windowing Toolkit*
---
- AWT is a GUI toolkit
- Native OS controls
- Simple graphics (primitives)

*Swing*
---
- Pure Java GUI
- Cross-platform look and feels
- MVC model-view-contoller design pattern.
- A bit slower than AWT but not a huge deal

Common to mix AWT and Swing components

*JavaFX*
---
- Declarative UIs: FXML
- There can be external tools to make GUIs
- Advanced components they support animations and effects
- Skinnable with CSS, you can use CSS in this
- 3D Graphics
- JavaFX was exported from stand libraries, OpenJFX is open-source.

**Java EE (enterprise edition):**
---
Some API help with data persistence, others help develop web apps
Also, Securit, messaging and JSON/XML handling

Java EE application server
Must implement java persistence architecture - storing and retrieving data from relational databases and transforming to objects in-app.
Enterprise Java Beans

Ear enterprise archive
War Web archive can develop multiple applications

Java EE application servers - Wildfly (red hat), WebSphere (IBM), WebLogic(Oracle), Tomcat (Apache (opensource)).
Jakarta EE is something you should check out

---
**Java in the Cloud:**
---
Data center like Wildfly or WebSphere
Microservices in the cloud
Microframeworks
Spring boot - built on top of spring and most popular is Netflix Libraries
MicroProfile
Vert.x
Play Framework

Java != Android Java
Java Language (7, subsets of 8)
Still compiled into Java Bytecode instead it runs in DEX (Dalvik Executable Format)
Android APIs and Java SEish API
You use the Dalvik Virtual Machine instead of Java Virtual Machine
---
**Spring Framework:**
---
Most popular Java libraries, It is open-source too.
J2EE Development without EJB - Rod Johnson(book to read)
