import java.util.ArrayList;

public class Trader implements Observer {
	private String name;
	private ArrayList<Subject> stocks;
	private Subject wallStreet;

	public Trader(Subject wallStreet)
	{
		this.wallStreet = wallStreet;
		wallStreet.registerObserver(this);
		stocks = new ArrayList<>();
	}

	public Trader(String name) {
		this.name = name.toLowerCase();
		stocks = new ArrayList<Subject>();
	}


	public void addStock(Stock stock) {
		stocks.add(stock);
	}
	public void update(Object newState) {
		Trade latestTrade = (Trade)newState;
		display(latestTrade);
	}

	public void display(Trade latestTrade)
	{
		System.out.println("The latest trade is " + latestTrade);
	}

	/*
	public String toString() {
		String s = "";
		for (int i = 0; i < stocks.size(); i++) {
			s += "\n\t" + stocks.get(i).toString();
		}
		return "Name: " + name + s;
	}

	 */
}
