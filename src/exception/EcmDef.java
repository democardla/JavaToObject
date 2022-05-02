package exception;


import java.util.Scanner;

public class EcmDef {
    Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int result = ecm(i,j);
            System.out.println(result);
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        }

    }
    public static int ecm(int i ,int j) throws EcDef,ArithmeticException{
        if (i<0 || j<0)
            throw new EcDef("输入不能是负数");
        if (j == 0)
            throw new ArithmeticException("除数不能为0");

        return i/j;
    }
}

