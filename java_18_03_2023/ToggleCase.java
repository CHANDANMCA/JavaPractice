package java_18_03_2023;

public class ToggleCase {
	public static void main(String[] args) {
		String java="helloJavaScript";
		String toggelCase="";
		for(int i=0;i<=java.length()-1;i++) {
			if(Character.isUpperCase(java.charAt(i))) {
				toggelCase=toggelCase+Character.toLowerCase(java.charAt(i));
			}else {
				toggelCase=toggelCase+Character.toUpperCase(java.charAt(i));
			}
		}
		System.out.println(toggelCase);
	}

}
