package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a=scn.nextInt();
		System.out.println(wow(a));
	}
	public static int wow(int x){
		int sum =0;
		while(x!=0){
			x=(x-x%10)/10;
			sum++;
		}
		return sum;
		
	}
}
