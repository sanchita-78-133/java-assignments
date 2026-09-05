/*
WAP to create a super class having a variable. Let the variable be initialized to some value within a constructor. 
This class should have a method display () to display the initial value of the variable. 
Derive a sub class that accesses the constructor, variable and method of the super class using super keyword.
*/
class SUPER_CLASS
{
  protected int a;
  SUPER_CLASS(){ a = 13; System.out.println("Currently initiallising the value of a in the constructor!"); }
  void display(){ System.out.println("the initial value of a is : " + a);}
}

class SUB_CLASS extends SUPER_CLASS
{
  protected int a;
  SUB_CLASS(){ super(); this.a = 7; System.out.println("The value from the constructor: " + this.a);}
  public void display(){ super.display(); System.out.println("the value of a in sub class is : " + this.a);}
  
}

class USE_OF_SUPER
{
 public static void main(String args[])
 {
    SUB_CLASS obj = new SUB_CLASS();
    obj.display();
 }
}