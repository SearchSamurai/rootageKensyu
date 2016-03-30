package javabeans;
public class CarMain {
	public static void main(String[] args){
		CarData c1 = new CarData();
		c1.setCarType("プリウス");
		String ct = c1.getCarType();
		System.out.println(ct);

		c1.setCarMaker("トヨタ");
		String cm = c1.getCarMaker();
		System.out.println(cm);

		c1.setCarPrice(3000000);
		int cp = c1.getCarPrice();
		System.out.println(cp + "円");

		c1.setCarNumber(1);
		int cn = c1.getCarNumber();
		System.out.println(cn + "台");
	}
}