class Parent {
    public void add() {
        System.out.println("hello world");
    }
}
class Child extends Parent {
    void display() {
        add();
    }
}
class Third extends Child {
    void helper() {
        display();
    }
}
public class inheritance {
    public static void main(String[] args) {
        Third obj = new Third();
        obj.helper();
    }
}
