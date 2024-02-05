package operators;

public class Bitwise_operators {
	private static final String SUPER_ADMIN = "super admin";
	
	private static final String ORG_ADMIN = "org admin";
	private static final String USER_ADMIN = "user admin";
	private static final String ADMIN = " admin";
	
	public static void main(String args[]) {
	
		/*
		 * if(SUPER_ADMIN.equals(SUPER_ADMIN) || ORG_ADMIN.equals(ORG_ADMIN) ||
		 * USER_ADMIN.equals(USER_ADMIN) || ADMIN.equals(ADMIN)) {
		 * System.out.println("I am a every user"); }else
		 * System.out.println("I am not every user");
		 */
		
		/*
		 * if(SUPER_ADMIN.equals(SUPER_ADMIN) && ORG_ADMIN.equals(ORG_ADMIN) &&
		 * USER_ADMIN.equals(USER_ADMIN) && ADMIN.equals(ADMIN)) {
		 * System.out.println("I am a every user"); }else
		 * System.out.println("I am not every user");
		 */
		
		/*
		 * if(SUPER_ADMIN.equalsIgnoreCase(SUPER_ADMIN) &&
		 * ORG_ADMIN.equalsIgnoreCase(ORG_ADMIN) &&
		 * USER_ADMIN.equalsIgnoreCase(USER_ADMIN) && ADMIN.equalsIgnoreCase(ADMIN)) {
		 * System.out.println("I am a every user"); }
		 * 
		 * System.out.println("I am not every user");
		 */
		 
		
		/*
		 * if(!SUPER_ADMIN.equals(SUPER_ADMIN) && !ORG_ADMIN.equals(ORG_ADMIN) &&
		 * !USER_ADMIN.equals(USER_ADMIN) ) { System.out.println("I am not a ADMIN");
		 * }else System.out.println("I am an ADMIN");
		 */
		
		/*
		 * if( !ORG_ADMIN.equals(ORG_ADMIN) && !USER_ADMIN.equals(USER_ADMIN) &&
		 * !ADMIN.equals(ADMIN)) { System.out.println("I am not a SUPER ADMIN"); }
		 * 
		 * System.out.println("I am AN SUPER ADMIN");
		 */
		 
		
		/*if( !ORG_ADMIN.equalsIgnoreCase(ORG_ADMIN) && !USER_ADMIN.equalsIgnoreCase(USER_ADMIN) && !ADMIN.equalsIgnoreCase(ADMIN)) {
			System.out.println("I am not a SUPER ADMIN");
		}
		System.out.println("I am AN SUPER ADMIN");*/
		
		 check("super admin"); 
		/*
		 * System.out.println(true ^ true); System.out.println(true ^ false);
		 */
		
	}
	
	public static void check(String user) {
		if( ORG_ADMIN.equalsIgnoreCase(user) || USER_ADMIN.equalsIgnoreCase(user) || ADMIN.equalsIgnoreCase(user)) {
			System.out.println("I am an USER");
		}else
		System.out.println("I am an SUPER ADMIN");
	}
	}

