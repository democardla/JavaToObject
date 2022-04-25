package day11.inherit.object;

public class ProxyTest {
    public static void main(String[] args) {
        //2。创建被代理类的对象
        Server server = new Server();
        //4。创建代理类的构造器，并将被代理类置于代理类的构造器中
        ProxyServer proxyServer = new ProxyServer(server);
        //5。通过代理类执行某项方法
        proxyServer.browse();


    }
}

interface Network{
    public void browse();

}

//1。规定被代理类的对象格式
class Server implements Network{
    @Override
    public void browse() {
        System.out.println("linking");
    }
}//被代理类，实现类

//3。规定代理类的对象格式
class ProxyServer implements Network {
    /*
     * 代理类应当具备：
     * 1。用于存放与之相关的被代理类的位置的变量（未赋值）
     * 2。一个可以赋值变量的构造器
     * 3。重写抽象方法重要嵌套被代理类的重名方法
     */
    Server server;
    public ProxyServer(Server server) {
        this.server = server;
    }

    @Override
    public void browse() {
        System.out.println("hh");
        //嵌套被代理类的重名方法
        server.browse();
    }
 }//代理类