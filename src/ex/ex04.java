package ex;
/* ���ϥΪ̿�J�@�ӥ���� n�A���ۨϥλ��j�I�s�L�X n! �����G�C
 * Date: 2016/11/14
 * Author: 105021026 ��ذp
 */

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		System.out.print(fun(a));
	}
	public static int fun(int x){
		if(x==1){
			return 1;
		}
		else{
			return x*fun(x-1);
		}
	}
	}

