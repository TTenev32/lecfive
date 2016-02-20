package bg.thissome.newshit.lecfive;



public class FirstOne {
	public static int[] arrayVe = {12,33,55,32423,34124,42};
	public static int findMe = 12;
	
	
	public static boolean hasNumber(int[]harray, int number){
		for(int n : harray){
			if (n == number){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		System.out.println(hasNumber(arrayVe, findMe));
		System.out.println(hasNumber(arrayVe, 43));
		System.out.println(hasNumber(arrayVe, 544));
		
	}
	

	
}
