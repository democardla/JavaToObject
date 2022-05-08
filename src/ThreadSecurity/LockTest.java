package ThreadSecurity;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
}

class Window4 implements Runnable {
    private int accountOfTicket = 100;
    private ReentrantLock lock = new ReentrantLock(true);//显式添加同步锁

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();//加锁
                if (accountOfTicket > 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口卖票，票号为：" + accountOfTicket);
                    accountOfTicket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();//解锁
            }

        }
    }
}