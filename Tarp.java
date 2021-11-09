public class Tarp{
	private double t;
	private double l;
	private ArrayList<Needle> needles;
	
	public Tarp(double t, double l){
		this.t = t;
		this.l = l;
			
	}
	
	public void throwNeedle(){
		needles.add(new Needle(this));
		
	}
	
	public int numberOfNeedles(){
		return needles.size();	
	}
	
	public int numberOfCrossings(){
	int crossing;
		if(Needle n: needles.length() == 4){
			crossing++;
		}
		return crossing;
	}
	
	public double ratioOfCrossings(){
		
	}
	
	private hasItCrossed(Needle newNeedle){
		Needle test = new Needle(Math.Random(), Math.Random(), Math.Random(), Math.Random(), Tarp t);
		test = newNeedle;
		test.leftTip();
		test.rightTip();
		
	}
	
	
	

}