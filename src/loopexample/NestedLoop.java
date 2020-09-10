package loopexample;

public class NestedLoop {

	public static void main(String[] args) {

			/*±¸±¸´Ü
			int dan;
			int count;
			
			for(dan=2; dan<=9; dan++) {
				for(count=1; count<=9; count++) {
					
					System.out.println(dan + "*" + count + "=" + dan * count);
				}
				System.out.println();
			}
	}

} */
		
		int dan;
		int count;
		
		for(dan=2; dan<=9; dan++) {
			if( (dan %2) !=0) continue;
			for(count=1; count<=9; count++) {
				
				System.out.println(dan + "*" + count + "=" + dan * count);
			}
			System.out.println();
		}
}

}	


