
public class Librarian extends Person {
	private double empFrac;
	private String position;
	
	public Librarian(String name, Cprno cpr, String address, double time, String job) {
		super(name, cpr, address);
		this.empFrac = time;
		this.position = job;
	}

	public boolean isFullTime(){ //1.0 = fuldtids arbejde [37*1.2 = overtid/overarbejde] [37*0.5 = deltids arbejde]
		if (this.empFrac >= 32)
			return true;
		else return false;
	}
	
	public String getPosition(){
		return this.position;
	}
	
	public String toString(){
		String s = String.format("%12s %40s - %8s: %8s", this.getCprno(), this.getName(), this.getPosition(), this.isFullTime());
		return s;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cprno c = new Cprno(2511450007L);
		Librarian l1 = new Librarian("Niels Muller Larsen", c, "Sønderhøj 30", 1.2, "IT Specialist");
		System.out.println(l1);
	}

}
