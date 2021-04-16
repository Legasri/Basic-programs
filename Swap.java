import java.io.*;
import java.util.*;
class Swap
{
public static void main(String args[])
{
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.println("Input the first num");
a=in.nextInt();
System.out.println("Input the second num");
b=in.nextInt();
c=a;
a=b;
b=c;
System.out.println("First num="+a);
System.out.println("Second num="+b);
}
}