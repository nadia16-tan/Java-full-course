# 📘 Module 04: Methods (Functions)

---

## 🎯 Learning Objectives
In this module, you will:
- Understand how to define and use methods in Java
- Work with parameters and return values
- Break problems into reusable pieces
- Write cleaner and more structured code

---

## 🎥 Video

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch This Section:
- 00:04:04 → 00:04:19

👉 Watch → Pause → Code → Test

---

## 🧠 Key Concepts

### 🔹 What is a method?

A method is a reusable block of code.

```java
public static int add(int a, int b) {
    return a + b;
}
🔹 Method Structure
returnType methodName(parameters)

Example:

public static boolean isEven(int number)
🔹 Return vs void
return → gives back a value
void → returns nothing
🔹 Why methods matter

Instead of repeating logic:

Write once ✅
Reuse anywhere ✅
🧪 Exercises

👉 Implement all methods in:

MethodExercises.java
🧩 Exercise 1: CheckEven

Method:

CheckEven(int num)

Rules:

Return true if even
Else return false
🧩 Exercise 2: GreetUser

Method:

GreetUser(String name)

Rules:

Return "Hello, name!"
🧩 Exercise 3: CalculateSum

Method:

CalculateSum(int a, int b)

Rules:

Return sum of a and b
🧩 Exercise 4: FindMax

Method:

FindMax(int a, int b)

Rules:

Return the larger number
If equal → return either
🧩 Exercise 5: IsPrime

Method:

IsPrime(int num)

Rules:

Return true if prime
Else return false
✅ What You Must Do
Implement all methods
Return correct values
Handle edge cases
Run:
mvn test
💡 Tips
Prime numbers:
Only divisible by 1 and itself
0 and 1 are NOT prime
Use loops inside methods
🚀 Goal

By the end of this module, you should:

Understand how methods work
Be able to write reusable logic
Solve problems using clean functions