+import java.util.*;
 +public class fact
 +{
 +public static void main(String[] args)
 +{
 +Scanner sc=new Scanner(System.in);
 +int a=sc.nextInt();
 +int i=0;
 +int fact=0;
 +while(i<=a)
 +{
 +fact=fact*i;
 +i=i+1;
 +}
 +System.out.println(fact);
 +}}
