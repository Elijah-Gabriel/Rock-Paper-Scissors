public class RPSPlayer implements RPSPlayerInterface
{
private String gesture;
private int points;

public RPSPlayer()
{
	this.gesture = "none";
	this.points = 0;
}
public int getPoints()
{
	return this.points;
}
public String getGesture()
{
	return this.gesture;
}
public void setPoints(int aPoints)
{
	if(aPoints>0)
	{
	this.points = aPoints;
	}
}
public void setGesture(String aGesture)
{
	if(aGesture.equalsIgnoreCase("rock")|| aGesture.equalsIgnoreCase("paper")|| aGesture.equalsIgnoreCase("scissors"))
	{
		this.gesture = aGesture;
	}
}
public void chooseGesture()
{
	this.gesture = "none";
	setGesture(gesture);
}
}
