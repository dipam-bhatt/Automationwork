package OOPS;

  abstract  class RBI {
	abstract public void interest();
	abstract public void HL();
	public static void reporate() {
		System.out.println("reporate : +-4%");
	}

}

class SBI extends RBI {
public void interest () {
	System.out.println("sbi : interest : 7%");
}

 public void HL () {
	 System.out.println("sbi : HL : 8%");
 }
} 
 class JAVA extends RBI {
	 public void interest() {
		 System.out.println("java interest : 8%");
	 }
	 
	 public void HL() {
		 System.out.println("java HL : 9%");
	 }
 }
 
 public class Abstraction {
	 public static void main(String[] args) {
		 SBI s= new SBI();
		 s.interest ();
		 s.HL();
		 JAVA j = new JAVA ();
		 j.interest();
		 j.HL();
		 SBI.reporate();
		 JAVA.reporate();
	 }
 }
 
