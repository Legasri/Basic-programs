import java.io.*;
import java.util.*;
class ArithOp
{
public static void main(String args[])
{
int num1,num2,add,sub,mul,div,mod;
Scanner in=new Scanner(System.in);
System.out.println("Input first number:");
num1=in.nextInt();
System.out.println("Input second number:");
num2=in.nextInt();
add=num1+num2;
sub=num1-num2;
mul=num1*num2;
div=num1/num2;
mod=num1%num2;
System.out.println("add="+add);
System.out.println("sub="+sub);
System.out.println("mul="+mul);
System.out.println("div="+div);
System.out.println("mod="+mod);
}
}
