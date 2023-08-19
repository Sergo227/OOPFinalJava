package calculyator;

public class MultiplicationStrategy implements CalculationStrategy {
   public MultiplicationStrategy() {
   }

   public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
      double magnitude = Math.sqrt(num1.getRealPart() * num1.getRealPart() + num1.getImaginaryPart() * num1.getImaginaryPart()) * Math.sqrt(num2.getRealPart() * num2.getRealPart() + num2.getImaginaryPart() * num2.getImaginaryPart());
      double phase = Math.atan2(num1.getImaginaryPart(), num1.getRealPart()) + Math.atan2(num2.getImaginaryPart(), num2.getRealPart());
      return new PolarComplexNumber(magnitude, phase);
   }
}