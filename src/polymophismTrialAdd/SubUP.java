package polymophismTrialAdd;

public class SubUP {
	static int sub(int a, int b)
	{
		return a - b;
	}
	static float sub(float a, float b)
	{
		return a - b;
	}
	static int sub(int a, int b, int c)
	{
		return a - b - c;
	}
	void display()
	{
		System.out.println(SubUP.sub(5, 3));
		System.out.println(SubUP.sub(5.5f, 1.1f));
		System.out.println(SubUP.sub(5, 3, 1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubUP s1 = new SubUP();
		s1.display();

	}

}
