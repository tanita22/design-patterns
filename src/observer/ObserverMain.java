package observer;

import command.OnlineSubscriber;

public class ObserverMain {

	public static void main(String[] args) {
		TrainingPerson trainingPerson=new TrainingPerson();
		Trainer trainer=new Trainer(trainingPerson);
		
		Observer onlineSubcriber1=new OnlineObservers("Tanya");
		Observer onlineSubcriber2=new OnlineObservers("Ivan");
		Observer onlineSubcriber3=new OnlineObservers("Denitsa");
		
		trainingPerson.subscribe(onlineSubcriber1);
		trainingPerson.subscribe(onlineSubcriber2);
		trainingPerson.subscribe(onlineSubcriber3);
		
		/*Observer onlineSubscriber1=new OnlineObservers("Online subscriber 1");
		Observer onlineSubscriber2=new OnlineObservers("Online subscriber 2");
		Observer onlineSubscriber3=new OnlineObservers("Online subscriber 3");
		
		
		trainingPerson.subscribe(onlineSubscriber1);
		trainingPerson.subscribe(onlineSubscriber2);
        trainingPerson.subscribe(onlineSubscriber3);
		*/
		
        trainer.ChangeExercise("Get up!");
		System.out.println();
		
		trainer.ChangeExercise("Lie down!");
		System.out.println();
	}
}




