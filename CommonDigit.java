import java.io.*;
import java.util.*;
class CommonDigit
{
public static void main(String args[])
{
int num1,num2;
Scanner in=new Scanner(System.in);
System.out.println("Enter the num1:");
num1=in.nextInt();
System.out.println("Enter the num2:");
num2=in.nextInt();
System.out.println("Result:"+check(num1,num2));
}
public static boolean check(int a,int b)
{
if(a<=25||b>=75)
return false;
else
{
int p=a%10;
int q=b%10;
p=p/10;
q=q/10;
return(p==q||p==b||q==a||a==b);
}
}
}