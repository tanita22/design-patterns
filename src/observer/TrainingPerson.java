package observer;

import java.util.ArrayList;
import java.util.List;


public class TrainingPerson implements Observable{

	private List<Observer> onlineObservers = new ArrayList<Observer>();
	private String exercise;
	
	public void setExercise(String exercise) {
		this.exercise=exercise;
		this.notifyObservers();
	}

	
	@Override
	public void subscribe(Observer onlineObservers) {
		onlineObservers.setTrainingPerson(this);
		this.onlineObservers.add(onlineObservers);
	}

	@Override
	public void unsubscribe(Observer onlineObservers) {
		this.onlineObservers.remove(onlineObservers);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer onlineObservers: this.onlineObservers) {
			onlineObservers.update();
		}
	}


	@Override
	public String getUpdate() {
		return exercise;
	}

}
