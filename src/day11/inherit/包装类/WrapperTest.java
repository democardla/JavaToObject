package day11.inherit.包装类;
import static java.lang.Math.*;//->line36
import org.junit.Test;

public class WrapperTest {
    @Test
    public void test1(){
        //基本数据类型转化成包装类
        Integer integer = new Integer(10);
        System.out.println(integer.toString());
        Float i = new Float(12);
        System.out.println(i.toString());
        float a = 21;//现在即使不写f或不是浮点数格式依旧可以将int转成float
        System.out.println(a);

        //包装类转化成基本数据类型
        int i1 = integer.intValue();
        System.out.println(i1);

        //自动装箱
        Integer integer1 = i1;//其他的数字类型装拆箱的原则与Integer一样
        int i2 = integer1;//自动拆箱
        System.out.println( integer1.equals(integer));
        System.out.println(integer + integer1);//可以进行包装类的加和计算输出与对应的基本数据类型一致
        String str1 = "111";
        System.out.println(str1 + integer);//输出hello10

        //其他包装类转化成字符串
        String str2 = String.valueOf(integer);
        System.out.println(str2);

        //字符串转化成其他包装类
//        Integer integer2 = Integer.parseInt(str1);//包装类名 变量名 = 包装类名.parseXXX(参数);
        Integer myInteger = 12;
        System.out.println(myInteger.getClass());
        int b = abs((int)  a);//->line2
        Integer integer2 = Integer.getInteger(str1);
        System.out.println(integer2);
    }
}
