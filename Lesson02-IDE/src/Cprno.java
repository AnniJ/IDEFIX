
public class Cprno {
		
	private long cprno;
	
	//i php ville man istedet skrive:
	//private $cprno;
	//public function__construct($cprno){$this->cprno = $cprno}
	//det er kun muligt at have 1 construstor i php
	public Cprno(Long cprno){
		this.cprno = cprno;
	}
	
	//i php ville man istedet skrive:
	//public function getCprno(){
	//return $this->Cprno}
	public long getCprno(){
		return this.cprno;
	}
	
	public String toString(){
		//formatering af string
		//så den passer til formatet cprnr.
		//
		String aString = String.format("%06d-%04d", this.cprno/10000, this.cprno%10000);
		if(!this.checkCprno())
			aString += ", invalid";
		return aString;
	}
	public boolean checkCprno(){
		long sum;
		long restcpr = this.cprno;
		sum = 0L;
		
		sum += (restcpr % 10) * 1;
		restcpr = restcpr / 10;
		
		sum += (restcpr % 10) * 2;
		restcpr = restcpr / 10;
		
		sum += (restcpr % 10) * 3;
		restcpr = restcpr / 10;
		
		sum += (restcpr % 10) * 4;
		restcpr = restcpr / 10;
		
		sum += (restcpr % 10) * 5;
		restcpr = restcpr / 10;
		
		sum += (restcpr % 10) * 6;
		restcpr = restcpr / 10;
		
		sum += (restcpr % 10) * 7;
		restcpr = restcpr / 10;
				
		sum += (restcpr % 10) * 2;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 3;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 4;
		restcpr = restcpr / 10;
		
		if(sum % 11 == 0 && sum != 0)
			return true;
		else 
			return false;
	}	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cprno c0 = new Cprno(2511450007L);
		System.out.println(c0);
		
		Cprno c1 = new Cprno(7029000020L);
		System.out.println(c1);
		
		c1 = new Cprno(411940020L);
		System.out.println(c1);
		
	}

}
