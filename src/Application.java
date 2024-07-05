import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		if (args.length > 0) {
        	String operation =args[0];
        	executeOperation(operation, scanner);
        	} else {
            // No CLI arguments, ask for user input
            
            System.out.println("Enter operation (e.g., add, subtract, multiply, divide):");
            String operation = scanner.next();
            executeOperation(operation , scanner);
            // Further processing based on operation

        scanner.close();
    }
}

    

public static void executeOperation(String operation, Scanner scanner) {
	switch (operation.toLowerCase()) {
   case "add":
	 
     System.out.println("Enter the first operand:");
     double num1 = scanner.nextDouble();
     System.out.println("Enter the second operand:");
     double num2 = scanner.nextDouble();
     System.out.println("Result: " + add(num1, num2));
     break;
   case "factorial":
	  
     System.out.println("Enter a number:");
     double number = scanner.nextDouble();
     System.out.println("Result: " + factorial(number));
     break;
   case "subtract":
	 
     System.out.println("Enter the first operand:");
     double num_1 = scanner.nextDouble();
     System.out.println("Enter the second operand:");
     double num_2 = scanner.nextDouble();
     System.out.println("Result: " + subtract(num_1, num_2));
     break;
   case "multiply":
	   
     System.out.println("Enter the first operand:");
     double n1 = scanner.nextDouble();
     System.out.println("Enter the second operand:");
     double n2 = scanner.nextDouble();
     System.out.println("Result: " + multiply(n1, n2));
     break;
   case "divide":
	   
     System.out.println("Enter the first operand:");
     double number1 = scanner.nextDouble();
     System.out.println("Enter the second operand:");
     double number2 = scanner.nextDouble();
     System.out.println("Result: " + divide(number1, number2));
     break;
    default:
    System.out.println("Unknown operation");
    
    
 // Handle other operations
}
}

public static double add(double a, double b) {
    return a + b;
}
public static double factorial(double n) {
    if (n <= 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
public static double subtract(double a, double b) {
    return a - b;
}
public static double multiply(double a, double b) {
    return a * b;
}
public static double divide(double a, double b) {
    if (b == 0) {
    	System.out.println("Number cannot be divided by zero.");
    	return Double.NaN;
    			}else {
    				return a / b;
    			}
    			}
}







    	

    	
    	
  
 
    

    
    
    	
    






    


