package IO;

import java.io.File;
import java.io.IOException;

public class FileText1 {
    public static void main(String[] args) throws Exception {
        File f1=new File(" ");
            //判断文件是否存在
        System.out.println(f1.exists());

        if(!f1.exists()){
            //以文件形式创建
            f1.createNewFile();
        }
        if (!f1.exists()){
            //以目录形式创建
            f1.mkdir();
        }

        //以多重目录创建   mkdirs()
        File f2=new File("D:/ / / / / / /");
        if(f2.exists()){
            f2.mkdirs();
        }

        File f3=new File("   ");
        //获取父路径
        String parent=f3.getParent();
        System.out.println(parent);
        //获取绝对路径
        File parentDile=f3.getParentFile();
        System.out.println("绝对路径"+parentDile.getAbsolutePath());

        File f4=new File("  ");
        System.out.println("绝对路径"+f4.getAbsolutePath());
    }
}
