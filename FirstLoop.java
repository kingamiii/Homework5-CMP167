package hw5;

/*amirah igbara
 * CMP 167
 * Prof. Kelly
 * 11/5/23*/

public class FirstLoop {

	public static void main(String[] args) {
			
// declaring num and initializing to 1
int num=1;
// while loop to iterate until num<=50
while(num<=50)
{
// checking num is odd
if(num%2==1)
{
System.out.println(num+" is an odd number");
}
// condition to check if number even
if(num%2==0)
{
System.out.println(num+" is an even number");
}
// condition to check number is divisible by 2
if(num%2==0)
{
System.out.println(num+" is divisible by 2");
}
// condition to check number is divisible by 5
if(num%5==0)
{
System.out.println(num+" is divisible by 5");
}
// condition to check number is divisible by 8
if(num%8==0)
{
System.out.println(num+" is divisible by 8");
}
// condition to check number is divisible by 11
if(num%11==0)
{
System.out.println(num+" is divisible by 11");
}
// incrementing num
num++;
}

}

}
