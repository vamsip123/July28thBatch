public class BooleanLogicOperator {

	public static void main(String[] args) {
		
		

//		boolean isTrue = false;
//		System.out.println("isTrue   "+ !isTrue);
		
		/*if(!false){
			System.out.println(".........................");
		}*/
		
		/*if ((myAge == yourAge) && (myHeight++ == urHeight)) {
			System.out.println("In IF Condtion");
		}else {
			System.out.println("In Else Condition");
		}*/
		/*1    2    &&
		---------------------
		True    True    True
		True    False    True
		False    True    True
		False    False    False*/
		int myAge = 10;
		int yourAge = 100;

		int urHeight = 30;
		int myHeight = 40;
		
		String myMood = "";
		
		/*if(myAge == yourAge){
			myMood = "Happy";
		}else{
			myMood = "Sad";
		}*/
//		myMood = (myAge == yourAge) ? "Happy" : "Sad";
//		
//		System.out.println(myMood);
		
//		String myMood = (myAge == yourAge) ? "Happy" : "Sad";
		
		if ((myAge == yourAge) & (myHeight++ == urHeight)) {
			System.out.println("In IF Condtion");
		}else {
			System.out.println("In Else Condition");
		}
		System.out.println(myHeight);
		
		/*
		 * boolean isSatisfies = (myAge == yourAge) && (myHeight == urHeight);
		 * // true System.out.println(isSatisfies); if (!isSatisfies) {
		 * System.out.println("I m good"); }else {
		 * System.out.println("I am Sad"); }
		 */

		/*
		 * int age = 100; System.out.println(age++);
		 * System.out.println("Age is = "+age);
		 */

	}

}
