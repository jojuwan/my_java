package test.main;

import test.mypac.Rect;

/*
 * 	test.mypac 패키지에 Rect 라는 이름의 클래스를 만들고자 한다.
 * 
 * 	해당 클래스로 객체를 생성하고
 * 
 * 	사각형의 폭과(width), 높이(height) 를 필드에 대입하고
 * 
 * 	showArea() 를 호출하면 사각형의 넓이가 콘솔창에 출력될수 있도록
 * 
 *  Rect 클래스를 설계해 보세요.
 */

public class MainClass05 {
	public static void main(String[] args) {
		//클래스 설계후 여기에서 테스트 해 보세요.
		Rect r1=new Rect();
		r1.height=8;
		r1.widhth=10;
		r1.showArea();
		
		//폭과 높이가 5, 10 인 사각형 객체
		Rect r2=new Rect();
		r2.widhth=5;
		r2.height=10;
		r2.showArea();
	}
}
