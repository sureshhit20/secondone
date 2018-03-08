package packageFirst;

public class InAndOut {
	
	int x;
	
	Inner MyInner = new Inner();
	
	public void dostuff() {
		MyInner.go();
	}
	
	
	
	public class Inner{
		void go() {
			x = 42;
		}
		
	}

}
