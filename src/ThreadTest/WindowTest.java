package ThreadTest;



public class WindowTest {
    public static void main(String[] args) {
        //使用继承的实现多进程
        window window1 = new window("window1");
        window window2 = new window("window2");
        window window3 = new window("window3");
        window1.start();
        window2.start();
        window3.start();
        //使用接口实现多进程
        anotherWindow windowMirror = new anotherWindow();
            //创建对象
        Thread window4 = new Thread(windowMirror);
        Thread window5 = new Thread(windowMirror);
        Thread window6 = new Thread(windowMirror);
        window4.start();
        window5.start();
        window6.start();

    }
}

//使用继承的实现多进程
class window extends Thread{
    private static int accountOfTicket = 100;
    public window(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        //需要解决线程的安全问题
//        while (accountOfTicket > 0 ){
//            System.out.println(getName() + "窗口卖票，票号为：" + accountOfTicket);
//            accountOfTicket--;
//        }//会输出3个100
        while (true){
            if (accountOfTicket > 0){
                System.out.println(getName() + "窗口卖票，票号为：" + accountOfTicket);
                accountOfTicket--;
            } else {
                break;
            }//输出了2个100
        }
    }
}

//使用接口实现多进程
class anotherWindow implements Runnable{
    int accountOfTicket = 100;//因为在主程序中只创建了一个镜像对象，其他的线程都是在一个镜像对象的基础上创建的，所以这里的accountOfTicket不需要声明为静态变量
    @Override
    public void run() {
        while (true) {
            if (accountOfTicket > 0) {
                System.out.println(Thread.currentThread().getName() + "窗口卖票，票号为：" + accountOfTicket);
                accountOfTicket--;
            } else {
                break;
            }
        }
    }
}

/*
 * 比较这两种方式：推荐方式2
 * 1。第二种便于线程的数据共享
 * 2。第二种可以在对象有明确的父类时实现多进程，因为第一种会有单继承的限制
 */