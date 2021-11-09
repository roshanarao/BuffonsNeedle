public class Needle{
	private final double length;
	private final double position;
	private final double angle;
	private final Tarp tarp;
	private int needleCount = 0;
	
	
	public Needle(double length, double x, double y, double theta, Tarp t){
		this.length = length;
		this.xPosition = x;
		this.yPosition = y;
		this.angle = theta;
		this.tarp = t;
		needleCount++;
	}
	public Needle(double l, Tarp t){
	//make a random needle of length L on the tarp
	this.length = 4;
	this.xPosition = 0;
	this.yPosition = 0;
	
	}
	
	public double center(){
	//return location of the center
	String center = "(" + "xPosition" +"," + "yPosition" ")";
	return center;
	}
	
	public double leftTip(){
		double distance = length/2 * (Math.cos(angle()));
		return position - distance;
		
	}
	
	public double rightTip(){
		return position + distance;
	
	}
	
	public double angle(){
		double angle = theta;
		return angle;
		
	}
	
	
	
	
}