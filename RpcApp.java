
// this is a program that that accept and calculate an expression containing +and * operations from user input using the rpn notation.  
import java.util.Stack;
import java.util.Scanner;

public class RpcApp {
	public static void main(String[] args) {
		String expression;
		int result;
		try {
			Scanner in = new Scanner(System.in);
			while (true) {
				Rpnc evaluator = new Rpnc();
				System.out.println("Enter");
				expression = in.nextLine();

				result = evaluator.eva(expression);
				System.out.println("the result is " + result);
			}
		} catch (Exception e) {
			System.out.println("is empty " + e);
		}

	}
}