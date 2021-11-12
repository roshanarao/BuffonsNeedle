import java.util.ArrayList;
public class Tarp{
	public double t;
	public double l;
	private ArrayList<Needle> needles = new ArrayList<Needle>();
	/** Tarp constructor. Takes t and l as parameters for tarp length and needle length respectively.
	 * let's see just how condensed I can make this code
	 * @param t is the tarp length.
	 * @param l is the needle length.
	 */
	public Tarp(double t, double l){
		this.t = t;
		this.l = l;
	}
	/** Throws a needle onto a tarp by adding a new needle to an array of needles.
	 *
	 */
	public void throwNeedle(){
		needles.add(new Needle(this));
	}
	/** Counts the number of needles by returning the size of the arraylist.
	 *
	 * @return the size of the arraylist
	 */
	public int numberOfNeedles(){
		return needles.size();	
	}
	/** counts the number of times the needle crosses the tarp.
	 *
	 * @return crossing, a counter integer that increments when a needle crosses the tarp.
	 */
	public int numberOfCrossings(){
	int crossing = 0;
		for(int i = 0; i < needles.size(); i++){
			if(hasItCrossed(needles.get(i))){
				crossing++;
			}
		}
		return crossing;
	}
	/** returns the ratio of crossings, the total number of crossings to the amount of needles thrown.
	 *
	 * @return the number of crossings divided by the total size of the needles arraylist.
	 */
	public double ratioOfCrossings(){
		return (double) numberOfCrossings()/(double)needles.size();
	}
	/** boolean that decides whether the needle has crossed or not.
	 *
	 * @param n a needle taken as a parameter
	 * @return the needle's left tip position if it is less than 0 or the needle's
	 * right tip position if it is greater than the tarp length.
	 */
	public boolean hasItCrossed(Needle n){
		return n.leftTip() < 0 || n.rightTip() > t;	
	}
	/** gets the tarp length.
	 *
	 * @return tarp length.
	 */
	public double getT(){
		return t;
	}
	/** gets the needle length.
	 *
	 * @return needle length.
	 */
	public double getL(){ return this.l; }
	/** gets the ratio of the needle length over the tarp length.
	 *
	 * @return l/t
	 */
	public double getRatio(){
		return l/t;
	}
}