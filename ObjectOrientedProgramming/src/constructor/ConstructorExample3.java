/**
 *
 * @author scorpiocodes
 */

package constructor;

class A{
    A(){
        System.out.println("constructor of class A");
    }
}

class B extends A{
    B(){
        //super();
        System.out.println("constructor of class B");
    }
}

class ConstructorExample3{
    public static void main(String args[]){
        B b = new B();
    }
}