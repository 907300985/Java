package cn.tedu.review.collection;

import java.util.Objects;

/**
 * @Date:2021/10/25 17:36
 * @Author:NANDI_GUO
 */
public class Student {
    private String name;
    private String tel;
    private int age;

    public Student(String name, String tel, int age) {
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(tel, student.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tel, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
