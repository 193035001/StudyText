package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamText {
    public static void main(String[] args)throws Exception {
        DataInputStream dis=new DataInputStream(new FileInputStream("data"));

        byte b=dis.readByte();
        int i=dis.readInt();
        float f=dis.readFloat();
        double d=dis.readDouble();
        boolean sex=dis.readBoolean();
        char c=dis.readChar();

        System.out.println(b);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);
        System.out.println(c);


        dis.close();
    }
}
