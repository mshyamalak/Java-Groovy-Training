
public class Ifcondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isenabled = true;
		if(isenabled)
		{
			System.out.println("your pass is enabled");
		} else {
				System.out.println("not eligible");
		}
		int age = 18;
		if(age>=18){
			System.out.println("you can vote");
		} else {
				System.out.println(" you may be eligible for next election");
		}
		int maleage = 22;
		int femaleage = 18;
		if ((maleage>=22)&&(femaleage>=18))
		{
			System.out.println("you can marry");
		} else {
				System.out.println("you are still a child");
	}
		int score =75;
		String grade = "";
		if (score >= 95){
			grade = "A";
		} else if (score >= 80) {
			grade ="B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score <60) {
				grade = "F";
			}
		System.out.println("grade " +grade);
				
		
		
			
		
	}
}
