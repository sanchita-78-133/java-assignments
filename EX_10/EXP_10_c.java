import java.lang.ref.WeakReference;
class EXP_10_c 
{
public static void main(String[] args) 
{
String str = new String("GC Demo");
WeakReference<String> ref = new WeakReference<>(str);
str = null;
System.gc();
if (ref.get() == null)
System.out.println("GARBAGE COLLECTED!");
else
System.out.println("GARBAGE NOT COLLECTED!");
}
}