# 📘 Module 12: Exception Handling & File I/O

---

## 🎯 Learning Objectives
In this module, you will:
- Understand exceptions and error handling
- Use try-catch blocks
- Read from files
- Write to files
- Build more robust programs

---

## 🎥 Video Sections

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch:
- 09:05:29 → 09:13:28 (Exception Handling)
- 09:13:28 → 09:21:58 (Write Files)
- 09:21:58 → 09:30:00 (Read Files)

---

## 🧠 Key Concepts

### 🔹 Exceptions
Errors that occur during execution

---

### 🔹 try-catch
```java
try {
    // risky code
} catch (Exception e) {
    // handle error
}
🔹 File Writing
FileWriter writer = new FileWriter("file.txt");
🔹 File Reading
Scanner scanner = new Scanner(new File("file.txt"));
🧪 Exercises

👉 Implement all methods in:

FileExercises.java
🧩 Exercise 1: Safe Division

Method:

safeDivide(int a, int b)

Rules:

Return a / b
If division by zero → return 0
🧩 Exercise 2: Parse Integer

Rules:

Convert string to int
If invalid → return -1
🧩 Exercise 3: Write to File

Rules:

Write text to file
Return true if successful
🧩 Exercise 4: Read from File

Rules:

Read file content
Return as String
If error → return empty string
🧩 Exercise 5: Count Lines in File

Rules:

Return number of lines
If error → return 0
✅ What You Must Do
Implement all methods
Use try-catch properly
Close resources
Run:
mvn test
💡 Tips
Always handle exceptions
Use try-with-resources if possible
File paths must be valid
🚀 Goal

By the end of this module, you should:

Handle runtime errors confidently
Work with files safely
Write robust Java programs