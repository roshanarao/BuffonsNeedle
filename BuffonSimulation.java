import java.util.Scanner;
public class BuffonSimulation{
	
	public BuffonSimulation(double r, int n){
		Tarp t = new Tarp(r, 1.0);
		Needle need = new Needle(.7, .5, .4, .6, t);
		
	}
	public double kValue(){
		double r = 2.2; 
		return r;
		
	}
	
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i <= 100; i++){
		BuffonSimulation bs = new BuffonSimulation(10, num);
		System.out.println("KValue: " + bs.kValue());
		}
		
		
	}
	
}