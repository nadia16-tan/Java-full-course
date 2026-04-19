# 📘 Module 11: Wrapper Classes, Collections & Enums

---

## 🎯 Learning Objectives
In this module, you will:
- Understand wrapper classes (Integer, Double, etc.)
- Use ArrayList and HashMap
- Work with enums for fixed values
- Store and manage collections of data

---

## 🎥 Video Sections

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch:
- 08:45:17 → 08:55:51 (Wrapper Classes & ArrayList)
- 10:52:09 → 11:02:38 (HashMap & Enums)

---

## 🧠 Key Concepts

### 🔹 Wrapper Classes
Convert primitives into objects:
```java
Integer x = 5;
Double y = 3.14;
🔹 ArrayList

Dynamic array:

ArrayList<Integer> list = new ArrayList<>();
🔹 HashMap

Key-value storage:

HashMap<String, Integer> map = new HashMap<>();
🔹 Enum

Fixed set of constants:

enum Day {
    MONDAY, TUESDAY
}
🧪 Exercises

👉 Implement all methods in:

CollectionsExercises.java
🧩 Exercise 1: Wrapper Sum

Method:

sumWrapper(Integer a, Integer b)

Rules:

Return sum
If any is null → treat as 0
🧩 Exercise 2: ArrayList Filter

Rules:

Return only even numbers
Input: ArrayList<Integer>
🧩 Exercise 3: ArrayList to String

Rules:

Convert list to comma-separated string
🧩 Exercise 4: HashMap Lookup

Rules:

Given map and key
Return value or -1 if not found
🧩 Exercise 5: Count Frequencies

Rules:

Count occurrences of each word
Return HashMap<String, Integer>
🧩 Exercise 6: Enum Day Type

Rules:

Weekday or Weekend using enum
🧩 Exercise 7: Enum Grade

Rules:

A → Excellent
B → Good
etc.
✅ What You Must Do
Implement all methods
Use correct collection types
Handle nulls safely
Run:
mvn test
💡 Tips
ArrayList has .add(), .get(), .size()
HashMap has .put(), .get(), .containsKey()
Enums are type-safe
🚀 Goal

By the end of this module, you should:

Work with collections confidently
Store and retrieve structured data
Use enums effectively