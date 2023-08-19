package calculyator;

public class PolarComplexNumber implements ComplexNumber {
   private double magnitude;
   private double phase;

   public PolarComplexNumber(double magnitude, double phase) {
      this.magnitude = magnitude;
      this.phase = phase;
   }

   public double getRealPart() {
      return this.magnitude * Math.cos(this.phase);
   }

   public double getImaginaryPart() {
      return this.magnitude * Math.sin(this.phase);
   }
}