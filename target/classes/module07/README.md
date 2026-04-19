# 📘 Module 07: Arrays + Strings (Combined Logic)

---

## 🎯 Learning Objectives
In this module, you will:
- Combine arrays and strings in one solution
- Process data step-by-step using loops
- Handle edge cases carefully
- Think more like a problem solver than just a coder

---

## 🎥 Video

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch These Sections:
- 05:03:26 → 05:28:07 (review if needed)

👉 Focus on applying logic, not just watching.

---

## 🧠 Key Concepts

### 🔹 Iterating over strings
```java
for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);
}
🔹 Working with arrays
for (String word : arr) {
    // process each word
}
🔹 Combining logic
Loop + condition + string manipulation
Break / continue when needed
🧪 Exercises

👉 Implement all methods in:

ArrayStringExercises.java
🧩 Exercise 1: splitString

Method:

splitString(String s, int length)

Rules:

Split string into chunks of given length
If remaining chars < length → include them
Return as String[]

Examples:

"hello world", 3 → ["hel", "lo ", "wor", "ld"]
"abcdefg", 2 → ["ab", "cd", "ef", "g"]
"short", 10 → ["short"]
🧩 Exercise 2: findLongestWord

Rules:

Return longest word in array
Skip empty strings
If tie → return first longest
🧩 Exercise 3: countVowels

Rules:

Count occurrences of vowels: a, e, i, o, u
Return array: [a, e, i, o, u]
Ignore non-letters

Examples:

"hello world" → [0,1,0,2,0]
"aeiou" → [1,1,1,1,1]
"bcdfg" → [0,0,0,0,0]
✅ What You Must Do
Implement all methods
Use loops correctly
Handle edge cases
Run:
mvn test
💡 Tips
Use substring() carefully
Check array bounds
Normalize case if needed (e.g., lowercase)
🚀 Goal

By the end of this module, you should:

Combine multiple concepts into one solution
Think step-by-step when solving problems
Handle real-world data processing tasks