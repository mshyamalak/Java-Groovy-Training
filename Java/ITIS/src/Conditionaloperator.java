
public class Conditionaloperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isenabled = true;
		boolean isvalid = true;
		boolean canenter = isenabled && isvalid;
		System.out.println("can enter "+ canenter);
		int like =100;
		int dislike =8;
		boolean ishero = (like >= 50)&&(dislike<10);
		boolean cancontinue = (like >=50)|| (dislike < 10);
		System.out.println("is hero" + ishero);
		System.out.println("can continue" + cancontinue);
		boolean isok = true;
		boolean doreverse = !isok;
		System.out.println("do reverse " + doreverse );
		
				

	}

}
