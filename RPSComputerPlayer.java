import java.util.*;
public class RPSComputerPlayer extends RPSPlayer
{
private Random rand;
private int rnum;

public RPSComputerPlayer()
{
	super();
	rand = new Random();
}
public void chooseGesture()
{
	int rnum = rand.nextInt(3);
	if(rnum == 0)
	{
		super.setGesture("rock");
	}
	if(rnum == 1)
	{
		super.setGesture("paper");
	}
	if (rnum == 2)
	{
		super.setGesture("scissors");
	}
}
}
