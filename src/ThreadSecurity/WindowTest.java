package ThreadSecurity;
/*
 * 线程的安全问题：
 * Java的同步机制来解决线程安全问题
 *
 * 1。synchronized(同步监视器[加锁:任何一个类的对象都可以充当锁]){//操作共享数据的代码叫做被同步代码}
 *  [加锁:任何一个类的对象都可以充当锁]:要求多个对象要使用同一个锁
 */


public class WindowTest {
    public static void main(String[] args) {
        Window windowMirror = new Window();
        //创建对象
        Thread window4 = new Thread(windowMirror);
        Thread window5 = new Thread(windowMirror);
        Thread window6 = new Thread(windowMirror);
        window4.start();
        window5.start();
        window6.start();
    }
}

class Window implements Runnable{
    int accountOfTicket = 100;
    Object myLock = new Object();//保证锁的唯一性
    @Override
    public void run() {
        while (true) {
            synchronized (Window.class) {
                if (accountOfTicket > 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口卖票，票号为：" + accountOfTicket);
                    accountOfTicket--;
                } else {
                    break;
                }
            }
/**         synchronized (myLock) {//myLock是充当公共锁的对象，可以使用object.class或者this
                if (accountOfTicket > 0) {//accountOfTicket是被共享的参数
                    System.out.println(Thread.currentThread().getName() + "窗口卖票，票号为：" + accountOfTicket);
                    accountOfTicket--;
                } else {
                    break;
                }//是操作被共享参数的方法们
            }
 */
        }
    }
}