package observer;

public class Trainer {
	TrainingPerson trainingPerson;
	public Trainer(TrainingPerson trainingPerson)
	{
		this.trainingPerson = trainingPerson;
	}
	public void ChangeExercise(String newExercise)
	{
		this.trainingPerson.setExercise(newExercise);
	}
	

}
