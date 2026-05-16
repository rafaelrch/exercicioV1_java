package entities;

import java.util.Objects;

public class Course {

    private Integer student;

    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    public Course(Integer student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(student, course.student);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(student);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
