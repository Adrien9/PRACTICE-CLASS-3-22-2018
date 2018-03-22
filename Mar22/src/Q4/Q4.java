package Q4;
import java.util.Scanner;
public class Q4 {

	// Enter 5 numbers using scanner, save them in a keyboard and print them out.

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

		int[] num=new int[5];

		System.out.println("Enter 5 numbers.");

		num[0]=scanner.nextInt();
		num[1]=scanner.nextInt();
		num[2]=scanner.nextInt();
		num[3]=scanner.nextInt();
		num[4]=scanner.nextInt();

		System.out.println(num.length);

	}
}