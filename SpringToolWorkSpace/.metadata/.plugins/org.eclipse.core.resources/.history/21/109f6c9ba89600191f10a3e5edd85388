import java.util.Scanner;

public class Exercise2 {
	public static void swapbase(int n,int base){
        if(n>=base) swapbase(n / base, base);
        if(n % base>9) System.out.printf("%c",n%base+55);
        else
        System.out.print((n % base));
    }
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
    public static void main(String[] args) {
                System.out.println("input n");
		int n= EnterValue();
		System.out.println("input vao co so can chuyen sang b");
		int b= EnterValue();
		System.out.println("So " +n+ " chuyen sang co so " +b+ " thanh: ");
		swapbase(n,b);
    }


}
