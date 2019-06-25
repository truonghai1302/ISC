
/*17.Nhập số n và dãy các số thực  a0 , a1 ,..., an-1. 
Không đổi chỗ các phần tử và không dùng thêm mảng số thực nào khác 
(có thể dùng mảng số nguyên nếu cần) hãy cho hiện trên màn hình dãy trên theo thứ tự tăng dần.*/

import java.util.Scanner;

public class Exercise17 {
	public static int nhap(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		int n=0;
		while(!check){
			System.out.print(" ");
			try{
				n= input.nextInt();
				check= true;
			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
	}
    public static float nhapFloat(){
		Scanner input= new Scanner(System.in);
		boolean check= false;
		float n=0;
		while(!check){
			System.out.print(" ");
			try{
				n= input.nextInt();
				check= true;
			}catch(Exception e){
				System.out.println("Ban phai nhap so! hay nhap lai...");
				input.nextLine();
			}
		}
		return (n);
	}
    public static int viTriMinFloat(float a[], int n){
		float min= a[0];
		int key= 0;
		for(int j=0 ; j<n ; j++){
			if(min>a[j]){
				min= a[j];
				key= j;
			}
		}
		return (key);
	}
  public static float maxFloat(float a[], int n){
		float max= a[0];
		for(int j=0 ; j<n ; j++){
			if(max<a[j]) max= a[j];
		}
		return (max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i;
			System.out.println("Nhap n= ");
			n= nhap();
			float[] array= new float[n];
			for(i=0 ; i<n ; i++){
				System.out.println("Nhap phan tu thu " +(i+1)+" ");
				array[i]= nhapFloat();
			}
			i =0;
			System.out.println("Sap xep theo thu tu tang dan");
			while(i<n){
				System.out.println(" "+array[viTriMinFloat(array, n)]);
					array[viTriMinFloat(array, n)]= maxFloat(array, n);
			i++;
			}
	}

}