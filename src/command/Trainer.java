package command;

public class Trainer {

	private Command command;
	
	public void setCommand(Command command) {
		this.command=command;
	}
    public void sayNewCommand() {
    	System.out.println();
    	System.out.println("The trainer gave new exercise: ");
    	this.command.execute();
    } 
}
