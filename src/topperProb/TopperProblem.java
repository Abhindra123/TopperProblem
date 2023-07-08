package topperProb;
import java.io.*;
import java.util.*;
public class TopperProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();

		int odd=0;
		int even=0;
		while(number>0) {
			int digit=number%10;
			if(digit%2!=0) {
				odd=odd+digit;
				
			}
			else {
				even=digit;
			}
			number=number/10;
		}
		if(odd==even) {
			System.out.print("true");
		}
		else {
			System.out.print("false");

		}
	}

}
