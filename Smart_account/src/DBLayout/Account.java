package DBLayout;

public class Account {
	
	double amount;
	String category;
	char currency;
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
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

}
