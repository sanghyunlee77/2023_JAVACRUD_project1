package org.example;

public class Student {
    private String hno;
    private String name;

    public Student(){    // 생성자가 아무것도 없는게 필요하면 다른 생성자 존재시 만들어야 한다. 아무것도 없으면 만들지 않아도 된다.
    }

    public Student(String hno, String name) {
        this.hno = hno;
        this.name = name;
    }

    public String getHno() {
        return hno;
    }

    public String getName() {
        return name;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hno='" + hno + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
