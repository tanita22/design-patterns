package command;

public class GetUpCommand implements Command {

	private TrainingPerson trainingPerson;
	
	public GetUpCommand(TrainingPerson trainingPerson) {
		this.trainingPerson=trainingPerson;
	}

	@Override
	public void execute() {
		System.out.println("Get up!");
		trainingPerson.getUp();
	}

}
