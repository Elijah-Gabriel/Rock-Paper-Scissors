import java.util.*;
public class RPSHumanPlayer extends RPSPlayer
{
private Scanner keyboard;

public RPSHumanPlayer()
{
	super();
	this.keyboard = new Scanner(System.in);
}
public void chooseGesture()
{
	super.setGesture(keyboard.nextLine());
}
}
