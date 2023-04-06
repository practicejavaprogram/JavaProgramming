class Decrement2
{
public static void main(String[] args)//method
{

int a=1;
int b=1;
// 0 - 1
a= --a - b--;
// -1 - -1
b= a-- - --b;

System.out.println(a);
System.out.println(b);
}
}