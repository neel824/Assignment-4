/**
 * Plot Class
 * 
 * @author Neel Joshi
 *
 */
public class Plot extends java.lang.Object
{
	private int x;
	private int y;
	private int width;
	private int depth;
	/**
	 * No arg constructor 
	 */
public Plot()
{
	x = 0;
	y = 0;
	width = 1;
	depth = 1;
}
/**
 * Copy constructors passes p
 * @param p - property obj
 */
public Plot(Plot p)
{
	x = p.x;
	y = p.y;
	width = p.width;
	depth = p.depth;
}
/**
 * 4 arg constructor with parameters to create plot
 * @param x - x coordinate
 * @param y - y coordinate
 * @param width - horizontal size
 * @param depth - vertical size
 */
public Plot(int x, int y, int width, int depth)
{
	this.x = x;
	this.y = y;
	this.width = width;
	this.depth = depth;
}
/**
 * Determines if properties overlaps each other
 * @param plot - overlaps parameter
 * @return overlaps 
 */
public boolean overlaps(Plot plot)
{
	boolean overlaps = true;
	if (plot.x >= (x + width) || (plot.x + plot.width) <= x) 
	{
		overlaps = false;
		return overlaps;
	}
	if (plot.y >= (y + depth) || (plot.y + plot.depth) <= y)
	{
		overlaps = false;
		return overlaps;
	}
	return overlaps;
}
/**
 * Determines if properties encompass each other in the plot
 * @param plot - encompasses parameter
 * @return xE and yE and widthE and depthE
 */
public boolean encompasses(Plot plot)
{
	boolean xE;
	
	xE = false;
	
	boolean yE;
	
	yE = false;
	
	boolean widthE;
	
	widthE = false;
	
	boolean depthE;
	
	depthE = false;
	
	if(plot.x >= x) 
	{
		xE = true;
	}
	if(plot.y >= y) 
	{
		yE = true;
	}
	if(plot.width <= width) 
	{
		widthE = true;
	}
	if(plot.depth <= depth) 
	{
		depthE = true;
	}
	return xE && yE && widthE && depthE;
}
/**
 * Gets the plot
 * @return x
 */
public int getX()
{
	return x;
}
/**
 * Sets the x 
 * @param x - x coordinate
 */
public void setX(int x)
{
	this.x = x;
}
/**
 * Gets the y
 * @return
 */
public int getY()
{
	return y;
}
/**
 * Sets the y
 * @param y - y coordinate 
 */
public void setY(int y)
{
	this.y = y;
}
/**
 * Sets the width
 * @param width
 */
public void setWidth(int width)
{
	this.width = width;
}
/**
 * Gets the width
 * @return width
 */
public int getWidth()
{
	return width;
}
/**
 * Gets the depth
 * @return depth
 */
public int getDepth()
{
	return depth;
}
/**
 * Sets the depth
 * @param depth
 */
public void setDepth(int depth)
{
	this.depth = depth;
}
/**
 * Tells/Shows the coordinates of (x, y) and depth and width
 */
@Override
public String toString() 
{
	return "Upper left: " + "(" + x + "," + y + ")" + "; " + "Width: " + width + " " + "Depth: " + depth;
}

}
