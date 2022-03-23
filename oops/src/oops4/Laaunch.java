package oops4;


class Books
{
	private int pg_no;
	public void setData(int x)
	{
		pg_no = x;
	}
	public int getData()
	{
		return pg_no;
	}
}
public class Laaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b = new Books();
	//	b pg_no=10;                //Error occurs (preventing direct access)
		b.setData(10);            //controlled access calling getter & setter
		System.out.println(b.getData());  
	}

}
