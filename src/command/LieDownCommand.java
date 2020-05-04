package command;

public class LieDownCommand implements Command {

	private TrainingPerson trainingPerson;
	
	public LieDownCommand(TrainingPerson trainingPerson) {
      this.trainingPerson=trainingPerson;
	}

	@Override
	public void execute() {
		System.out.println("Lie Down!");
		trainingPerson.lieDown();
	}

}
