
public class Loops {

	public static void main(String[] args) {
	// 5)
	int a = 0;
	while (a <= 100) {
		System.out.println(a);
		a = a + 2;
	}
		
	int b = 100;
	while (b >= 0 ) {
		System.out.println(b);
		b = b - 3;
	}
	
	for (int c = 1; c <= 100; c++) {
		if (c % 2 == 1) {
		System.out.println(c);
	}	
		
	}
	
	for (int d = 0; d <= 100; d++) {
			
			if (d % 15 == 0) {
				System.out.println("Hello World");
			} else if (d % 5 == 0) {
				System.out.println("World");
			} else if (d % 3 == 0) {
				System.out.println("Hello");
			} else {
				System.out.println(d);
		}
	}

	}
}