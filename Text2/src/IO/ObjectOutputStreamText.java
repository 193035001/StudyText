package IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamText {
    public static void main(String[] args) throws Exception{
        //创建对象
        Student students=new Student("张三",1111);
        //序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student"));
        oos.writeObject(students);

        //关闭，刷新
        oos.flush();
        oos.close();
    }
}
