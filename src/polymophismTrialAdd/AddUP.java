package polymophismTrialAdd;

public class AddUP {
	static int add(int a, int b)
	{
		//sum = a1.a + a1.b;
		return a + b;
	}
	static float add(float a, float b)
	{
		return a + b;
	}
	static int add(int a, int b, int c)
	{
		return a + b + c;
	}
	void display()
	{
		System.out.println(AddUP.add(12, 14));
		System.out.println(AddUP.add(2f, 2f));
		System.out.println(AddUP.add(2, 2, 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddUP a1 = new AddUP();
		a1.display();

	}

}
