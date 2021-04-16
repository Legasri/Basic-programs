import java.io.*;
import java.util.*;
class MultiplicationTable
{
public static void main(String args[])
{
int num,mul;
Scanner in=new Scanner(System.in);
System.out.println("Input a number:");
num=in.nextInt();
for(int i=1;i<=10;i++)
{
mul=num*i;
System.out.println(num+"x"+i+"="+mul);
}
}
}