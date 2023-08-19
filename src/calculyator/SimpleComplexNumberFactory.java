package calculyator;

public class SimpleComplexNumberFactory implements ComplexNumberFactory {
   public SimpleComplexNumberFactory() {
   }

   public ComplexNumber createComplexNumber(double realPart, double imaginaryPart) {
      return new SimpleComplexNumber(realPart, imaginaryPart);
   }
}
