package calculyator;

public class PolarComplexNumberFactory implements ComplexNumberFactory {
   public PolarComplexNumberFactory() {
   }

   public ComplexNumber createComplexNumber(double realPart, double imaginaryPart) {
      double magnitude = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
      double phase = Math.atan2(imaginaryPart, realPart);
      return new PolarComplexNumber(magnitude, phase);
   }
}