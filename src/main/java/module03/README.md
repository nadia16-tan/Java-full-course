# 📘 Module 03: Loops (while, do-while, for)

---

## 🎯 Learning Objectives
In this module, you will:
- Understand repetition using loops
- Use `while`, `do-while`, and `for` loops
- Control loops using `break` and `continue`
- Solve problems that require repeated actions

---

## 🎥 Video

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections Only:
- 00:03:09 → 00:03:33 (while & do-while)
- 00:03:43 → 00:03:55 (for loops)

👉 Watch in parts. Practice after each section.

---

## 🧠 Key Concepts

### 🔹 while loop
Runs **while condition is true**

```java
int i = 0;
while (i < 5) {
    i++;
}
🔹 do-while loop

Runs at least once

do {
    // runs first
} while (condition);
🔹 for loop

Best when you know how many times to repeat

for (int i = 0; i < 5; i++) {
    // repeat
}
🔹 break

Stops the loop immediately

🔹 continue

Skips current iteration

🧪 Exercises

👉 Implement all methods in:

LoopExercises.java
🔁 While / Do-While Exercises
🧩 Exercise 1: Guessing Game (while loop)

Simulate guessing until correct.

Rules:

Keep counting attempts
Return attempts when guess == secret

Method Inputs:

int[] guesses
int secret

Example:

guesses = [5, 7], secret = 7 → return 2
🧩 Exercise 2: PIN Validator (do-while)

Rules:

Correct PIN = 1234
Keep checking until correct
Return number of attempts

Example:

[1111, 1234] → 2
🧩 Exercise 3: Sum of Numbers (while loop)

Rules:

Sum numbers until 0 appears
Stop when 0 is reached

Example:

[5, 3, 2, 0] → 10
🔁 For Loop Exercises
🧩 Exercise 4: Number Printer

Rules:

Print numbers from 1 → N
Skip multiples of 5
Return as comma-separated string

Example:

10 → "1, 2, 3, 4, 6, 7, 8, 9"
🧩 Exercise 5: Password Checker

Rules:

Max 3 attempts
Correct password = "secret"
Stop early if correct

Return:

"Access granted!" or "Access denied"
🧩 Exercise 6: Even Numbers

Rules:

Print even numbers from 1 → N
Use continue
Return as string

Example:

8 → "2, 4, 6, 8"
✅ What You Must Do
Implement all methods
Use correct loop type
Handle edge cases
Run:
mvn test
💡 Tips
Use arrays to simulate user input
Be careful with infinite loops
Think about stopping conditions
🚀 Goal

By the end of this module, you should:

Understand when to use each loop
Control loop flow using break/continue
Solve iterative problems confidently