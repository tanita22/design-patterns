package command;

public class OnlineSubscriber {
private String exercise;
private String subcriberName;

public OnlineSubscriber(String name) {
	this.setSubscriberName(name);
}

public String getSubcriberName() {
	return subcriberName;
}

public void setSubscriberName(String subscriberName) {
	this.subcriberName=subcriberName;
}

public void setExercise(String exercise) {
	this.exercise=exercise;
	System.out.println("Online training person" +this.getSubcriberName() + "change the exercise to " + this.exercise );
}

}
