package exception;
/*
 * 异常的处理：抓抛模型
 *
 * 过程一："抛" -> 程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象，并将此对象抛出；抛出对象之后，在该对象之后的代码便不执行了。在方法中，该方法在没有finally的条件下仅执行到异常处
 * 过程二："抓" -> 异常处理方式：try-catch-finally & throws
 */
public class ExceptionTest {
    public static void main(String[] args) {
//try-catch-finally
       /* try {
            //放置可能会出现异常的程序代码
        }catch (变量名1){
            //解决方法1
        }catch (变量名2){
            //解决方法2
        }finally {
            //最后一定会被执行的代码会被放置在这里，相当于switch中的default,他一定会被执行，不管catch中是否有异常或者是否有return
            //像数据库连接，输入输出流，网络编程socket等资源，JVM是不能自动回收的，需要我们手动去释放资源。最后的close()要放在finally
        }
        */
        String str = "123";
        str = "asd";

        int anotherInt = 0;//假如要使用这个变量，并且这个变量可能会抛出异常，那么就使用动态初始化，先声明在使用
        try {
            anotherInt = Integer.parseInt(str);
            int anInt = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }

    }
}
