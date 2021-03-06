public interface Subject { //Observer data structure
	/* Registers an Observer */
	public void registerObserver(Observer o);
	/* Unregisters an Observer */
	public void unregisterObserver(Observer o);
	/* Notify the Observers */
	public void notifyObservers();
}
