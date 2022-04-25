package day11.inherit.inheritTest;
/*多态性的使用前提：
1。继承关系
2。子类一般会有方法的重写
////////对象的多态性只适用于方法，不适用于属性////////
 */
/*

 */

public class extendTest {
    public static void main(String[] args) {
        //多态性：子类对象的多态性，只要是Person的子类都可以由Person来实例化
        Person person = new Person();
        Person person1 = new Student();
        Person person2 = new Kid();
        //当调用的时候：由于是通过父类调用的子类，因此我们只能调用子类与父类都具备的方法（包括重写的）
        //作用：1.创建以父类为本的混合数组？2.可以减少某一方法的重载次数
        Person[] people = new Person[10];
        for (int i = 0;i<10;i++){
            if (i%2 == 0){
               people[i] = new Student(15+i,"major"+i,"Student"+i);
            } else {
                people[i] = new Kid("Kid"+i,i,"null");
            }
        }
        for (int i = 0;i<10;i++){
            System.out.println(people[i].name);
            System.out.println(people[i].age);
        }

        //类类型提升：强制类型转换->向下转型：类型转换有可能出错
        Kid kid1 = (Kid) person2;//这样就可以使用kid原有的方法和参数了
       //instanceof关键字：查看某对象是否是继承某父类，并且返回一个boolean值，一般配合if语句使用
        if (kid1 instanceof Kid){//如果是真，则形转
            Kid newKid = (Kid) person2;
        }
    }
}
