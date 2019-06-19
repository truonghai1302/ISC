import java.util.Scanner;		

public class Test {

    public static int nhap()
    {
        Scanner input = new Scanner(System.in);
        boolean check= false;
		int n=0;
		while(check!= true){
			System.out.print(" ");
			try{
				n= input.nextInt();
				if (n>=0)
				{
				check= true;
				}
			}catch(Exception e){
				System.out.println("Nhap lai: ");
				input.nextLine();
			}
		}
		return (n);
    }
    public static int UCLN(int a, int b){
		while(a!= b){
			if(a>b) a= a-b;
			else b= b-a;
		}
		return (a);
	}
    public static void main(String[] args) {
        System.out.println("Nhap a");
		int a = nhap();
		System.out.println("Nhap b");
		int b= nhap();
		System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b));
		System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
    }

}