import java.io.*;
import java.util.*;

public interface AdvancedArithmetic {
	int divisor_sum(int n);
}


class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		int answer = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if ((n % i) == 0) {
                answer += i;
            }
        }
        
        return (answer + n);
	}
}

public class InterfaceExercise {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        AdvancedArithmetic myCalculator = new MyCalculator();
        
        int n=sc.nextInt();
        int sum=myCalculator.divisorSum(n);
        
        System.out.println("I implemented: AdvancedArithmetic\n" + sum);
	}
}