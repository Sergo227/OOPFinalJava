package calculyator;

public class LogOperationListener implements OperationListener {
   public LogOperationListener() {
   }

   public void onOperationPerformed(String operation) {
      System.out.println("\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f " + operation);
   }
}