public class Needle{
	public double length;
	public double position;
	public double angle;
	public Tarp tarp;
	/** The constructor for the Needle object, that creates a needle that corresponds to a tarp t.
	 *
	 * @param t the tarp that the needle takes.
	 */
	public Needle(Tarp t){
	this.length = t.getL();
	this.tarp = t;
	position = Math.random()*t.getT();
	angle = Math.random()*Math.PI - Math.PI/2;
	}
	/** Returns the center of the needle.
	 *
	 * @return the center.
	 */
	public double center(){
		return position;
	}
	/** Returns the position of the left tip of the needle.
	 *
	 * @return the difference between position and distance.
	 */
	public double leftTip(){
		double distance = length/2 * (Math.cos(angle()));
		return position - distance;
	}
	/** Returns the position of the right tip of the needle.
	 *
	 * @return the sum of position and distance.
	 */
	public double rightTip(){
		double distance2 = length/2 * (Math.cos(angle()));
		return position + distance2;
	}
	/** returns the length of the needle.
	 *
	 * @return length.
	 */
	public double getLength(){
		return length;
	}
	/** returns the angle of the needle.
	 *
	 * @return angle
	 */
	public double angle(){
		return angle;
	}
}