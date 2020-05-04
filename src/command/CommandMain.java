package command;

public class CommandMain {

	public static void main(String[] args) {
		
		Trainer trainer=new Trainer();
		TrainingPerson trainingPerson=new TrainingPerson();
		
		Command getUpCommand = new GetUpCommand(trainingPerson);
		Command lieDownCommand = new LieDownCommand(trainingPerson);
		
		trainer.setCommand(getUpCommand);
		trainer.sayNewCommand();
		
		trainer.setCommand(lieDownCommand);
		trainer.sayNewCommand();
	
		/*OnlineSubscriber onlineSubcriber1=new OnlineSubscriber("Tanya");
		OnlineSubscriber onlineSubcriber2=new OnlineSubscriber("Ivan");
		OnlineSubscriber onlineSubcriber3=new OnlineSubscriber("Denitsa");
		
		trainingPerson.subscribe(onlineSubcriber1);
		trainingPerson.subscribe(onlineSubcriber2);
		trainingPerson.subscribe(onlineSubcriber3);*/
	
		
	}
}
