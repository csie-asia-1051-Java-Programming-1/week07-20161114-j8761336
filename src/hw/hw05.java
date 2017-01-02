package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Long a=scn.nextLong();
		lala(a);
	}
	public static void lala(Long x){
		Long sum=(long) 0;
		while(x!=0){
			sum=(sum*10)+x%10;
			x=(x-x%10)/10;
		}
		System.out.println(sum);
	}
}
