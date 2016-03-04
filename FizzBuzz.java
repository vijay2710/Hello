public class FizzBuzz {                      // Everything in Java is a class
  public static void main(String[] args) {   // Every program must have main()
Scanner s = new scanner(System.in);
system.out.println("Enter the number");
int n = s.nextInt();
   for(int i=1;i<=n;i++)
   {
   	if(i%3==0)
   		System.out.println("Fizz")
   	else if(i%5==0)
   		 System.out.println("Buzz")
   		else if((i%3==0)&&(i%5==0))
   			System.out.println("FizzBuzz");
   		else System.out.println(i);
   }
}
}