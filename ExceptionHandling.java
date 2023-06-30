import java.util.*;
public class ExceptionHandling {
public static void main (String[] args) {
try{
try{
int[] a={1,2,3};
System.out.println(a[3]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(&quot;Out of bounds&quot;);
}
System.out.println(4/0);
}
catch(ArithmeticException e)
{
System.out.println(&quot;ArithmeticException : divide by 0&quot;);
}
}
}
