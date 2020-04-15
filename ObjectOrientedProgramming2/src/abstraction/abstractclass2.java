package abstraction;

/**
 *
 * @author scorpiocodes
 */

abstract class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}

class Student extends Person {
    int fee;
    Student(String name, int age, int fee)
    {
        super(name,age);
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
    
}

class Teacher extends Person {
    int salary;
    Teacher(String name,int age,int salary) {
        super(name,age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
}


public class abstractclass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student("John",21,2000);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getFee());
        Teacher t = new Teacher("AndrewNG",40,100000);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSalary());
    }

}
