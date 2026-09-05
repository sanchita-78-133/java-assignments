import java.util.*;
class Staff
{
  Scanner sc = new Scanner(System.in);
  protected int code; protected String name; 
}
class Teacher extends Staff
{
  String subject; int experience; 
  public void read()
  {
    System.out.println("Enter the Teacher's Code : ");
    code = sc.nextInt();
    System.out.println("Enter the Teacher's Name : ");
    name = sc.nextLine(); sc.nextLine();
    System.out.println("Enter the Teacher's Subject : ");
    subject = sc.nextInt();
    System.out.println("Enter the Teacher's Experience : ");
    experience = sc.nextLine(); sc.nextLine();
  }
  public void display()
  {
    System.out.println("Teacher's code : " + code);
    System.out.println("Teacher's name : " + name);
    System.out.println("Teacher's subject : " + subject);
    System.out.println("Teacher's experience : " + experience);
  }
}

class Typist extends Staff
{
  int speed, exp;
}

class Officer extends Staff
{
  String dept; int grade; 
  public void read()
  {
    System.out.println("Enter the Officer's Code : ");
    code = sc.nextInt();
    System.out.println("Enter the Officer's Name : ");
    name = sc.nextLine(); sc.nextLine();
    System.out.println("Enter the Officer's Department : ");
    dept = sc.nextLine(); sc.nextLine();
    System.out.println("Enter the Officer's Grade : ");
    grade = sc.nextInt(); 
  }
  public void display()
  {
    System.out.println("Officer's code : " + code);
    System.out.println("Officer's name : " + name);
    System.out.println("Officer's Department : " + dept );
    System.out.println("Officer's Grade : " + grade);
  }
}


class Regular extends Typist
{
  int sal; 
  public void read()
  {
    System.out.println("Enter the Regular Typist's Code : ");
    code = sc.nextInt();
    System.out.println("Enter the Regular Typist's Name : ");
    name = sc.nextLine(); sc.nextLine();
    System.out.println("Enter the Regular Typist's Speed : ");
    speed = sc.nextInt();
    System.out.println("Enter the Regular Typist's Salary : ");
    sal = sc.nextInt();
    System.out.println("Enter the Regular Typist's Experience : ");
    experience = sc.nextLine(); sc.nextLine();
  }
  public void display()
  {
    System.out.println("Regular Typist's code : " + code);
    System.out.println("Regular Typist's name : " + name);
    System.out.println("Regular Typist's speed : " + speed);
    System.out.println("Regular Typist's salary : " + salary);
    System.out.println("Regular Typist's experience : " + experience);
  }
}

class Casual extends Typist
{
  int dw; 
  public void read()
  {
    System.out.println("Enter the Casual Typist's Code : ");
    code = sc.nextInt();
    System.out.println("Enter the Casual Typist's Name : ");
    name = sc.nextLine(); sc.nextLine();
    System.out.println("Enter the Casual Typist's Speed : ");
    speed = sc.nextInt();
    System.out.println("Enter the Casual Typist's Daily Wages : ");
    dw = sc.nextInt();
    System.out.println("Enter the Casual Typist's Experience : ");
    experience = sc.nextLine(); sc.nextLine();
  }
  public void display()
  {
    System.out.println(" Casual Typist's code : " + code);
    System.out.println(" CasualTypist's name : " + name);
    System.out.println(" Casual Typist's speed : " + speed);
    System.out.println(" CasualTypist's daily wages : " + dw);
    System.out.println(" Casual Typist's experience : " + experience);
  }
}

class Main_8c
{
 public static void main(String args[])
 {
   Teacher t = new Teacher(); t.read(); t.display();
   Officer o = new Officer(); o.read(); o.display();
   Regular r = new Regular(); r.read(); r.display();
   Casual c = new Casual(); c.read(); c.display();
 }
}
