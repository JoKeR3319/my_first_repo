public class Gen3 {
	public static void main(String[] args) {
		/*Displays 3 randomly generated numbers between a given range, followed by the lowest number of the 3.*/
		int RangeMax = Integer.parseInt(args[0]);
		int RangeMin = Integer.parseInt(args[1]);
		int Rand1 = (int)(Math.random()*(RangeMax-RangeMin))+RangeMin;
		System.out.println(Rand1);
		int Rand2 = (int)(Math.random()*(RangeMax-RangeMin))+RangeMin;
		System.out.println(Rand2);
		int Rand3 = (int)(Math.random()*(RangeMax-RangeMin))+RangeMin;
		System.out.println(Rand3);
		System.out.println("The minimal generated number was " + Math.min(Math.min(Rand1, Rand2), Rand3));
	}
}