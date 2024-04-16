class Parent{
    void display()
    {
        System.out.println("Parent's display method");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Child's display method");
    }
}

public class Practical17 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.display();
        c.display();
    }
}
