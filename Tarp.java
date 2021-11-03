import java.util.ArrayList;

public class Tarp{
	public double t;
	public double l;
	private ArrayList<Needle> needles;
	
	public Tarp(double t, double l){
		this.t = t;
		this.l = l;
			
	}
	
	public void throwNeedle(){
		needles.add(new Needle(l, this));
		
	}
	
	public int numberOfNeedles(){
		return needles.size();	
	}
	
	public int numberOfCrossings(){
	int crossing = 0;
		for(Needle n: needles){
			if(n.getLength() == 4){
				crossing++;
			}
		}
		return crossing;
	}
	
	public double ratioOfCrossings(){
		int crossed = 0;
		Tarp tarp = new Tarp(2.0, 3.0);
		Needle johnny = new Needle(1, 2, 3 , 5, tarp);
		if (hasItCrossed(johnny)){
			crossed++;
		}
		return crossed;
		
	}
	
	public boolean hasItCrossed(Needle n){
		return n.leftTip() < 0 || n.rightTip() > t;	
	}
	
	public double getT(){
		return t;
	}
	
	
	

}