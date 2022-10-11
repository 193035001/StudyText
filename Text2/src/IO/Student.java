package IO;

import java.io.Serial;
import java.io.Serializable;
/*
 Serializable,必须实现这个接口，不然报错异常
 如果不希望参与序列化（transient 游离的）
 */
public class Student implements Serializable {
    //手动写出序列号，不然以后无法修稿代码，
    @Serial
    private static final long serialVersionUID = 15448951L;
    private String name;
    private int no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", no=" + no +
                ']';
    }

    public Student() {
    }
}
