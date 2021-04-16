import java.io.*;
import java.util.Scanner;
public class Area
{
public static void main(String args[])
{
int r;
float pi=3.14f,area;
Scanner in=new Scanner(System.in);
System.out.println("Enter the radius:");
r=in.nextInt();
area=pi*r*r;
System.out.println("The area of cirle="+area);
}
}