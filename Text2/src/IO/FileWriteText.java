package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteText {
    public static void main(String[] args) {
        FileWriter writer=null;
        try {
            writer=new FileWriter("File",true);         //true表示追加，不清空
            writer.write("Hello World!!!");

            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
