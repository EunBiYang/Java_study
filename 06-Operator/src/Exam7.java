/*진리표			and		or		not
x		y		x&&y	x||y	!x
true	true	true	true	false
true	false	false	true	false
false	true	false	true	true
false	false	false	false	true
 * 
 */
public class Exam7 {
	public static void main(String[] args) {
		int a =100;
		int b = 200;
		int x = 5;
		int y = 3;
		
		boolean r1 = a >= b;
		boolean r2 = x >= y;
		boolean result1 = r1 && r2; //한쪽이라도 false면 false
		boolean result2 = r1 || r2; //한쪽이라도 true면 true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(!result1);
	}

}
