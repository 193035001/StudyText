package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
反序列化
 */
public class ObjectInputStreamText {
    public static void main(String[] args)throws Exception {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student"));
        //读
       Object obj= ois.readObject();
        System.out.println(obj);
        ois.close();
    }
}
