import java.util.*;

public class StackExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			String input = sc.next();
			System.out.println(checkBalancedParentheses(input));
		}
	}

	private static boolean checkBalancedParentheses(String input){
		Stack<String> stack = new Stack<String>();
		boolean isBalanaced = false;

		for(int i=0; i < input.length(); i++){
			String str = ""+input.charAt(i);

			if(str.equals("(") || str.equals("[") || str.equals("{")){
				stack.push(str);
			}

			if(str.equals(")") || str.equals("]") || str.equals("}")){
				if(stack.isEmpty()){
					return false;
				}

				String opening = stack.peek();
				if(str.equals(")") && opening.equals("(")){
					stack.pop();
				}
				
				if(str.equals("]") && opening.equals("[")){
					stack.pop();
				}
				
				if(str.equals("}") && opening.equals("{")){
					stack.pop();
				}
			}			
		}
		
		if(input.length() > 0 && stack.isEmpty()){
			isBalanaced = true;
		}

		return isBalanaced;
	}
}