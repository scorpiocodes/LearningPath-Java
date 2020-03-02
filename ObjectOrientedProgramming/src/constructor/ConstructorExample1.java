/**
 *
 * @author scorpiocodes
 */

package constructor;

class student1{
    String name;
    int rollno;
    double marks;
    
    student1(){
        name = "Harshith";
        rollno = 26;
        marks = 96.50;
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
 student1 s = new student1();
 System.out.println(s.getName());
 System.out.println(s.getRollNo());
 System.out.println(s.getMarks());
}
}