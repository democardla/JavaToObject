package exception;
/*
 * 异常的处理：抓抛模型
 *
 * 过程一："抛" -> 程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象，并将此对象抛出；抛出对象之后，在该对象之后的代码便不执行了
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
            //一定会被执行的代码会被放置在这里，相当于switch中的default
        }
        */
        String str = "123";
        str = "asd";
        try {
            int anInt = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }

    }
}
