package stock;

/*
* (The Stock class)
design a class named Stock that contains:
1.A string data field named symbol for the stock’s symbol.
2. A string data field named name for the stock’s name.
3. A double data field named previousClosingPrice that stores the stock
price for the previous day.
4. A double data field named currentPrice that stores the stock price for the
current time.
5.A constructor that creates a stock with the specified symbol and name.
6. A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
*
* */
public class Stock {
   String symbol = "$";
   String name = "tesla";
   double previousClosingPrice;
   double currentPrice;

   Stock(){

   }

   public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
      this.symbol = symbol;
      this.name = name;
      this.previousClosingPrice = previousClosingPrice;
      this.currentPrice = currentPrice;

   }

   public double setCurrentPrice(double currentPrice) {
      return this.currentPrice = currentPrice;
   }

   public  double setpreviousClosingprice(double previousClosingPrice){
      return this.previousClosingPrice = previousClosingPrice;
   }

   public  void getPercentage(){
      System.out.println( ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
   }

}
