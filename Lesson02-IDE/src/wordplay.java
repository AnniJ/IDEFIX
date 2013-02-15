
public class wordplay {

	private String word;
	
	
	public wordplay(String word) {
	this.word = word;
	}
	
	public char first(){
	char s = this.word.charAt(0);	
	return s;
	}
	
	public char last(){
	int i = this.word.length();
	char s = this.word.charAt(i-1);
	return s;
	}
	
	/*public char middle(){
		
		return s;
	}*/
	
	public boolean palindrome(){
		
		int i = this.word.length()-1;
		
		//char f = first();
		//char l = last();
		int x = 0;
		int y = i;
		
		//boolean t = true;
		
		do{
			//System.out.println("første:"+this.word.charAt(x)+" Siste:"+this.word.charAt(y)+" x:"+x+" y: "+y);
			/*if(this.word.charAt(x) == this.word.charAt(y))
			{ 
				t = true;
				//System.out.println("true;");
			}	
			else {
				//System.out.println("false;");
				t = false;
				return false;
				}
			*/
			
			if(this.word.charAt(x) != this.word.charAt(y))
			{ 
				return false;
			}	
			else {
					x++;
					y--;
				}
		}while(x<=y);
		
		return true;
	}
	
public String middle(){
	int i = this.word.length()-1;
	String s = this.word.substring(1,i);
	//s = s.substring(1);
	
	return s;
}	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println("teseeet".length());
		//System.out.println(w1.first());
		//System.out.println(w1.last());
		
		wordplay w1 = new wordplay("teet");
		wordplay w2 = new wordplay("hest");
		wordplay w3 = new wordplay("herkreh");
		wordplay w4 = new wordplay("regninger");
		wordplay w5 = new wordplay("regner");
		
		
		System.out.println(w1.word+": "+w1.palindrome());
		System.out.println(w2.word+": "+w2.palindrome());
		System.out.println(w3.word+": "+w3.palindrome());
		System.out.println(w4.word+": "+w4.palindrome());
		System.out.println(w5.word+": "+w5.palindrome());
		
		
		
	}
}

