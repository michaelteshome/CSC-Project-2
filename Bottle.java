import java.util.Scanner;

public class Bottle {
	private String bottleType;
	private int bottleCount = 0;
	private final int MAX = 10;
	private final int MIN = 1;
	public Bottle (String BottleType){
		
		bottleType = BottleType;
	}
	public int read(){
		Scanner kybd = new Scanner(System.in);
		return kybd.nextInt();
	}
	public int getCount(){
		return bottleCount;
	}
	public void set(int count)
	{
		if (count >= MIN)
		bottleCount = count;
	}
	public void set( Bottle btl)
	{
		//todo;
	}
	public void set()
	{
		//todo;
	}
	public void add(int count)
	{
		bottleCount = bottleCount + count ;
	}
	public void subtract(int count)
	{
		bottleCount = bottleCount - count ;
	}
	public void multiply(int count)
	{
		bottleCount = bottleCount * count ;
	}
	public void divide(int count)
	{
		bottleCount = bottleCount / count ;
	}

	public void add(Bottle btl)
	{
		//todo;
	}
	public void subtract(Bottle btl)
	{
		//todo;
	}
	public void multiply(Bottle btl)
	{
		//todo;
	}
	public void divide(Bottle btl)
	{
		//todo;
	}
}