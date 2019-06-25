import java.util.Scanner;

public class Exercise4 {
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
	public static boolean isPrime(int x) { //Kiểm tra thừa số nguyên tố
		int m= (int) Math.sqrt(x);
		for (int i=2;i<=m;i++)
		{
			if (x%i==0)
				return false;
		}
		return true;
	}
	public static void listPrime(int x) {
		for (int i=2;i<x;i++)
		{
			while (isPrime(i) && (x%i==0))
			{
				System.out.println(+i+ " ");
				x=x/i;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value: ");
		int n = EnterValue();
		listPrime(n);
	}

}
