# 📘 Module 14: TCP Socket Programming

---

## Learning Outcomes Assessed

* TCP Networking Fundamentals
* Client-Server Architecture
* ServerSocket Usage
* Socket Connections
* Input/Output Streams
* Network Communication
* Message Transmission
* Message Reception
* Connection Lifecycle
* Java Network Programming

---

## Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java id="m4v8qx"
TCPSocketExercises.java
```

---

## Your Task

For this module, you must:

* Understand how TCP networking works
* Build server-side socket logic
* Build client-side socket logic
* Simulate data transmission
* Simulate receiving messages
* Understand communication flow
* Use Java networking APIs
* Return exact required outputs
* Pass all tests successfully

---

## Your Goal

For each function:

* Use valid Java syntax
* Understand socket behavior
* Simulate realistic communication
* Follow exact return formats
* Practice networking concepts safely
* Build foundational backend communication skills
* Ensure all unit tests pass

---

## How to Run Your Tests

### Run all tests:

```bash id="x7m3pk"
mvn test
```

### Run module tests:

```bash id="q2v9zt"
mvn test -Dtest=TCPSocketExercisesTest
```

---

# 🧠 Core Networking Concepts

---

# 🔹 What Is TCP?

TCP (Transmission Control Protocol) is a reliable communication protocol that allows devices to exchange data over a network.

---

### Key Features:

* Reliable
* Ordered
* Connection-based
* Error-checked

---

### Real-World Examples:

* Web servers
* Chat apps
* Multiplayer games
* APIs
* Banking systems
* Messaging platforms

---

# 🔹 Client-Server Model

---

### Server:

Waits for incoming connections.

---

### Client:

Initiates connection to server.

---

### Real-World Analogy:

A restaurant:

* Server = kitchen waiting for orders
* Client = customer placing orders

---

# 🔹 Java Networking Components

### Server:

```java id="p8v4qt"
ServerSocket
```

---

### Client:

```java id="r5m7zx"
Socket
```

---

### Communication:

```java id="t3v8kp"
BufferedReader
PrintWriter
```

---

# 🧪 Project Structure

```plaintext id="w9m2qx"
module14/
├── TCPSocketExercises.java
├── tests/
│   └── TCPSocketExercisesTest.java
└── README.md
```

---

# Question 1 - Create Server

## Function:

```java id="f4v9mr"
exercise1_createServer()
```

---

### Detailed Objective:

Simulate the creation of a TCP server that listens for incoming client connections on port `5000`.

---

### Rules:

* Create a `ServerSocket`
* Use port `5000`
* Return:

```plaintext id="j8m3qt"
Server created
```

---

### Why This Matters:

Servers power:

* Websites
* APIs
* Chat systems
* Multiplayer servers
* Banking backends

---

### Developer Skill Built:

* Server creation
* Port understanding
* Network listening

---

# Question 2 - Create Client

## Function:

```java id="k7v4zx"
exercise2_createClient()
```

---

### Detailed Objective:

Simulate a client connecting to a local server.

---

### Rules:

* Connect to `localhost`
* Use port `5000`
* Return:

```plaintext id="n5m8qp"
Client connected
```

---

### Real-World Context:

Clients include:

* Browsers
* Mobile apps
* Desktop apps
* IoT devices

---

### Developer Skill Built:

* Client-side networking
* Host/port concepts
* Connection establishment

---

# Question 3 - Send Message

## Function:

```java id="s4v7kt"
exercise3_sendMessage()
```

---

### Detailed Objective:

Simulate sending a message from client to server.

---

### Rules:

* Message:

```plaintext id="u8m2qx"
Hello Server
```

* Return:

```plaintext id="v3m9pk"
Message sent
```

---

### Why:

Sending data is essential for:

* Login systems
* APIs
* Chat apps
* Game state updates

---

### Developer Skill Built:

* Output streams
* Communication logic
* Request simulation

---

# Question 4 - Receive Message

## Function:

```java id="y6v4zt"
exercise4_receiveMessage()
```

---

### Detailed Objective:

Simulate receiving data from another socket endpoint.

---

### Rules:

* Simulate successful reception
* Return:

```plaintext id="c8m5qr"
Message received
```

---

### Real-World Examples:

* Receiving chat messages
* API responses
* Notifications
* Server acknowledgments

---

### Developer Skill Built:

* Input streams
* Data reception
* Communication cycles

---

# Question 5 - Full Communication

## Function:

```java id="b4v8xp"
exercise5_fullCommunication()
```

---

### Detailed Objective:

Simulate complete TCP communication where:

* Client connects
* Client sends:

```plaintext id="g7m2qt"
Hello Server
```

* Server receives message
* Return:

```plaintext id="l9v3zx"
Hello Server
```

---

### Why This Matters:

This mirrors actual systems such as:

* Messaging apps
* Client-server applications
* APIs
* Distributed systems
* Multiplayer game servers

---

### Developer Skill Built:

* Full communication cycle
* Request/response logic
* Networking flow understanding

---

# 💡 Key Developer Tips

* Always close sockets
* Use `try-catch`
* Prevent port conflicts
* Understand localhost
* Streams manage communication
* TCP is connection-oriented
* Simulations help build understanding
* Networking is foundational for backend systems

---

# 🔹 Professional Mindset

Networking is one of the most important software engineering skills.

---

### Beginner:

Writes local-only applications.

### Professional:

Builds systems that communicate across machines.

---

# 🚀 End Goal

By completing this module, you should:

* Understand TCP deeply
* Build basic client/server systems
* Use Java sockets confidently
* Understand network architecture
* Simulate communication safely
* Prepare for distributed systems
* Strengthen backend engineering skills
* Move closer to real-world software development

---

# 🏆 Success Mindset

Mastering TCP socket programming prepares you for:

* Backend development
* API engineering
* Multiplayer game development
* Chat applications
* Distributed systems
* DevOps infrastructure
* Enterprise networking

This module introduces one of the most critical foundations of modern software engineering: communication between systems.
