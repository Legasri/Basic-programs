import java.io.*;
import java.util.Scanner;
class Modulus
{
public static void main(String args[])
{
int dividend,div,rem,quot;
Scanner in=new Scanner(System.in);
System.out.println("Enter num1:");
dividend=in.nextInt();
System.out.println("Enter num2:");
div=in.nextInt();
quot=dividend/div;
rem=dividend-(quot*div);
System.out.println("Remainder:"+rem);
}
}


