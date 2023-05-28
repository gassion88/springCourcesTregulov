package org.gassion.aop;

public class Student {
    private String nameSurname;
    private int course;
    private double avg;

    public Student(String nameSurname, int course, double avg) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avg = avg;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avg=" + avg +
                '}';
    }
}
