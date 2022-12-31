// wap to implement inheritance
class A {
    public void show() {
        System.out.println("This is class A");
    }
}

class B extends A {
    public void print() {
        System.out.println("This is class B");
    }
}

public class simpleInheritance {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.print();
    }

}
