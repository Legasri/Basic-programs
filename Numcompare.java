import java.io.*;
import java.util.*;
class Numcompare
{
public static void main(String args[])
{
int num1,num2;
Scanner in=new Scanner(System.in);
System.out.println("Enter num1");
num1=in.nextInt();
System.out.println("Enter num2");
num2=in.nextInt();
if(num1==num2)
System.out.println(num1+"=="+num2);
if(num1!=num2)
System.out.println(num1+"!="+num2);
if(num1<num2)
System.out.println(num1+"<"+num2);
if(num1>num2)
System.out.println(num1+">"+num2);
if(num1<=num2)
System.out.println(num1+"<="+num2);
if(num1>=num2)
System.out.println(num1+">="+num2);
}
}