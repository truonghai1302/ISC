//6.Viết chương trình liệt kê n số nguyên tố đầu tiên.

import java.util.Scanner;

public class Exercise6 {
	public static boolean isPrime(int x) { //Kiểm tra thừa số nguyên tố
		int m= (int) Math.sqrt(x);
		for (int i=2;i<=m;i++)
		{
			if (x%i==0)
				return false;
		}
		return true;
	}
	public static int EnterValue(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		int n=0;
		while(check==false){
			System.out.print(" ");
			try{
				n= input.nextInt();
				if (n>0) {
				check= true;
				}
				else {
					System.out.println("Please enter correct number (>0)");
					System.out.print("Enter value: ");
				}
			}catch(Exception e){
				input.nextLine();
			}
		}
		return (n);
	}
	public static void list(int n) {
		int i=2;
		while (n >0) {
			if (isPrime(i)==true) {
				System.out.print(i+" ");
				n--;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter value of n: ");
		int n= EnterValue();
		list(n);
	}

}
