
/*19.Viết chương trình liệt kê tất cả các số nguyên tố có 5 chữ số sao cho tổng 
của các chữ số trong mỗi số nguyên tố đều bằng S cho trước.*/
import java.util.Scanner;

public class Exercise19 {
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
					System.out.println("Please enter correct number (0)");
					System.out.print("Enter value: ");
				}
			}catch(Exception e){
				input.nextLine();
			}
		}
		return (n);
	}
    public static boolean checkSNT(int n){
		if(n>1){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0) return false;
		}
		return true;
	}
		else return false;
	}
    public static int tongChuSo(int n){
		int T=0;
		while(n>0){
			T+= n%10;
			n/= 10;
		}
		return (T);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.print("EnterValue S= ");
			int s= EnterValue();
			int i,count=0;
			System.out.println("Cac so nguyen to co tong cac chu so co tong bang "+s+" la: ");
			for(i=10000 ; i<=99999 ; i++){
				if(checkSNT(i)){
					if(tongChuSo(i)== s) {
						System.out.println(" "+i);
						count++;
					}
					else continue;
				}
			}
			System.out.println("Co "+count+" so thoa man");
	}

}
