/*
single-         multilevel                  Hierarchical
 parent         parent                          parent
 |              |                                 |
 |              |                   --------------------------
 child          child1              |                       |
                |                   child1                  child2
                |
                child2
 */

class Parent {
    private int x;
    private int y;

    Parent(int a, int b) {
        x = a;
        y = b;
        System.out.println("Parent's constructor executed");
        System.out.println(x);
        System.out.println(y);
    }

    void f1() {
        System.out.println("F1 function of parent class executed");
    }

    void f2() {
        System.out.println("F2 function of parent class executed");
    }
}

class Child1 extends Parent {
    int z;

    Child() {
        super(6, 7);
        System.out.println("Child's constructor executed");
    }

    void f3() {
        System.out.println("F3 function of child class executed");
    }
}

// Multilever Inheritances
class Child2 extends Child1 {
    int p;
    int q;

    void p1() {
        System.out.println("Child2 p1 function executed");
    }
}

// Hierarchial Inheritance
class Child3 extends Parent {
    int q;

    void q1() {
        System.out.println("Child3 q1 function executed");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        // c1.f1();
        // c1.f2();
        // c1.f3();

    }
}
