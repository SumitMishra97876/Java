package test;

public class Ladybug {
	
	private String color;
	
	public Ladybug()
	{
		this("red");
	}
	public Ladybug(String color)
	{
		this.color=color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ladybug myLady=new Ladybug();
		System.out.println("color: " +myLady.color);

	}

}
