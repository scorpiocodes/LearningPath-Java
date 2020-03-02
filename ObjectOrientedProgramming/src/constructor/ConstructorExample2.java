/**
 *
 * @author scorpiocodes
 */

package constructor;

class student{
    String name;
    int rollno;
    double marks;
    
    student(){
        name = "Harshith";
        rollno = 26;
        marks = 96.50;
    }
    
    student(String name, int rollno, double marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    
    String getName(){
        return name;
    }
    
    int getRollNo(){
        return rollno;
    }
    
    double getMarks(){
        return marks;
    }
    
public static void main(String args[]){
 student s = new student();
 System.out.println(s.getName());
 System.out.println(s.getRollNo());
 System.out.println(s.getMarks());
 
 student s2 = new student("John",22,88.20);
 System.out.println(s2.getName());
 System.out.println(s2.getRollNo());
 System.out.println(s2.getMarks());
}
}