package day11.inherit.object;

/*
mian()可以是程序的入口，也可以是普通的静态方法
 */
public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[19]);


    }
}
class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i] = "aegs_" + i;
            System.out.println(args[i]);

        }
    }
}