# Access Modifiers Notes

Access keywords are added with classes or any blocks or definitions that change their meaning. For example if there is a bank software is created in java then the name of bank should be public so that every can access it’s name from any where in program. So what we do just add public keyword with that variable and make that public so that every one can access it’s name. Let’s discuss about Access Modifiers in Java in detail below.

#### **Types of Access Modifiers in Java:**

Now there are variety of access modifiers in java but we categorize them into two types that are as follow:

1.  Access Control Modifiers
    
2.  Non Access Modifiers
    

#### **Access Control Modifiers:**

Now there are four types of access control modifiers that we can use to control the access. These are as follow:

1.  public
    
2.  private
    
3.  protected
    
4.  default
    

Before staring you can read our article on  [Packages in Java](https://www.javaians.com/packages-in-java/), to have better understaing.

  

#### _public_

public is a keyword that helps to control the access of class, method or any other member. Now if any entity is declared as public than we can access that any where. It is now public. It is visible to the real world. You can also say that there in no privacy.
```java
  public  class  Test{  //public class
    public  String  var  =  "Hello World";  //public variable

    public  void helloWorld(){  // public method
    System.out.println(var);
    }
  }
```
  

#### _private_

private is a keyword that we use to declare any entity as private. Now any entity declared as private cannot be access from any where. It is totally hide from the real world. For example pin of account is totally private. It is used to make our entity secure.
```java
  public  class  Test{  //Outer class can not be private
    private  String  var  =  "Hello World";  //private variable

    private  void helloWorld(){  // private method
    System.out.println(var);
     }
    }
```
  

#### _protected_

protected keyword help us to declare any entity as protected. Now any entity declared as protected can be access with in a package. If you don’t know about packages then you can check it here. As well as we can also access the child class through inheritance. We are going to discuss about inheritance in our next articles.
```java
  public  class  Test{  //Outer class cannot be protected 
    protected  String  var  =  "Hello World";  //protected variable 
    protected  void helloWorld(){  // protected method
    System.out.println(var);
     }
    }
```
  

#### _default_

There in no keyword for default access modifiers. If we write nothing than it is considered as default access modifier. Now any entity declared as default can only be access with in a package.

#### **Non Access Modifiers**

There are bunch of non access modifiers in java that we can also use. So let’s discuss about them in more detail below:

-   First of all we have static modifier. That we mostly use with class or methods.
    
-   Then we have final modifier that we can use to make our variables or class or methods finalize.
    
-   The abstract modifier that we us to make our class or methods abstract. You will learn about abstract or abstraction in our later articles.
