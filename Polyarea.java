import java.io.*;
import java.util.Scanner;
class Polyarea
{
public static void main(String args[])
{
double n,s,area;
Scanner in=new Scanner(System.in);
System.out.println("Enter the length of the side of the polygon:");
s=in.nextInt();
System.out.println("Enter the number of sides:");
n=in.nextInt();
area=(n*Math.pow(s,2))/(4*Math.tan(Math.PI/n));
System.out.println("The area of polygon is:"+area);
}
}