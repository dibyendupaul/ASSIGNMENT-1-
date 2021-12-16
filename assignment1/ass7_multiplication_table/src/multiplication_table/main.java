package multiplication_table;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number which multiplication table you want to find = ");
		int multiplication  = sc.nextInt();
	   for(int i=1; i<=10;i++) {
		   int result = multiplication *i;
		   System.out.println(" the multiplication table of" +multiplication );
		   System.out.println (+ result);
	        System.out.println();

}
}
}