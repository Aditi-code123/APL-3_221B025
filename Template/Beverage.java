abstract class Beverage {
	private void pour(int qt) {
		System.out.println("pour"+qt+"ml of beverage");
	}
	abstract void addcondiment();
	void stir() {} // hook
	private void serve() {
		System.out.println("serve");
	}
	public void templateMethod(int qt) {
		pour(qt);
		addcondiment();
		stir();
		serve();
	}
}