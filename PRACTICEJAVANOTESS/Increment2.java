class Increment2
{
public static void main(String[] args)//method
{

int a=1;
int b=1;
int c=1;

  //1 + 1 + 2 = 4  //a=2+2+2=6
a= ++a + b++ + c++;
  //6 + 2 + 1 = 9   //b=7+2+2=11
b= a++ + ++b + ++c;
  //6 + 11 + 2 = 18 //c=6+11+2=19
c= ++a + b++ + c++;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}