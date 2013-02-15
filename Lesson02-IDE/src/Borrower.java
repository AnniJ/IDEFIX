
public class Borrower extends Person {
	private String[] interest; 
	private boolean newsletter;
	private String email;
	
	public Borrower(String name, Cprno cpr, String address, boolean newsletter, String email) {
		super(name, cpr, address);
		this.interest = new String[3];
		this.newsletter = newsletter;
		this.email = email;
	}
	
	public void addInterest(String a, String b, String c){
		
		this.interest[0] = a;
		this.interest[1] = b;
		this.interest[2] = c;
	}
	
	private boolean hasInterest(){
	
		if(this.interest.length >1 && this.interest[0] != null && this.interest[1] != null && this.interest[2] != null)
		{
			return true;
		}
		return false;
	}
	
	public String showInterest(){
		String s = this.interest[0] +" ";
		s += this.interest[1]+" ";
		s += this.interest[2]+" ";
		
		return s;
	}
	public String getEmail(){
		return this.email;		
	}
	
	public boolean wantsNewsletter(){
		if(this.newsletter == true)
			return true;
		else return false;
	}
		
	public String toString(){
		String s = String.format("%12s %40s - %8s: %8s %40s", this.getCprno(), this.getName(), this.wantsNewsletter(), this.getEmail(), this.showInterest());
		return s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cprno c = new Cprno(2511450007L);
		
		Borrower b1 = new Borrower("Niels Muller Larsen", c, "Sønderhøj 30", true, "test@test.dk");
		b1.addInterest("Romace", "Horror","Action");
		System.out.println(b1);
		System.out.println(b1.hasInterest());
	}
	

}
