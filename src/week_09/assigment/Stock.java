package week_09.assigment;

public class Stock {
    //A string data 􀍽eld named symbol for the stock’s symbol.
    //■ A string data 􀍽eld named name for the stock’s name.
    //■ A double data 􀍽eld named previousClosingPrice that stores the stock price for the previous day.
    //■ A double data 􀍽eld named currentPrice that stores the stock price for the
    //current time.
    //■ A constructor that creates a stock with the speci􀍽ed symbol and name.
    //■ A method named getChangePercent() that returns the percentage changed
    //from previousClosingPrice to currentPrice .
    //Draw the UML diagram for the class and then implement the class. Write a test
    //program that creates a Stock object with the stock symbol ORCL , the name
    //Oracle Corporation , and the previous closing price of 34.5 . Set a new current
    //price to 34.35 and display the price-change percentage.



    String symbol ;
    String name ;
    double previousClosingPrice ;
    double currentPrice ;

    Stock(){

    }
    public Stock(String newSymbol,String newName){
        symbol = newSymbol;
        name = newName;
    }

public double getChangePercent( double previousClosingPrice ,double currentPrice ){
    return ((currentPrice / previousClosingPrice) - 1) * 100;
}

}
