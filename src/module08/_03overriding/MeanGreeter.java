package module08._03overriding;

public class MeanGreeter extends Greeter
{
	public String greet()
	{
		return "Go Away";
	}

	public String greet(String who) {
		return "Go Away " + who;
	}
}
