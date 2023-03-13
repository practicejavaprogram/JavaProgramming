class Swap2
{

public static void main(String[] args)//method
{

int a=100;//200
int b=200;//100

System.out.println(a);
System.out.println(b);
System.out.println("Before Swapping");
System.out.println("After Swapping");

a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);

}
}