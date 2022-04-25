package com.CVMtest;

public class CustomerList {
    private Customer[] customers;
    //如果是在class下面直接声明的数组，未初始化直接使用不会报错；如果是在函数下面声明的数组，未经初始化使用会报错；但是一般我们必须经过初始化后才能使用数组（可推演到其他类型）
    private int total = 0;



    public CustomerList(){

    }

    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];//动态初始化
    }



    public boolean addCustomer(Customer customer){
        if (total < customers.length || total >=0){
        customers[total++] = customer;
        return true;
        }else{
            return false;
        }
    }

    public boolean replaceCustomer(int index,Customer cust){
        if (index>=0 || index<total){
            customers[index] = cust;
            return true;
        }
        return false;
    }

    public int getTotal(){
        return total;
    }

    public boolean deleteCustomer(int index){
        if (index>=0 && index<total){
            for (int i = index;i<total-1;i++){
                customers[i] = customers[i + 1];//i 的循环条件选择：i+1可以取到最后元素的索引
            }
            customers[total-1] = null;
            total--;
            return true;
        }
        return false;
    }//////////

    public Customer[] getAllCustomers() {
        Customer[] allCustomers = new Customer[total];
        for (int count = 0;count <total;count++){
            allCustomers[count] = customers[count++];
        }
        return allCustomers;//不能只写它
    }//////////

    public Customer getCustomer(int index){
        if (index>=0 && index<total){
            return customers[index];
        }
        return null;
    }
}
