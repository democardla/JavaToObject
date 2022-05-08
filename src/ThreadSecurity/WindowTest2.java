package ThreadSecurity;
/*
 * 同步方法的声明：在声明的部分加上synchronized关键字就行
 * 尚硅谷Java入门435-436-437
 */
public class WindowTest2 {

}

class Window3 implements Runnable{

    int accountOfTicket = 100;
    @Override
    public void run() {
        while(true){
            show();
        }
    }

    //同步方法
    /*
     * 如果是通过继承来实现同步，则需要将同步方法声明为静态的
     */
    public synchronized void show(){//同步监视器为this
        if (accountOfTicket > 0) {
            System.out.println(Thread.currentThread().getName() + "窗口卖票，票号为：" + accountOfTicket);
            accountOfTicket--;
        }
    }
}