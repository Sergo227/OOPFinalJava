package calculyator;

public class SimpleComplexNumber implements ComplexNumber {
   private double realPart;
   private double imaginaryPart;

   public SimpleComplexNumber(double realPart, double imaginaryPart) {
      this.realPart = realPart;
      this.imaginaryPart = imaginaryPart;
   }

   public double getRealPart() {
      return this.realPart;
   }

   public double getImaginaryPart() {
      return this.imaginaryPart;
   }

   public String toString() {
      return this.realPart + " + " + this.imaginaryPart + "i";
   }
}
