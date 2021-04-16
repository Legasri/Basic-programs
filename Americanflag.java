import java.io.*;
import java.util.Scanner;
class Americanflag
{
public static void main(String args[])
{
int i=1;
String str1,str2,str3;
str1="* * * * * * ==================================";
str2=" * * * * *  ==================================";
str3="==============================================";
while(i<=15)
{
if(i<9)
{
if(i%2==0)
System.out.println(str2);
else
System.out.println(str1);
}
else
System.out.println(str3);
i++;
}
}
}
