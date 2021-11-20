import java.util.Scanner;
 
public class CalculateLCM{
	public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	System.out.print("Enter the num1:");
	int num1 =in.nextInt();
	System.out.print("Enter the num2:");
	int num2 =in.nextInt();
	int lcm = (num2 == num1 || num2 == 1) ? num1 :(num1 == 1 ? num2 : 0);
		if (lcm == 0) {
			int num3 = num1, num4 = num2;
			while (num3 != num4) {
				while (num3 < num4) { 
					num3 += num1; 
				}
				while (num4 < num3) { 
					num4 += num2;
				}
			}  
			lcm = num3;
		}
		System.out.println("lcm(" + num1 + ", " + num2 + ") = " + lcm);
	}
}