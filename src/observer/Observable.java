package observer;

public interface Observable {
	public void subscribe(Observer onlineObservers);
	public void unsubscribe(Observer onlineObservers);
	public void notifyObservers();
	public String getUpdate();
}