package com.gloriane;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Alice Johnson", 20, "Computer Science");
        Student student2 = new Student("Bob Smith", 22, "Mathematics");
        Student student3 = new Student("Carol Davis", 19, "Biology");
        Student student4 = new Student("David Wilson", 21, "Engineering");

        System.out.println(student1.getStudent());
        System.out.println(student2.getStudent());
        System.out.println(student3.getStudent());
        System.out.println(student4.getStudent());
    }
}