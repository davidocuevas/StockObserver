import java.util.ArrayList;

public class Stock implements Subject {
	private ArrayList<Observer> traders;
	private Trade latestTrade;
	private String stockName;
	
	public Stock() {
		traders = new ArrayList<Observer>();
	}
	public Stock(String stockName) {
		traders = new ArrayList<Observer>();
		if (stockName.equalsIgnoreCase("google") || stockName.equalsIgnoreCase("GOOG")) {
			this.stockName = "GOOG";
		}
		else if (stockName.equalsIgnoreCase("apple") || stockName.equalsIgnoreCase("AAPL")) {
			this.stockName = "AAPL";
		}
		else if (stockName.equalsIgnoreCase("microsoft") || stockName.equalsIgnoreCase("MSFT")) {
			this.stockName = "MSFT";
		}
		else {
			this.stockName = stockName;
		}
	}
	
	@Override
	public void registerObserver(Observer o) {
		traders.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		traders.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < traders.size(); i++) {
			Observer obs = traders.get(i);
			obs.update(latestTrade);

		}
	}
	
	public void submitTrade(Trade latestTrade) {
		this.latestTrade = latestTrade;
		notifyObservers();
	}
	
	public String getStockName() {
		return stockName;
	}


	public String toString() {
		return stockName;
	}

}
