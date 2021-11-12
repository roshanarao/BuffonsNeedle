import java.sql.SQLOutput;

public class BuffonSimulation{
	static double r;
	static int n;
	static Tarp t;
	/** buffon simulation constructor; takes r and n as parameters--the ratio of needle length/tarp and
	 * the number of needles
	 *
	 * @param r ratio of l/t
	 * @param n neeedle
	 */
	public BuffonSimulation(double r, int n){
		this.r = r;
		this.n = n;
		t = new Tarp(1.0, r);
		for(int i= 0; i < n; i++){
			t.throwNeedle();
		}
	}
	/** returns the kValue, the ratio of crossings divided by the l/t ratio
	 *
	 * @return ratio of crossings/r
	 */
	public double kValue(){
		return t.ratioOfCrossings()/r;
	}

	/**
	 * hoo boy this is the big one
	 * creates several buffon simulations, prints out the average kValues and then the 95% confidence intervals.
	 * @param args it's a main method bro
	 */
	public static void main (String[] args){
		int numberOfSimulations = 300;
		double kTotal=0;
		double [] kValues = new double[numberOfSimulations];
		for (int i = 0; i < numberOfSimulations; i++){
			BuffonSimulation bs = new BuffonSimulation(Math.random(), 10000);
			kValues[i] = bs.kValue();
			kTotal+=bs.kValue();
		}
		kTotal = kTotal/(double)numberOfSimulations;
		System.out.println("average kvalue: " + kTotal);
		double v = 0;
		for (int j =0; j < numberOfSimulations; j++){
			v += Math.pow(kValues[j] - kTotal, 2);
		}
		v = v/(double)numberOfSimulations;
		double stDev = Math.sqrt(v);
		double z = 1.96;
		System.out.println(kTotal - z*(stDev/Math.sqrt(numberOfSimulations)));
		System.out.println(kTotal + z*(stDev/Math.sqrt(numberOfSimulations)));
	}
	
}