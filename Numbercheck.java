import java.io.*;
import java.util.*;
class Numbercheck
{
public static void main(String args[])
{
int num1,num2,small;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number1:");
num1=in.nextInt();
System.out.println("Enter the number2:");
num2=in.nextInt();
System.out.println("Result:"+check(num1,num2));
}
public static int check(int a,int b)
{
if(a==b)
return 0;
if(a%6==b%6)
return (a<b)?a:b;
return (a>b)?a:b;
}
}