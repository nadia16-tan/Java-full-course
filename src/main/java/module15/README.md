# 📘 Module 15: UDP Socket Programming

---

## 🎯 Learning Objectives

In this module, you will:

* Understand UDP communication
* Send and receive datagrams
* Compare TCP vs UDP

---

## 🎥 Video Sections

https://youtu.be/A5fFxs_DUsQ

### ⏱ Watch:

* First ~5 minutes (UDP basics)

---

## 🧠 Key Concepts

### 🔹 UDP Socket

```java
DatagramSocket socket = new DatagramSocket();
```

### 🔹 Sending Packet

```java
DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
socket.send(packet);
```

### 🔹 Receiving Packet

```java
socket.receive(packet);
```

---

## 🧪 Exercises

👉 Implement all methods in:

UDPSocketExercises.java

---

### 🧩 Exercise 1: Create UDP Socket

* Create a DatagramSocket
* Return: "Socket created"

---

### 🧩 Exercise 2: Send Packet

* Simulate sending "Hello UDP"
* Return: "Packet sent"

---

### 🧩 Exercise 3: Receive Packet

* Simulate receiving data
* Return: "Packet received"

---

### 🧩 Exercise 4: Connectionless Concept

* Return: "No connection needed"

---

### 🧩 Exercise 5: UDP Communication

* Simulate send + receive
* Return: "Hello UDP"

---

## ✅ What You Must Do

* Implement all methods
* Use DatagramSocket and DatagramPacket

Run:
mvn test

---

## 💡 Tips

* UDP is connectionless
* Faster but unreliable

---

## 🚀 Goal

* Understand UDP and how it differs from TCP
