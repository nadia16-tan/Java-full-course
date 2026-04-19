# 📘 Module 09: Object-Oriented Programming (OOP)

---

## 🎯 Learning Objectives
In this module, you will:
- Understand classes and objects
- Use constructors (including overloaded ones)
- Apply inheritance and method overriding
- Use encapsulation (getters/setters)
- Work with abstraction and interfaces
- Understand polymorphism

---

## 🎥 Video Sections

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch in Order (VERY IMPORTANT)

1. 06:41:47 → 07:01:45 (Classes + Constructors)
2. 07:01:45 → 07:14:07 (Overloading + Arrays of Objects)
3. 07:14:07 → 07:31:09 (Static + Inheritance)
4. 07:31:09 → 07:46:08 (super + Overriding + toString)
5. 07:51:58 → 08:07:44 (Abstraction + Interfaces)
6. 08:07:44 → 08:19:35 (Polymorphism)

👉 DO NOT rush this module.

---

## 🧠 Key Concepts

### 🔹 Class
Blueprint for objects

### 🔹 Constructor
Special method to initialize objects

### 🔹 Inheritance
One class extends another

### 🔹 Encapsulation
Private fields + getters/setters

### 🔹 Polymorphism
Same method, different behavior

---

## 🧪 Exercises Structure

This module is split into sections:

---

# 🔹 Part 1: Classes & Constructors

## 🧩 Exercise 1: Create a `Person` class

Fields:
- name (String)
- age (int)

Tasks:
- Default constructor
- Parameterized constructor
- Overloaded constructor (name only → age = 0)

---

# 🔹 Part 2: Encapsulation

## 🧩 Exercise 2: Add getters and setters

Rules:
- age cannot be negative
- if negative → set to 0

---

# 🔹 Part 3: Inheritance

## 🧩 Exercise 3: Create `Student` class

- Extends `Person`
- Field: grade (String)

---

# 🔹 Part 4: Method Overriding

## 🧩 Exercise 4: Override `toString()`

Format:

Name: John, Age: 20, Grade: A


---

# 🔹 Part 5: Abstraction

## 🧩 Exercise 5: Create abstract class `Animal`

Method:

makeSound()


---

# 🔹 Part 6: Interfaces

## 🧩 Exercise 6: Create interface `Playable`

Method:

play()


---

# 🔹 Part 7: Polymorphism

## 🧩 Exercise 7: Demonstrate polymorphism

- Create array of `Animal`
- Call `makeSound()`

---

## ✅ What You Must Do

1. Complete all classes
2. Follow OOP principles
3. Pass all tests:

mvn test


---

## 💡 Tips

- Use `this` keyword
- Use `super` in constructors
- Keep fields private

---

## 🚀 Goal

By the end of this module, you should:
- Understand OOP deeply
- Write structured Java programs
- Use inheritance and polymorphism confidently