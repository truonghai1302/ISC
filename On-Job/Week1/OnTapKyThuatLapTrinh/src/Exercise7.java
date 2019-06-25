
/*7.Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2. 
Hãy viết chương trình tìm số Fibonacci thứ n.*/

import java.util.Scanner;

public class Exercise7 {
	public static int EnterValue(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		int n=0;
		while(check==false){
			System.out.print(" ");
			try{
				n= input.nextInt();
				if (n>1) {
				check= true;
				}
				else {
					System.out.println("Please enter correct number (>1)");
					System.out.print("Enter value: ");
				}
			}catch(Exception e){
				input.nextLine();
			}
		}
		return (n);
	}
	public static int fibonacci(int n) {
		 if(n == 0)
		   {
		      return 0;
		   }
		   if(n == 1)
		   {
		      return 1;
		   }
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter value of n: ");
		int n= EnterValue();
		System.out.println("Number of fibonacci at n: "+fibonacci(n));
	}
}