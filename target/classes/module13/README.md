# 📘 Module 13: Advanced Java Concepts

---

## 🎯 Learning Objectives
In this module, you will:
- Work with dates and times
- Understand anonymous classes
- Use TimerTask for scheduling tasks
- Apply advanced Java patterns

---

## 🎥 Video Sections

https://youtu.be/xTtL8E4LzTQ

### ⏱ Watch:
- 10:11:42 → 10:20:24 (Dates & Times)
- 10:20:24 → 10:25:23 (Anonymous Classes)
- 10:25:23 → 10:35:00 (TimerTasks)

---

## 🧠 Key Concepts

### 🔹 Dates & Times
```java
LocalDate now = LocalDate.now();
LocalTime time = LocalTime.now();
🔹 Anonymous Classes
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Running");
    }
};
🔹 TimerTask
TimerTask task = new TimerTask() {
    public void run() {
        System.out.println("Task executed");
    }
};
🧪 Exercises

👉 Implement all methods in:

AdvancedJavaExercises.java
🧩 Exercise 1: Get Current Date

Method:

getCurrentDate()

Rules:

Return current date as String
🧩 Exercise 2: Get Current Time

Rules:

Return current time as String
🧩 Exercise 3: Format Date

Rules:

Format date as: dd-MM-yyyy
🧩 Exercise 4: Anonymous Runnable

Rules:

Create and run anonymous Runnable
Return "Running"
🧩 Exercise 5: TimerTask Execution

Rules:

Simulate a scheduled task
Return "Task executed"
✅ What You Must Do
Implement all methods
Use correct APIs
Keep code simple
Run:
mvn test
💡 Tips
Use LocalDate, LocalTime
Use DateTimeFormatter
Anonymous classes don’t need names
🚀 Goal

By the end of this module, you should:

Handle dates and time
Use anonymous classes
Understand scheduled tasks