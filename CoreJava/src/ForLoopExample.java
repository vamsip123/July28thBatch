
public class ForLoopExample {

	public static void main(String[] args) {
		String binary[] = {
				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
		};
		
		/*for(int i = 0 ; i < binary.length ; i++) {
			System.out.println(binary[i]);
		}*/
		/*
		 * For Each Loop
		 */
		for(String str : binary) {
			System.out.println(str);
		}
	}
}