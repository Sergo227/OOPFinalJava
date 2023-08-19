package calculyator;
public class AdditionStrategy implements CalculationStrategy {
   public AdditionStrategy() {
   }

   public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
      double real = num1.getRealPart() + num2.getRealPart();
      double imaginary = num1.getImaginaryPart() + num2.getImaginaryPart();
      return new SimpleComplexNumber(real, imaginary);
   }
}