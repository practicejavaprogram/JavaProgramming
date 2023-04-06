class Decrement3
{
public static void main(String[] args)//method
{

int x=1;
int y=1;
// 0 - 1 = -1  pending
x= --x - --y;
// -1 - -2= 1
y=x-- - y--;

System.out.println(x);
System.out.println(y);

}
}