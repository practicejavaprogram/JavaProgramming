class Swap1
{

public static void main(String[] args)//method
{

int a=100;//200
int b=200;//100

//output
    //a=200
    //b=100
System.out.println(a);
System.out.println(b);
System.out.println("Before Swapping");
int temp;
temp=a;
a=b;
b=temp;
System.out.println("After Swapping");
System.out.println(a);
System.out.println(b);
}
}