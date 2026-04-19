# 📘 Module 06: Advanced Loops & Method Overloading

---

## 🎯 Learning Objectives
In this module, you will:
- Understand method overloading
- Use `break` and `continue` effectively
- Work with arrays inside loops
- Write cleaner and more flexible methods

---

## 🎥 Video

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections:
- 04:19:51 → 04:30:57
- 05:03:26 → 05:28:07

👉 Watch in parts and practice after each section.

---

## 🧠 Key Concepts

### 🔹 Method Overloading

Same method name, different parameters:

```java
printNumbers(int n)
printNumbers(int start, int end)
printNumbers(int n, String prefix)
🔹 break vs continue
break → stops loop completely
continue → skips current iteration
🔹 Working with arrays
for (int num : arr) {
    // process each element
}
🧪 Exercises

👉 Implement all methods in:

AdvancedLoopExercises.java
🔹 Part 1: Overloaded Methods
🧩 Exercise 1: printNumbers(int n)

Rules:

Print numbers from 1 → n
Skip multiples of 3 (continue)
Return as comma-separated string
🧩 Exercise 2: printNumbers(int start, int end)

Rules:

Print from start → end
Stop at first multiple of 5 (break)
Include the multiple of 5
🧩 Exercise 3: printNumbers(int n, String prefix)

Rules:

Print 1 → n
Skip even numbers
Add prefix to each number
🔹 Part 2: Array-Based Methods
🧩 Exercise 4: printArray(int[] arr)

Rules:

Skip negative numbers
Return as string
🧩 Exercise 5: printArray(int[] arr, int threshold)

Rules:

Print numbers < threshold
Stop at first number ≥ threshold
🧩 Exercise 6: printArray(String[] arr, String prefix)

Rules:

Skip strings starting with "ignore"
Add prefix to others
✅ What You Must Do
Implement all methods
Use correct loop control
Follow output formatting
Run:
mvn test
💡 Tips
Reuse logic where possible
Be careful with commas in output
Think about stopping conditions
🚀 Goal

By the end of this module, you should:

Understand method overloading
Control loops precisely
Work with arrays confidently