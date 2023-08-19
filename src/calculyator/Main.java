package calculyator;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ComplexNumberFactory factory = new SimpleComplexNumberFactory();
      CalculationStrategy strategy = new AdditionStrategy();
      ComplexCalculator calculator = new ComplexCalculator(factory, strategy);
      calculator.addListener(new LogOperationListener());
 
      String choice = "";
      while(!choice.equals("4")) {
         ComplexNumber num1 = readComplexNumber1(scanner);
         ComplexNumber num2 = readComplexNumber2(scanner);
         System.out.println("\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044e: ");
         System.out.println("1 - \u0441\u043b\u043e\u0436\u0435\u043d\u0438\u0435\n2 - \u0443\u043c\u043d\u043e\u0436\u0435\u043d\u0438\u0435\n3 - \u0434\u0435\u043b\u0435\u043d\u0438\u0435\n4 - \u0432\u044b\u0445\u043e\u0434");
         PrintStream var10000;
         double var10001;
         switch (scanner.nextLine()) {
            case "1":
               ComplexNumber resultAddtion = calculator.add(num1, num2);
               var10000 = System.out;
               var10001 = resultAddtion.getRealPart();
               var10000.println("\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442: " + var10001 + " + " + resultAddtion.getImaginaryPart() + "i");
               System.out.println();
               break;
            case "2":
               ComplexNumber resultMultiplication = calculator.multiply(num1, num2);
               var10000 = System.out;
               var10001 = resultMultiplication.getRealPart();
               var10000.println("\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442: " + var10001 + " * " + resultMultiplication.getImaginaryPart() + "i");
               System.out.println();
               break;
            case "3":
               ComplexNumber resultDivision = calculator.divide(num1, num2);
               var10000 = System.out;
               var10001 = resultDivision.getRealPart();
               var10000.println("\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442: " + var10001 + " / " + resultDivision.getImaginaryPart() + "i");
               System.out.println();
               break;
            case "4":
               break;
            default:
               System.out.println("\u041d\u0435\u043a\u043e\u0440\u0440\u0435\u043a\u0442\u043d\u044b\u0439 \u0432\u0432\u043e\u0434");
         }
      }

   }

   private static ComplexNumber readComplexNumber1(Scanner scanner) {
      System.out.println("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u0443\u044e \u0438 \u043c\u043d\u0438\u043c\u0443\u044e \u0447\u0430\u0441\u0442\u044c \u043f\u0435\u0440\u0432\u043e\u0433\u043e \u043a\u043e\u043c\u043f\u043b\u0435\u043a\u0441\u043d\u043e\u0433\u043e \u0447\u0438\u0441\u043b\u0430 \u0447\u0435\u0440\u0435\u0437 \u043f\u0440\u043e\u0431\u0435\u043b:");
      double realPart = scanner.nextDouble();
      double imaginaryPart = scanner.nextDouble();
      scanner.nextLine();
      ComplexNumberFactory factory = new SimpleComplexNumberFactory();
      return factory.createComplexNumber(realPart, imaginaryPart);
   }

   private static ComplexNumber readComplexNumber2(Scanner scanner) {
      System.out.println("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u0443\u044e \u0438 \u043c\u043d\u0438\u043c\u0443\u044e \u0447\u0430\u0441\u0442\u044c \u0432\u0442\u043e\u0440\u043e\u0433\u043e \u043a\u043e\u043c\u043f\u043b\u0435\u043a\u0441\u043d\u043e\u0433\u043e \u0447\u0438\u0441\u043b\u0430 \u0447\u0435\u0440\u0435\u0437 \u043f\u0440\u043e\u0431\u0435\u043b:");
      double realPart = scanner.nextDouble();
      double imaginaryPart = scanner.nextDouble();
      scanner.nextLine();
      ComplexNumberFactory factory = new SimpleComplexNumberFactory();
      return factory.createComplexNumber(realPart, imaginaryPart);
   }
}
