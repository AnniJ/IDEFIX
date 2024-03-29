
public class Person {

	private String name;
	private Cprno cpr;
	private double balance;
	private String address;
	
	public Person(String name, Cprno cpr, String address){
		this.name = name;
		this.cpr = cpr;
		this.address = address;
		this.balance = 0.0;		
	}
	
	public Person(String name, long cpr, String address, double bal){
		this.name = name;
		this.cpr = new Cprno(cpr);
		this.address = address;
		this.balance = bal;		
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public Cprno getCprno(){
		return this.cpr;
	}
	
	public void setBalance(double amount){
		this.balance = amount;
	}
	public void addBalance(double amount){
		this.balance+= amount;
	}
	
	public String toString(){
		String s = String.format("%12s %40s: %8.2f", this.cpr, this.getName(), this.getBalance());
		return s;
	}
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cprno c = new Cprno(2511450007L);
		Person p1 = new Person ("Niels muller Larsen", c, "S�nderh�j 30");
		
		Person p2 = new Person ("Gert Simonsen", 2511450007L, "S�nderh�j 30", 3700.73);
		
		System.out.println(p1);
		p1.addBalance(333.67);
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
