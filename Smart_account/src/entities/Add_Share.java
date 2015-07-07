package entities;

public class Add_Share {
	
	String category;
	char currency;
	int time;
	String name;
	float proportion;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public char getCurrency()
	{
		return currency;
	}
	
	public void setCurrency(char currency)
	{
		this.currency = currency;
	}
	
	public int getTime()
	{
		return time;
	}
	
	public void setTime(int time)
	{
		this.time = time;
	}
	
	public float getProportion()
	{
		return proportion;
	}
	
	public void setProportion(float proportion)
	{
		this.proportion = proportion;
	}

}
