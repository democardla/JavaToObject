package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class exceptionTest2 {
    //异常不要抛给main方法啦：你最终是要解决它而不是甩锅，可得支棱起来啊
    public void method2() throws IOException{
        method1();//
    }

    public void method1() throws FileNotFoundException,RuntimeException,IOException{//被调用的方法是可以将异常抛给调用自己的方法的
        File file = new File("name.txt");
        FileInputStream fileInputStream = new FileInputStream(file);//创建文件输入流

        int data = fileInputStream.read();
        while (data != -1){
            System.out.println((char) data);
            data = fileInputStream.read();
        }
        fileInputStream.close();

        //手动抛出异常，一般配合if语句使用
        if (true) {
            throw new RuntimeException("这里是描述");
        }
    }
}
