package org.atuluttam;

public class Student {

    private int roll;
    private String name;
    private String course;

    private Laptop laptop;

    public Student(Laptop laptop) {
        this.laptop = laptop;
    }

    public Student() {
        System.out.println("Student Object Created!!!");
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public void doAssignment()
    {
        System.out.println("I am doing Assignment!!!");
        laptop.code();
    }
}
