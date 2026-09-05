import vol.Cylinder;
import java.util.*;
class EXP_P{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.println("Enter the value for the height of the cylinder: "); int h = sc.nextInt();
   System.out.println("Enter the value for the radius of the cylinder: "); int r = sc.nextInt();
  Cylinder obj = new Cylinder(); 
  double vol = obj.volume(h, r);
  System.out.println("The volume of the cylinder is : "  + vol + "  cubic units");
 } 
}