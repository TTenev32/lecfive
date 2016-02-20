package bg.thissome.newshit.lecfive;

public class SecondOne {
	
	public static int number = 1242352;
	
    public static int reverse(int num){
    	int reversenum = 0;
    	 while( num != 0 )
         {
             reversenum = reversenum * 10;
             reversenum = reversenum + num%10;
             num = num/10;
         }
    	 return reversenum;
    }

	public static void main(String[] args) {
		System.out.println(reverse(number));
		System.out.println(reverse(4241254));
		System.out.println(reverse(41244312));
	
		
	}
}
