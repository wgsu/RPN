
import java.util.Stack;
import java.util.Scanner;

public class Rpnc {
	private final char add = '+';
	private final char multiply = '*';
	Stack<Integer> stack = new Stack<Integer>();

	public int eva(String expression) {
		int a, b, result = 0;
		String used;
		Scanner user = new Scanner(expression);
		while (user.hasNext()) {
			used = user.next();

			if (isOperator(used)) {
				a = stack.pop();
				b = stack.pop();
				result = Op(used.charAt(0), a, b);
				stack.push(result);
				System.out.println(result + " is here");
			} else
				stack.push(new Integer(used));
		}
		return result;
	}

	private boolean isOperator(String used) {

		return (used.equals("+") || used.equals("*"));

	}

	private int Op(char operation, int a, int b) {

		int result = 0;
		System.out.println("in OP " + operation + ", args " + a + " " + b);
		switch (operation) {
		case add:
			result = a + b;
			break;
		case multiply:
			result = a * b;
			break;

		}

		return result;
	}
}
