package observer;

public class OnlineObservers implements Observer {

	private String exercise;
	private Observable trainingPerson;
    private String subscriberName;
	

public OnlineObservers(String name) {
	this.setSubscriberName(name);
}


public String getSubscriberName() {
	return subscriberName;
}

public void setSubscriberName(String subscriberName) {
	this.subscriberName=subscriberName;
}


	@Override
	public void update() {
		if(trainingPerson == null) {
			System.out.println("No training person.");
			return;
		}
		
		 exercise = trainingPerson.getUpdate();
		System.out.println(this.getSubscriberName() + " update exercise with: " + this.exercise);
		
	}

	@Override
	public void setTrainingPerson(Observable onlineObservers) {
	this.trainingPerson=onlineObservers;
	}


}