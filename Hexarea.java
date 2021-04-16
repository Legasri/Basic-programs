import java.io.*;
import java.util.Scanner;
class Hexarea
{
public static void main(String args[])
{
double side,area;
Scanner in=new Scanner(System.in);
System.out.println("Enter the side of the hexagon:");
side=in.nextInt();
area=(6*Math.pow(side,2))/(4*Math.tan(Math.PI/6));
System.out.println("The area of hexagon is:"+area);
}
}