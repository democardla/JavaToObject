package ThreadTest;

public class ThreadTestWithRunnable {
    public static void main(String[] args) {
        //创建myRunnableObject的对象
        myRunnableObject myRunnableObject1 = new myRunnableObject();
        //将新建的对象注入Thread构造器中启用,即创建一个新的Thread类
        Thread myRunnableObject1Thread = new Thread(myRunnableObject1);
        //调用Thread对象的start方法
        myRunnableObject1Thread.start();
    }
}

//创建一个实现Runnable接口的类
class myRunnableObject implements Runnable{
    //重写run方法
    @Override
    public void run() {
        // TODO: 2022/5/6 some method here
    }
}