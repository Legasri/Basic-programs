import java.io.*;
import java.util.Scanner;
public class Incdec
{
public static void main(String args[])
{
int a,b,pri,poi,prd,pod;
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
a=in.nextInt();
pri=++a;
System.out.println("Preincrement:"+pri);
poi=a++;
System.out.println("Postincrement:"+poi);
System.out.println("Enter a number:");
b=in.nextInt();
prd=--b;
System.out.println("Predecrement:"+prd);
pod=b--;
System.out.println("Postdecrement:"+pod);
}
}