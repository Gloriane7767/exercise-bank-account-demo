package com.gloriane;

// ===================== Exercise 3 =====================
    // Fields
public class Student {
    private int studentId;
    private String name;
    private int age;
    private String major;

    // Parameterized constructor
    public Student(int studentId, String name, int age, String major) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setMajor(major);
    }

    // Getters/Setters
    public int getStudentId(){
        return studentId;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentId(int studentId) {
        if (studentId > 0) {
            this.studentId = studentId;
        }
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public void setMajor(String major) {
        if(major == null || major.trim().isEmpty()) {
            throw new IllegalArgumentException("Major cannot be null or empty");
        }
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", name='" + name + "', age=" + age + ", major='" + major + "'}";
    }
}

