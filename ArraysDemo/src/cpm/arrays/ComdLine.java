package cpm.arrays;
enum Colours{RED(10),GREEN(20),BLUE(50);

	private 	int val;
	
	public int getVal()
	{
		return val;
	}

Colours(int val) {
	this.val=val;
}
}
public class ComdLine {

	public static void add(int...xary)
	{
		for(int x:xary )
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
//		for(int i=0;i<args.length;i++)
//		{
//			System.out.println(args[i]);
//		}
//		add(1,2,3,4);
//		add(10,20,30,40);
		
		for(Colours c:Colours.values())
		{
			System.out.println(c+"  "+c.getVal());
		}
		
	}
	
	

}
