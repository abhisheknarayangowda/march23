package oops5;
class Books
{
	private int pg_no;
	public void setData(int x)
	{
		if(x>0)
		{
			pg_no=x;
		}
		else
		{
			System.out.println("invalid input");
			System.exit(0);
		}
	}
	public int getData()
	{
		return pg_no;
	}
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Books b = new Books();
b.setData(1);
System.out.println(b.getData());
	}

}
