import java.io.*;
import java.util.*;
public class num
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++)
{
a[i]=scan.nextInt();

if (a[i]>0)
System.out.println("positive");

else if(a[i]<0)

System.out.println("negative");

else

System.out.println("zero");
}
}
}
