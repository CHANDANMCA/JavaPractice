package com.nestedClass;

public class MemberInnerClass {

	private int id=1;

	class InnnerClass {

		void method9() {
			System.out.println("integer" + id);
		}

	}
	void method8() {
		InnnerClass innnerCla=new InnnerClass();
		innnerCla.method9();
	}
	public static void main(String[] args) {
		/*
		 * MemberInnerClass.InnnerClass innnerClass=new MemberInnerClass().new
		 * InnnerClass(); innnerClass.method9();
		 */
//		MemberInnerClass innerClass1=new MemberInnerClass();
//		MemberInnerClass.InnnerClass innnerClass2=innerClass1.new InnnerClass();
//		innnerClass2.method9();
//		
		new MemberInnerClass().new InnnerClass().method9();
		MemberInnerClass innerClas=new MemberInnerClass();
		innerClas.method8();
	}

}
