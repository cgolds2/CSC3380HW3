
public class crazyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "1 ~0123456789";
		System.out.println(test);
		
		test = test.replaceAll("(?=[0-9])(?:([0-8])(?=.*\1([0-9])[0-9]*$)|(?=.*(1)))(?:(9+)(?=.*(~))|)(?![0-9])", "$2$3$4$5" );
		System.out.println(test);

		test = test.replaceAll("/9(?=9*~)(?=.*(0))|~| ~0123456789$/", "$1");
		System.out.println(test);

	}

}
