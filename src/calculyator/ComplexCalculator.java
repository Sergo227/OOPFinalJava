package calculyator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComplexCalculator {
   private List<OperationListener> listeners = new ArrayList();
   private ComplexNumberFactory factory;
   private CalculationStrategy strategy;

   public ComplexCalculator(ComplexNumberFactory factory, CalculationStrategy strategy) {
      this.factory = factory;
      this.strategy = strategy;
   }

   public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
      ComplexNumber result = this.strategy.calculate(num1, num2);
      String var10001 = num1.toString();
      this.notifyListeners("\u0441\u043b\u043e\u0436\u0435\u043d\u0438\u0435: " + var10001 + " + " + num2.toString() + " = " + result.toString());
      return result;
   }

   public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
      ComplexNumber result = this.strategy.calculate(num1, num2);
      String var10001 = num1.toString();
      this.notifyListeners("\u0443\u043c\u043d\u043e\u0436\u0435\u043d\u0438\u0435: " + var10001 + " * " + num2.toString() + " = " + result.toString());
      return result;
   }

   public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
      ComplexNumber result = this.strategy.calculate(num1, num2);
      String var10001 = num1.toString();
      this.notifyListeners("\u0434\u0435\u043b\u0435\u043d\u0438\u0435: " + var10001 + " / " + num2.toString() + " = " + result.toString());
      return result;
   }

   public void addListener(OperationListener listener) {
      this.listeners.add(listener);
   }

   public void removeListener(OperationListener listener) {
      this.listeners.remove(listener);
   }

   private void notifyListeners(String operation) {
      Iterator var2 = this.listeners.iterator();

      while(var2.hasNext()) {
         OperationListener listener = (OperationListener)var2.next();
         listener.onOperationPerformed(operation);
      }

   }
}
