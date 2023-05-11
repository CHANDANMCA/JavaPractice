package java_06_02_2023;

public class InterviewQ2 {
	public static void main(String[] args) {
		String name="ABCD";
		String name2="CDAB";
		if(name.length()==name2.length() && (name+name).indexOf(name2)!=-1) {
			System.out.println("String is rotation");
		}else {
			System.out.println("string is not rotation");
		}
	}
	//ABCDABCD

}
