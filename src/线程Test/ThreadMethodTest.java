package 线程Test;
/*
 * Thread中的方法
 * 1。start方法：启动
 * 2。run方法：需要重写，是线程的功能主体
 * 3。currentThread方法：静态方法，返回执行当前代码的线程（返回当前正在运行的线程）
 * 4。getName方法：获取当前线程的名字
 * 5。setName方法：设置当前线程的名字
 * 6。yield方法：用来释放cpu以进行下一次线程执行的分配
 * 7。join方法：对象方法，形参为时间，意为**时间后join。执行途中插入一个其他线程，等其他线程执行结束后在继续执行该线程
 * 8。stop方法：强制结束进程：过时了
 * 9。sleep方法：当前进程休眠一会，单位为毫秒，它会抛出一个异常：interruptedException
 * 10。 isAlive方法：判断一个线程是否还有效
 *
 * 关于设置当前线程的优先级：
 * 1。getPriority()
 * 2。setPriority(int p)
 * 3。线程的优先级别：MAX_PRIORITY == 10; MIN_PRIORITY == 1; NORM_PRIORITY == 5 -> 默认优先级
 * 4。高优先级的线程会抢夺低优先级的线程的执行机会，所以总体上来看，大部分的高优先级的线程会优先被执行
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        myThread2 thread1 = new myThread2();//构造器设置名称
        myThread2 thread2 = new myThread2();
        thread1.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.setName("Thread1");
        Thread.currentThread().setName("mainThread");//设置主线程的名称
        System.out.println(Thread.currentThread().getName());//打印当前的线程名称
        System.out.println(Thread.currentThread().getName());


    }
}

class myThread2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        super.run();
    }
}
