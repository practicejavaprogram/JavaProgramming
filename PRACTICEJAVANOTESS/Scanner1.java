class Scanner1
{
public static void main(String[] args)//method
{
  java.util.Scanner scn=new java.util.Scanner(System.in);
    System.out.println("Enter the number");
int a=scn.nextInt();
System.out.println("Enter Your Name");
  String n=scn.next();
//int b=scn.nextBoolean();
//int c=scn.nextDouble();
//int d=scn.nextLong();
//int e-scn.nextShort();

System.out.println("a="+a); 
System.out.println("Your name is "+n);
}
}