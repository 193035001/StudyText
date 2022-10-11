package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText2 {
    public static void main(String[] args) {
        FileReader reader=null;
        FileWriter writer=null;

        try {
            reader=new FileReader("Text2/src/IO/CopyText2.java");
            writer=new FileWriter("CopyText2");

            char[] chars=new char[1024*1024];
            int readCount=0;
            while((readCount= reader.read(chars))!=-1){
                writer.write(chars,0,readCount);
            }

            writer.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
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
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
