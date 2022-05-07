package 线程Test;
/*
 * 多线程的创建：
 * 方法1：创建一个类继承于Thread类，并重写它的run方法；实例化类的对象，并通过这个对象调用其start()方法
 *
 */

//举例：遍历100以内所有的偶数
class myThread extends Thread{
    @Override
    public void run() {
        //将此线程将要执行的操作写入
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0)
                System.out.println(i);
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //实例化
        myThread mythread = new myThread();
        //调用start方法
        mythread.start();//启动当前线程；调用当前线程
        /*
         * 1。我们没有办法直接调用run方法来启动线程
         * 2。再次启动线程的时候需要重建对象
         */
        Thread aThread = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };//创建匿名多线程对象
        //或者
        new Thread(){
            @Override
            public void run() {
                super.run();
            }
        }.start();
    }
}
