# 📘 Module 08: Varargs & Enhanced Switch

---

## 🎯 Learning Objectives
In this module, you will:
- Understand and use varargs (`...`)
- Work with enhanced switch expressions
- Write cleaner and more flexible methods
- Combine logic with modern Java syntax

---

## 🎥 Videos

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections:
- 05:28:07 → 05:34:36 (Varargs)
- 02:49:05 → 02:57:42 (Enhanced Switch)

👉 Practice immediately after each section.

---

## 🧠 Key Concepts

### 🔹 Varargs (Variable Arguments)

Allows passing multiple values:

```java
public static int sum(int... numbers) {
    return 0;
}

You can treat numbers like an array.

🔹 Enhanced Switch

Cleaner and safer:

String result = switch(day) {
    case "MONDAY", "TUESDAY" -> "Weekday";
    case "SATURDAY", "SUNDAY" -> "Weekend";
    default -> "Unknown";
};
🧪 Exercises

👉 Implement all methods in:

VarargsSwitchExercises.java
🧩 Exercise 1: Sum Numbers (Varargs)

Method:

sumNumbers(int... numbers)

Rules:

Return sum of all numbers
If empty → return 0
🧩 Exercise 2: Find Max (Varargs)

Rules:

Return maximum value
If no numbers → return Integer.MIN_VALUE
🧩 Exercise 3: Count Even Numbers (Varargs)

Rules:

Count how many numbers are even
🧩 Exercise 4: Day Type (Enhanced Switch)

Rules:

MONDAY–FRIDAY → "Weekday"
SATURDAY–SUNDAY → "Weekend"
Else → "Invalid day"
🧩 Exercise 5: Grade Evaluator (Enhanced Switch)

Rules:

A → "Excellent"
B → "Good"
C → "Average"
D → "Poor"
F → "Fail"
Default → "Invalid grade"
🧩 Exercise 6: Simple Calculator (Enhanced Switch)

Rules:

"+", "-", "*", "/" supported
Return result
Division by 0 → return 0
🧩 Exercise 7: Month Days (Enhanced Switch)

Rules:

Return number of days
February = 28
Invalid month → -1
✅ What You Must Do
Implement all methods
Use varargs where required
Use enhanced switch (not if/else)
Run:
mvn test
💡 Tips
Varargs = array internally
Switch is cleaner than many if/else blocks
Always handle edge cases
🚀 Goal

By the end of this module, you should:

Use varargs confidently
Write modern switch expressions
Handle flexible inputs cleanly