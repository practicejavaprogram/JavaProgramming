class Increment2
{
public static void main(String[] args)//method
{

int a=1;
int b=1;
int c=1;

  //2 + 1 + 1= 4
a= ++a + b++ + c++;
  //4 + 2 + 2=8
b= a++ + ++b + ++c;
  //5 + 8 + 1=14
c= ++a + b++ + c++;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}