package com.webonise.examinationsystem;

public class Student {
    private int rollNo;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;

    public static Student newInstance(int rollNo, String name, int mark1, int mark2, int mark3) {
        if (rollNo > 0) {
            return new Student(rollNo, name, mark1, mark2, mark3);
        } else {
            return null;
        }
    }

    private Student(int rollNo, String name, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (rollNo != student.rollNo) return false;
        if (mark1 != student.mark1) return false;
        if (mark2 != student.mark2) return false;
        if (mark3 != student.mark3) return false;
        return name != null ? name.equals(student.name) : student.name == null;

    }

    @Override
    public int hashCode() {
        int result = rollNo;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + mark1;
        result = 31 * result + mark2;
        result = 31 * result + mark3;
        return result;
    }
}
