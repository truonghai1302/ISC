import java.util.Scanner; //Lấy dữ liệu nhập vô từ người dùng	

public class Exericse1 {
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
					System.out.println("Please enter correct Integer");
				}
			}catch(Exception e){
				input.nextLine();
			}
		}
		return (n);
	}
	public static int GCD(int a, int b) // greatest common divisor: Ước chung lớn nhất
	{
		while (a!=b) //Nếu a = b => a là UCLN
		{
			if (a>b) a=a-b;
			else b=b-a;
		}
		return (a);
	}
	public static int LCM (int a, int b) //least common multiple: Bội chung nhỏ nhất
	{
		return ((a*b)/GCD(a,b));
	}
	public static void main(String[] args)
	{
		System.out.println("Enter value of a: ");
		int a= EnterValue();
		System.out.println("Enter value of b: ");
		int b= EnterValue();
		System.out.println("GCD of "+a+" & "+b+"is: "+GCD(a,b));
		System.out.println("LCM of "+a+" & "+b+"is: "+LCM(a,b));
	}
}
