package parcialP_O_O;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int i,x=4, w=9, q, i1;
		for(i=-1; i<20; i-=3) {
			x++;
			for(q=4; q<11;q++) {
				do {
					i1=+3;
					w=sizeof(i);
					i1=x+w;
					x=w+i1;
					
				}while (x<15);
			}
		}
		
		System.out.println("x: "+x+"i: "+i);

	}

	private static int sizeof(int i) {
		
		return 0;
	}



}
