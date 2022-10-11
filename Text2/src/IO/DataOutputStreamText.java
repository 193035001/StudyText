package IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
/*
数据加密，生成的文件不是普通文本
 */

public class DataOutputStreamText {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("data"));
        byte b=100;
        int i=200;
        float f=3.0F;
        double d=3.14;
        boolean sex=true;
        char c='a';

        dos.writeByte(b);
        dos.writeInt(i);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);

        dos.flush();
        dos.close();
    }
}
