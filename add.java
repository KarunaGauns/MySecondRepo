public class arithmatic {
	protected int num1;
	protected int num2;
	protected int sum;
	public void add(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		this.sum=this.num1+this.num2;
		
	}	

	public void display()
	{
		System.out.println("sum ="+ this.sum);
	}
}
