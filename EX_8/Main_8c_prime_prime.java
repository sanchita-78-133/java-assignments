import java.util.*;

class Staff {
    Scanner sc = new Scanner(System.in);
    protected int code;
    protected String name;
}

class Teacher extends Staff {
    String subject;
    int experience;

    public void read() {
        System.out.println("\nEnter Teacher Details");
        System.out.print("Enter Code: ");
        code = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Subject: ");
        subject = sc.nextLine(); 
        System.out.print("Enter Experience (years): ");
        experience = sc.nextInt();
        sc.nextLine(); 
    }

    public void display() {
        System.out.println("\nTeacher's Code: " + code);
        System.out.println("Teacher's Name: " + name);
        System.out.println("Teacher's Subject: " + subject);
        System.out.println("Teacher's Experience: " + experience + " years");
    }
}

class Typist extends Staff {
    int speed, exp; 
}

class Officer extends Staff {
    String dept;
    char grade;

    public void read() {
        System.out.println("\nEnter Officer Details");
        System.out.print("Enter Code: ");
        code = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        dept = sc.nextLine();
        System.out.print("Enter Grade (One Character): ");
        grade = sc.next().charAt(0);
    }

    public void display() {
        System.out.println("\nOfficer's Code: " + code);
        System.out.println("Officer's Name: " + name);
        System.out.println("Officer's Department: " + dept);
        System.out.println("Officer's Grade: " + grade);
    }
}

class Regular extends Typist {
    int sal;

    public void read() {
        System.out.println("\nEnter Regular Typist Details");
        System.out.print("Enter Code: ");
        code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Speed: ");
        speed = sc.nextInt();
        System.out.print("Enter Salary: ");
        sal = sc.nextInt(); 
        System.out.print("Enter Experience: ");
        exp = sc.nextInt(); 
    }

    public void display() {
        System.out.println("\nRegular Typist's Code: " + code);
        System.out.println("Regular Typist's Name: " + name);
        System.out.println("Regular Typist's Speed: " + speed);
        System.out.println("Regular Typist's Salary: " + sal);
        System.out.println("Regular Typist's Experience: " + exp);
    }
}

class Casual extends Typist {
    int dw;

    public void read() {
        System.out.println("\nEnter Casual Typist Details");
        System.out.print("Enter Code: ");
        code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Speed: ");
        speed = sc.nextInt();
        System.out.print("Enter Daily Wages: ");
        dw = sc.nextInt();
        System.out.print("Enter Experience: ");
        exp = sc.nextInt(); 
    }

    public void display() {
        System.out.println("\nCasual Typist's Code: " + code);
        System.out.println("Casual Typist's Name: " + name);
        System.out.println("Casual Typist's Speed: " + speed);
        System.out.println("Casual Typist's Daily Wages: " + dw);
        System.out.println("Casual Typist's Experience: " + exp);
    }
}

public class Main_8c_prime_prime {
    public static void main(String args[]) {
        Teacher t = new Teacher(); t.read(); t.display();
        Officer o = new Officer(); o.read(); o.display();
        Regular r = new Regular(); r.read(); r.display();
        Casual c = new Casual(); c.read(); c.display();
    }
}