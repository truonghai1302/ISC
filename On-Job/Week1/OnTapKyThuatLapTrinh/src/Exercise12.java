/*Tính giá trị của đa thức  P(x)=anxn+ an-1xn-1+ ... + a1x+ a0 theo cách tính của Horner:
	P(x)=((((anx+ an-1)x+ an-2... + a1)x+ a0*/

import java.util.Scanner;

public class Exercise12 {
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
	public static void horner(int a[], int n){
			int T=0,i,x;
			System.out.println("\n EnterValue x= ");
			x= EnterValue();
			T= a[n];
			for(i=n ; i>0 ; i--){
				T= T*x + a[i-1];
			}
			System.out.println("Gia tri cua da thuc tinh theo cong thuc Horner la: "+T);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i;
			System.out.println("EnterValue bac cua da thuc n= ");
			int n= EnterValue();
			int[] array= new int[n+1];
			for(i=n ; i>=0 ; i--){
				System.out.print("EnterValue he so cua x^"+i+" = ");
				array[i]= EnterValue();
			}
			horner(array,n);
	}

}
