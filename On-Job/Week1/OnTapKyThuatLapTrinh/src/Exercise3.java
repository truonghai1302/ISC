/*Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. 
Ví dụ: Số  8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.*/
import java.util.Scanner;

public class Exercise3 {
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
    public static int SumDigits(int a){
    	int sum=0; //Giá trị tổng
    	while (a>0)
    	{
    		sum+=a%10; //Chia 10 lấy phần dư
    		a= a/10;	//Chia 10 lấy phần dư
    	}
    	return sum;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Value: ");
		int x = EnterValue();
		System.out.println ("Sum is: "+SumDigits(x));
	}

}
