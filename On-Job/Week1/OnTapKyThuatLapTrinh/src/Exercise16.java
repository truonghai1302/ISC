
/*16.Nhập số liệu  cho dãy số thực  a0 , a1 ,..., an-1 . 
In ra màn hình số lần xuất hiện của các phần tử.*/

import java.util.Scanner;

public class Exercise16 {
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
	public static int countElement(int a[], int n, int i){
		int count= 0;
		for(int j=0 ; j<n ; j++){
			if(a[j]== i)
			count ++;
		}
		return (count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i;
			System.out.print("EnterValue n= ");
			n= EnterValue();
			int[] array= new int[n];
			for(i=0 ; i<n ; i++){
				System.out.print("EnterValue Element " +(i+1)+": ");
				array[i]= EnterValue();
			}
			for(i=0 ; i<n ; i++){
				if(countElement(array, i, array[i])==0){
					System.out.println("Element "+array[i]+ " exist "+countElement(array, n, array[i])+" times");
				}
			}
	}

}
