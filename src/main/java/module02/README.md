# 📘 Module 02: Conditionals (`if / else`)

---

# 🎯 Learning Objectives

In this module, you will learn how Java programs make decisions based on different conditions.

By the end of this module, you should be able to:

* Understand decision-making in programming
* Use `if`, `else if`, and `else` statements correctly
* Apply comparison operators like `>`, `<`, `>=`, `<=`, `==`, and `!=`
* Solve practical real-world logic problems
* Handle edge cases carefully
* Return precise formatted outputs

---

# 🎥 Video Resource

https://youtu.be/xTtL8E4LzTQ

### ⏱ Focus Sections:

* `00:01:09 → 00:01:22`
* `00:01:27 → 00:01:56`

### Recommended Study Method:

### 👉 Watch → Pause → Code → Test → Repeat

Do not binge-watch.
Practical repetition builds mastery.

---

# 🧠 Core Concepts

---

## 🔹 Basic `if` Statement

Used when code should only run if a condition is true.

```java
if (condition) {
    // Executes only if condition is true
}
```

### Real-Life Example:

If it is raining, take an umbrella.

```java
if (raining) {
    takeUmbrella();
}
```

---

## 🔹 `if / else`

Used when there are two possible outcomes.

```java
if (condition) {
    // true case
} else {
    // false case
}
```

### Real-Life Example:

If you are over 18, enter the club. Otherwise, stay outside.

---

## 🔹 `if / else if / else`

Used when multiple conditions are possible.

```java
if (condition1) {
    // first condition
} else if (condition2) {
    // second condition
} else {
    // default
}
```

### Real-Life Example:

Weather:

* Hot
* Mild
* Cold

---

# 🔹 Comparison Operators

| Operator | Meaning               |
| -------- | --------------------- |
| `>`      | Greater than          |
| `<`      | Less than             |
| `>=`     | Greater than or equal |
| `<=`     | Less than or equal    |
| `==`     | Equal                 |
| `!=`     | Not equal             |

---

# 🧪 Practical Exercises

---

# 📂 File to Implement:

```java
ConditionExercises.java
```

---

# 🧩 Exercise 1: Temperature Alert

## Function:

```java
exercise1_temperatureAlert(int temperature)
```

## 📖 Detailed Description:

This function checks whether the current temperature is considered hot.

### Rules:

* If temperature is **greater than 30°C** → return:

```java
"It's hot!"
```

* Otherwise:

```java
"It's not hot."
```

## 🌍 Real-Life Example:

A weather app may warn users when outdoor temperatures are dangerously high.

## 📥 Input:

* Integer temperature value

## 📤 Output:

* String message

## 🧪 Example Test Cases:

| Input | Output          |
| ----- | --------------- |
| 25    | "It's not hot." |
| 30    | "It's not hot." |
| 35    | "It's hot!"     |

## ⚠ Edge Cases:

* Exactly `30` is NOT hot
* Negative temperatures should still return `"It's not hot."`

---

# 🧩 Exercise 2: Age Verification

## Function:

```java
exercise2_ageVerification(int age)
```

## 📖 Detailed Description:

This function verifies whether a person is legally old enough for access.

### Rules:

* If age is **18 or older**:

```java
"Access granted"
```

* Otherwise:

```java
"Access denied"
```

## 🌍 Real-Life Example:

Website age restrictions, voting eligibility, or driving licenses.

## 📥 Input:

* Integer age

## 📤 Output:

* Access status string

## 🧪 Example Test Cases:

| Input | Output           |
| ----- | ---------------- |
| 17    | "Access denied"  |
| 18    | "Access granted" |
| 25    | "Access granted" |

## ⚠ Edge Cases:

* Age exactly `18` must grant access
* Negative ages should still deny access

---

# 🧩 Exercise 3: Even or Odd

## Function:

```java
exercise3_evenOrOdd(int number)
```

## 📖 Detailed Description:

Determine whether a number is divisible by 2.

### Rules:

* If even:

```java
"X is even"
```

* If odd:

```java
"X is odd"
```

(`X` should be replaced by the actual number)

## 🌍 Real-Life Example:

Checking table seat numbers, row positions, or alternating systems.

## 📥 Input:

* Integer number

## 📤 Output:

* Formatted string

## 🧪 Example Test Cases:

| Input | Output      |
| ----- | ----------- |
| 4     | "4 is even" |
| 7     | "7 is odd"  |
| 0     | "0 is even" |

## ⚠ Edge Cases:

* Zero is even
* Negative numbers can also be even or odd

---

# 🧩 Exercise 4: Discount Calculator

## Function:

```java
exercise4_discountCalculator(double price)
```

## 📖 Detailed Description:

Calculate customer discounts based on purchase amount.

### Rules:

### If price > 1000:

* 20% discount

### If price is between 500 and 1000:

* 10% discount

### If price < 500:

* No discount

## 📤 Output Format:

```java
Discount: X%, Final price: RXXXX.XX
```

## 🌍 Real-Life Example:

Retail stores offering bulk purchase discounts.

## 📥 Input:

* Product price as double

## 🧪 Example Test Cases:

| Input | Output                              |
| ----- | ----------------------------------- |
| 1200  | Discount: 20%, Final price: R960.00 |
| 750   | Discount: 10%, Final price: R675.00 |
| 300   | Discount: 0%, Final price: R300.00  |

## ⚠ Edge Cases:

* Exactly `1000` gets 10%
* Exactly `500` gets 10%
* Use `String.format()` for currency formatting

---

# 🧩 Exercise 5: Weather Advisor

## Function:

```java
exercise5_weatherAdvisor(int temperature)
```

## 📖 Detailed Description:

Provide weather advice based on temperature range.

### Rules:

* Above 30:

```java
"It's hot!"
```

* Between 15 and 30:

```java
"It's mild."
```

* Below 15:

```java
"It's cold."
```

## 🌍 Real-Life Example:

Weather forecast applications.

## 📥 Input:

* Integer temperature

## 📤 Output:

* Weather condition string

## 🧪 Example Test Cases:

| Input | Output       |
| ----- | ------------ |
| 35    | "It's hot!"  |
| 20    | "It's mild." |
| 10    | "It's cold." |

## ⚠ Edge Cases:

* `15` = mild
* `30` = mild

---

# 🧩 Exercise 6: Age Group

## Function:

```java
exercise6_ageGroup(int age)
```

## 📖 Detailed Description:

Categorize people into age groups.

### Rules:

* Under 13:

```java
"Child"
```

* 13 to 19:

```java
"Teen"
```

* 20 and above:

```java
"Adult"
```

## 🌍 Real-Life Example:

School systems, social apps, marketing demographics.

## 📥 Input:

* Integer age

## 📤 Output:

* Category string

## 🧪 Example Test Cases:

| Input | Output  |
| ----- | ------- |
| 10    | "Child" |
| 15    | "Teen"  |
| 25    | "Adult" |

## ⚠ Edge Cases:

* `13` = Teen
* `19` = Teen
* `20` = Adult

---

# ✅ Requirements Checklist

Before moving on:

* [ ] Implement all methods
* [ ] Follow exact return strings
* [ ] Test all boundary conditions
* [ ] Run:

```bash
mvn test
```

---

# 💡 Important Tips

### Use modulus for even/odd:

```java
number % 2 == 0
```

### Use `String.format()` for pricing:

```java
String.format("Discount: %d%%, Final price: R%.2f", discount, finalPrice);
```

### Be careful with:

* Greater than vs greater than or equal
* Exact formatting
* Boundary values

---

# 🚀 Final Goal

By completing this module, you should confidently:

* Build decision-making logic
* Write clean conditional statements
* Handle multiple scenarios
* Understand real-world programming logic
* Improve debugging skills
* Prepare for larger Java applications

---

# 🏆 Success Mindset

Conditionals are the foundation of intelligent software.

Every major application—from banking systems to games to robotics—depends on decision-making.

Master this module thoroughly before progressing.
