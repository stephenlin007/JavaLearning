/**
 * Created by Stephen on 2017-03-30.
 */
import java.io.*;

public class Employee {
    public String name;
    public int age;
    public String designation;
    private double salary;


    public Employee( String name ){
        this.name = name;
    }

    public void setAge( int age ){
        this.age = age;
    }

    public void setDesignation( String designation ){
        this.designation = designation;
    }

    public void setSalary( double salary ) {
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println( "名字：" + name );
        System.out.println( "年龄：" + age );
        System.out.println( "职位：" + designation );
        System.out.println( "工资：" + salary );
    }
}
