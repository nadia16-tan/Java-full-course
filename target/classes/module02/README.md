# 📘 Module 02: Conditionals (if / else)

---

## 🎯 Learning Objectives
In this module, you will:
- Understand how decision-making works in Java
- Use `if`, `else if`, and `else`
- Apply logical comparisons
- Solve real-world problems using conditions

---

## 🎥 Video

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections Only:
- 00:01:09 → 00:01:22
- 00:01:27 → 00:01:56

👉 Do NOT watch everything at once.  
👉 Watch → Pause → Code → Test → Repeat.

---

## 🧠 Key Concepts

### 🔹 Basic if statement
```java
if (condition) {
    // code runs if condition is true
}
🔹 if / else
if (condition) {
    // true case
} else {
    // false case
}
🔹 if / else if / else
if (condition1) {
    // first condition
} else if (condition2) {
    // second condition
} else {
    // default
}
🔹 Comparison Operators
Operator	Meaning
>	greater than
<	less than
>=	greater or equal
<=	less or equal
==	equal
!=	not equal
🧪 Exercises

👉 Implement all methods inside:

ConditionExercises.java
🧩 Exercise 1: Temperature Alert

Check if temperature is above 30°C.

Rules:

If temperature > 30 → return "It's hot!"
Otherwise → return "It's not hot."

Examples:

Input: 25 → "It's not hot."
Input: 30 → "It's not hot."
Input: 35 → "It's hot!"
🧩 Exercise 2: Age Verification

Rules:

If age >= 18 → "Access granted"
Else → "Access denied"
🧩 Exercise 3: Even or Odd

Rules:

If number is even → "X is even"
Else → "X is odd"
🧩 Exercise 4: Discount Calculator

Apply discounts:

1000 → 20%

500–1000 → 10%
< 500 → 0%

Output format:

Discount: X%, Final price: RXXXX.XX
🧩 Exercise 5: Weather Advisor

Rules:

30 → "It's hot!"

15–30 → "It's mild."
< 15 → "It's cold."
🧩 Exercise 6: Age Group

Rules:

< 13 → "Child"
13–19 → "Teen"
≥ 20 → "Adult"
✅ What You Must Do
Implement all methods
Follow exact return formats
Run:
mvn test
💡 Tips
Use % for even/odd
Use String.format() for clean output
Be careful with boundaries (e.g., 30 is NOT hot)
🚀 Goal

By the end of this module, you should:

Be comfortable writing conditional logic
Handle edge cases correctly