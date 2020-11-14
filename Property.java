/**
 * Property Class
 * 
 * @author Neel Joshi
 *
 */
public class Property 
{
	/**
	 * Variables fields
	 */
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	/**
	 * No arg constructor
	 */
Property()
	{
		this.owner = "";
		this.propertyName = "";
		this.city = "";
		this.rentAmount = 0;
		plot = new Plot();
	}
/**
 * 1 arg constructor with parameter p
 * Creates variables in the field
 * @param p - plot object
 */
public Property(Property p)
	{
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.rentAmount = p.rentAmount;
		plot = new Plot();
	}
/**
 * 4 arg constructor that passes the variables 
 * @param propertyName - name of property
 * @param city - name of city
 * @param rentAmount - the amount of rent
 * @param owner - name of owner
 */
public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
/**
 * 8 arg constructor that passes the parameters on
 * @param propertyName
 * @param city
 * @param rentAmount
 * @param owner
 * @param x
 * @param y
 * @param width
 * @param depth
 */
public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
/**
 * Gets property name
 * @return
 */
public String getPropertyName()
	{
		return propertyName;
	}
/**
 * Sets property name
 * @param propertyName
 */
public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}
/**
 * Gets city name
 * @return city
 */
public String getCity()
	{
		return city;
	}
/**
 * Sets the plot
 * @param x
 * @param y
 * @param width
 * @param depth
 * @return plot
 */
public Plot setPlot(int x, int y, int width, int depth)
	{
		plot = new Plot(x, y, width, depth);
		return plot;
	}
/**
 * Sets the city
 * @param city
 */
public void setCity(String city)
	{
		this.city = city;
	}
/**
 * Gets the rent amount
 * @return rent
 */
public double getRentAmount()
	{
		return rentAmount;
	}
/**
 * Sets rent amount
 * @param rentAmount
 */
public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}
/**
 * Gets the owner
 * @return owner
 */
public String getOwner()
	{
		return owner;
	}
/**
 * Sets the owner
 * @param owner
 */
public void setOwner(String owner)
	{
		this.owner = owner;
	}
/**
 * Gets the plot
 * @return plot
 */
public Plot getPlot() {
	return plot;
}
/**
 * returns the name owner etc with the user input and displays in Management Company
 */
	@Override
	public String toString() 
	{
		return "Property Name: " + propertyName + "\n" + "Located in " + city + "\n" + "Belonging to: " + owner + "\n" + "Rent Amount: " + rentAmount;
	}
	
}
