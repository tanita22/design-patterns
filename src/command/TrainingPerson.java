package command;

import java.util.ArrayList;
import java.util.List;

public class TrainingPerson {
	private Boolean doneSuccessfully;
	/*private String exercise;
	private List<OnlineSubscriber> onlineSubscriber=new ArrayList<OnlineSubscriber>();
	
	public void setExercise(String exercise) {
		this.exercise = exercise;
		for(OnlineSubscriber onlineSubscriber: this.onlineSubscriber) {
			onlineSubscriber.setExercise(this.exercise);
		}	
	}

	public void subscribe(OnlineSubscriber onlineSubscriber) {
		this.onlineSubscriber.add(onlineSubscriber);		
	}*/
	
	public void lieDown() {
		System.out.println("The command lie down is successfully done and the training person in liying down.");
		this.doneSuccessfully=true;
	}

	public void getUp() {
		System.out.println("The command get up is successfully done and the training person is getting up.");
		this.doneSuccessfully=true;
	}
	public Boolean getDoneSuccessfully(){
		return doneSuccessfully;
	}
	

	private String exercise;
	private List<OnlineSubscriber> onlineSubscriber = new ArrayList<OnlineSubscriber>();

	
	
	public void setExercise(String exercise)
	{
		this.exercise = exercise;
		for(OnlineSubscriber onlineSubscriber: this.onlineSubscriber) {
			onlineSubscriber.setExercise(this.exercise);
		}		
	}
	public void subscribe(OnlineSubscriber onlineSubscriber) {
		this.onlineSubscriber.add(onlineSubscriber);	
	}
}