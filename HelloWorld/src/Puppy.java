/**
 * Created by Stephen on 2017-03-30.
 */
public class Puppy {
    int puppyAge;

    public Puppy(){

    }

    public Puppy( String name ){
        System.out.println( "小狗的名字是：" + name );
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄为：" + puppyAge );
        return puppyAge;
    }

    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println( "小狗的年龄是：" + age );
    }
}
