/**
 * Created by Stephen on 2017-03-29.
 */
public class HelloWorld {
   public static void main( String[] args ){
       System.out.println("Hello World!");


       FreshJuice juice = new FreshJuice();
       juice.size = FreshJuice.FreshJuiceSize.MEDIUM;


       Puppy myPuppy = new Puppy("tommy");
       myPuppy.setAge( 2 );
       myPuppy.getAge();
       System.out.println( "变量值：" + myPuppy.puppyAge );
       myPuppy.pupAge();


       Employee employeeOne = new Employee("RUNOOB1" );
       Employee employeeTwo = new Employee("RUNOOB2" );

       employeeOne.setAge( 26 );
       employeeOne.setDesignation( "高级程序员" );
       employeeOne.setSalary( 1000 );

       employeeTwo.setAge( 21 );
       employeeTwo.setDesignation( "菜鸟程序员" );
       employeeTwo.setSalary( 500 );

       employeeOne.printEmployee();
       employeeTwo.printEmployee();

   }
}

