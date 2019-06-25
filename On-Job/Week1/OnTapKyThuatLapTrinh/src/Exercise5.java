/*5.Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước*/

import java.util.Scanner;

public class Exercise5 {
	public static int EnterValue(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		int n=0;
		while(check==false){
			System.out.print(" ");
			try{
				n= input.nextInt();
				if (n>=0) {
				check= true;
				}
				else {
					System.out.println("Please enter correct Integer (>=0)");
					System.out.print("Enter value: ");
				}
			}catch(Exception e){
				input.nextLine();
			}
		}
		return (n);
	}
	public static boolean isPrime(int x) { //Check number is Prime?
		int m= (int) Math.sqrt(x);
		for (int i=2;i<=m;i++)
		{
			if (x%i==0)
				return false;
		}
		return true;
	}
	public static void list(int n) {
		if (n<3) {
			System.out.println("Khong co so nguyen to nho hon "+n);
		}
		int i=2;
		while (i<n) {
			if (isPrime(i)==true) {
			System.out.print(" "+i);
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
