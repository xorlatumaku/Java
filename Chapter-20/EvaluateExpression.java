import java.util.Stack;

public class EvaluateExpression {
  public static void main(String[] args) {
    // Check number of arguments passed
    if (args.length != 1) {
      System.out.println("Usage: java EvaluateExpression \"expression\"");
      System.exit(1);
    }

    try {
      System.out.println(evaluateExpression(args[0]));
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println("Wrong expression: " + args[0]);
    }
  }

  // Evaluate an expreesion
  public static int evaluateExpression(String expression) {
    // Create operandStack to store operands
    Stack<Integer> operandStack = new Stack<>();

    // Create operatorStack to store operators
    Stack<Character> operatorStack = new Stack<>();

    // Insert blanks around (, ), +, -, /, and *
    expression = insertBlanks(expression);

    // Extract operands and operators 
    String[] tokens = expression.split(" ");

    // Phase 1: Scan tokens
    for (String token : tokens) {
      if (token.length() == 0)  // Blank space
        continue; // Back to the while loop to extract the next token
      else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
        // Process all +, -, *, / in the top of the operator stack
        while (!operatorStack.isEmpty() && 
          (operatorStack.peek() == '+'  ||
           operatorStack.peek() == '-'  ||
           operatorStack.peek() == '*'  ||
           operatorStack.peek() == '/')) {
           processAnOperator(operandStack, operatorStack);
        }

        // Push the + or - operator into the operator stack
        operatorStack.push(token.charAt(0));
      }
      else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
        // Process all *, / in the top of the operator stack
        while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
          processAnOperator(operatorStack, operatorStack);
        }

        // Push the * or / operator into the operator stack
        operatorStack.push(token.charAt(0));
      }
      else if (token.trim().charAt(0) == '(') {
        operatorStack.push('(');  // Push '(' stack
      }
    }
  }
}
