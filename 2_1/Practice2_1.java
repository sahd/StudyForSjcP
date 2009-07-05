public class Practice2_1
{
	public int adder(int N)
	{
		return 0x100 + N++;
	}

	public static void main(String[] s)
	{
		Practice2_1 p = new Practice2_1();
		System.out.println(p.adder(2));
	}
}
