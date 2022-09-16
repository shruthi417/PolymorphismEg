package polymophismTrialAdd;

public class MultiplyUP {
	static int mul(int a, int b)
	{
		return a * b;
	}
	static float mul(float a, float b)
	{
		return a * b;
	}
	static int mul(int a, int b, int c)
	{
		return a * b * c;
	}
	void display()
	{
		System.out.println(MultiplyUP.mul(5, 3));
		System.out.println(MultiplyUP.mul(5.0f, 5.0f));
		System.out.println(MultiplyUP.mul(5, 3, 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyUP m1 = new MultiplyUP();
		m1.display();

	}

}
