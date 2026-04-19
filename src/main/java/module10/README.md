.

📁 module-10-relationships/README.md
# 📘 Module 10: Object Relationships (Aggregation & Composition)

---

## 🎯 Learning Objectives
In this module, you will:
- Understand how objects relate to each other
- Learn the difference between aggregation and composition
- Model real-world relationships in code
- Improve your object-oriented design skills

---

## 🎥 Video Sections

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch:
- 08:29:39 → 08:39:02 (Aggregation)
- 08:39:02 → 08:45:17 (Composition)

---

## 🧠 Key Concepts

### 🔹 Aggregation ("has-a" relationship)
- Objects can exist independently
- Example: A `School` has `Students`
- If school is deleted → students still exist

---

### 🔹 Composition ("part-of" relationship)
- Objects depend on the parent
- Example: A `Car` has an `Engine`
- If car is deleted → engine should not exist

---

## 🧪 Exercises

---

# 🔹 Part 1: Aggregation

## 🧩 Exercise 1: Create `Student`

Fields:
- name (String)

---

## 🧩 Exercise 2: Create `School`

Fields:
- name (String)
- students (array of Student)

**Rules:**
- Add method to count students
- Students exist independently of School

---

# 🔹 Part 2: Composition

## 🧩 Exercise 3: Create `Engine`

Fields:
- type (String)

---

## 🧩 Exercise 4: Create `Car`

Fields:
- model (String)
- engine (Engine)

**Rules:**
- Engine must be created inside Car (composition)

---

## 🧩 Exercise 5: Describe Car

Method:
- Return:

Model: X, Engine: Y


---

## ✅ What You Must Do

1. Implement all classes
2. Respect aggregation vs composition rules
3. Pass tests:

mvn test


---

## 💡 Tips

- Aggregation = pass objects into constructor
- Composition = create object inside class
- Think about object ownership

---

## 🚀 Goal

By the end of this module, you should:
- Understand object relationships
- Design better class structures
- Know when to use aggregation vs composition