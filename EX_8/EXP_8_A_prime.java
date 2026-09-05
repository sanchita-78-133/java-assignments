import java.util.*;

class A {
    A() {
        System.out.println("Constructor for Class A.");
        see(); 
    }

    void speak() { 
        System.out.println("A.speak() called."); 
    }

    protected void read() { 
        System.out.println("A.read() [Protected Access]."); 
    }

    private void see() { 
        System.out.println("A.see() [Private Access - Invisible to B/C]."); 
    }
}

class B extends A {
    B() {
        super.speak(); 
        System.out.println("Constructor for Intermediate Class B.");
    }

    @Override
    void speak() { 
        System.out.println("B.speak() [Overridden Version]."); 
    }
}

class C extends B {
    C() {
        System.out.println("constructor Initializing Class C.");
    }

    void talk() { 
        System.out.println("C.talk() [Unique to Class C]."); 
    }
}

class EXP_8_A_prime {
    public static void main(String args[]) {
        
        System.out.println("UPCASTING and POLYMORPHISM");
        
        A obj = new C(); 
        
        obj.speak(); 

        System.out.println("\nFULL ACCESS");
        C obj1 = new C();
        obj1.talk(); 

        System.out.println("\nACCESS MODIFIER VALIDATION");
        A obj2 = new A();
        
        obj2.read(); 
    }
}