package BreakKeyword;

public class LabledBreak {
	public static void main(String[] args) {
		Loop:
			for(int i=1;i<20;i++) {
				if(i==10) {
				
					break Loop;
				}
				System.out.println(i);
			}
		System.out.println("out of the loop");
	}

}
