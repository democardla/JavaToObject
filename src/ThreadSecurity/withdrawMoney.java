package ThreadSecurity;



import java.util.Scanner;
//操作谁的方法写在被操作对象的类中

public class withdrawMoney {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Thread accountMirror1 = new Customer(myAccount);
        Thread accountMirror2 = new Customer(myAccount);
        accountMirror1.setName("A");
        accountMirror2.setName("B");
        accountMirror1.start();
        accountMirror2.start();
    }
}

class Customer extends Thread {
    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        account.deposit(number);
    }
}

class Account{
    private int balance = 0;
    String accountName = "";
    public Account(int balance) {
        this.balance = balance;
    }

    public Account() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }
    public synchronized void deposit(int input){//synchronized加在这里来实现方法的线程安全
        if(input >= 0){
            setBalance(input);
            System.out.println(java.lang.Thread.currentThread().getName() + " succeed,balance is " + getBalance());
        }
    }
    public void setBalance(int balance) {
        this.balance = this.balance + balance;
    }
}