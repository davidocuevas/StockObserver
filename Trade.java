public class Trade {
	private Trader trader;
	private double amount;
	private Stock stock;
	private String transType;
	
	public Trade(Trader trader, double amount, Stock stock, String transType) {
		this.trader = trader;
		this.amount = amount;
		this.stock = stock;
		this.transType = transType;
		trader.addStock(stock);
	}
	
	public String toString() {
		return "Trader: " + trader + "\n\t$" + amount + "\n\tstock: " + stock + "\n\ttranstype: " + transType;
	}
}
