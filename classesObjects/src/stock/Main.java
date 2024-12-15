package stock;

public class Main {
    public static void main(String[] args) {
      Stock stk1 = new Stock();

      stk1.setCurrentPrice(56);
      stk1.setpreviousClosingprice(40);

      stk1.getPercentage();
    }
}
