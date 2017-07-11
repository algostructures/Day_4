package InnerClass;

public class CakeBuilder {
	private int y;
	
	public CakeBuilder addY(int y)
	{
		this.y = y;
		
		return this;
	}
	
	public class Cake{
		private int x;
		private Cake(CakeBuilder cb){ x = cb.y;}
	}
	
	public Cake build()
	{
		return new Cake(this);
	}
}
