# 📘 Module 05: Strings & Text Processing

---

## 🎯 Learning Objectives
In this module, you will:
- Work with Java `String` methods
- Use `substring`, `length`, and indexing
- Validate and format text
- Solve real-world string problems

---

## 🎥 Video

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections:
- 02:10:20 → 02:27:00
- 02:35:19 → 02:41:10

👉 Watch in parts and practice immediately.

---

## 🧠 Key Concepts

### 🔹 String basics
```java
String text = "Hello";
🔹 length()
text.length()
🔹 substring()
text.substring(start, end)
🔹 contains()
text.contains("@")
🔹 equals()
text.equals("hello")
🧪 Exercises

👉 Implement all methods in:

StringExercises.java
🔹 Part 1: Core String Problems
🧩 Exercise 1: Extract Middle Name

Method:

extractMiddleName(String fullName)

Rules:

Return middle name(s)
If no middle name → return empty string
🧩 Exercise 2: Validate ID Prefix

Rules:

Must start with "ZA"
Followed by exactly 4 digits
🧩 Exercise 3: Remove Protocol

Rules:

Remove "http://" or "https://"
Return remaining URL
🔹 Part 2: Validation & Formatting
🧩 Exercise 4: Palindrome

Rules:

Return true if string reads same backward
🧩 Exercise 5: Format Phone Number

Rules:

Must be 10 digits
Format: (XXX) XXX-XXXX
Else → "Invalid phone number"
🧩 Exercise 6: Validate Email

Rules:

Exactly one "@"
Ends with .com or .org
🧩 Exercise 7: Capitalize First Letter

Rules:

Capitalize first character only
Handle empty string
🧩 Exercise 8: Extract Domain

Rules:

Remove protocol if present
Return domain only
✅ What You Must Do
Implement all methods
Use substring where required
Handle edge cases
Run:
mvn test
💡 Tips
Watch out for index errors
Strings are immutable (you create new ones)
Always check length before substring
🚀 Goal

By the end of this module, you should:

Manipulate strings confidently
Validate user input
Solve real-world text problems