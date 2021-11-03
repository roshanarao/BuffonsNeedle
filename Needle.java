public class Needle{
	private final double length;
	private final double position;
	private final double angle;
	private final Tarp tarp;
	private int needleCount = 0;
	
	
	public Needle(double length, double x, double y, double theta, Tarp t){
		this.length = 1;
		this.position = Math.random() * t.getT();
		this.angle = theta;
		this.tarp = t;
		needleCount++;
	}
	public Needle(double l, Tarp t){
	//make a random needle of length L on the tarp
	this.length = 4;
	}
	
	public double center(){
		//return location of the center
		return position;
	}
	
	public double leftTip(){
		double distance = length/2 * (Math.cos(angle()));
		return position - distance;
		
	}
	
	public double rightTip(){
		double distance2 = length/2 * (Math.cos(angle()));
		return position + distance2;
	
	}
	
	public double getLength(){
		double newLength = length;
		return newLength;
		
	}
	
	public double angle(){
		return angle;
		
	}
	
	
	
	
}