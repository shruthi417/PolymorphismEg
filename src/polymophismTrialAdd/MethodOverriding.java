package polymophismTrialAdd;
class Animal
{
	void animals()
	{
		System.out.println("There are many animals in the Universe...");
	}
}

public class MethodOverriding extends Animal{
	void animals()
	{
		super.animals();
		System.out.println("Let us talk about Dog...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding x = new MethodOverriding();
		
		x.animals();

	}

}
