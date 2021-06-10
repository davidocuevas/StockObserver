
public class Driver {

	public static void main(String[] args) {
		Stock wallStreet = new Stock();
		//Trader Amy = new Trader("amy");
		//Trader John = new Trader("john");
		Trader Jacob = new Trader(wallStreet);

		Stock MSFT = new Stock("MSFT");
		Stock GOOG = new Stock("google");
		Stock AAPL = new Stock("APPLE");
		
		//Amy.addStock(AAPL);
		//John.addStock(GOOG);
		Jacob.addStock(AAPL);
		Jacob.addStock(MSFT);
		wallStreet.submitTrade(new Trade(Jacob, 150, MSFT, "buy"));
		wallStreet.submitTrade(new Trade(Jacob, 209, AAPL, "sell"));
		//MSFT.submitTrade(new Trade(Jacob,200,"sell"));

		//System.out.println(Jacob);
	}

}
