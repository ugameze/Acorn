package test.main;

@SuppressWarnings("unused")
/*
 *	[ Java 기본 데이터 type ]
 * 
 * 3. 문자형( char)
 *	- 65536가지의 코드값을 가질 수 있다.
 *	- 전 세계에서 사용하는 모든 문자 1글자를 표현할 수 있다.
 *  - single quotation을 이용해서 만든다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		// char형 변수 선언과 동시에 값 대입.
		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = 'c';
		char ch4 = '가';
		char ch5 = '나';
		char ch6 = '다';
		char ch7 = '@';

		// 정수값에 1:1 대응되는 char값이 존재한다.
		int code1 = ch1; // 97
		int code2 = ch2; // 98
		int code3 = ch3; // 99
		int code4 = ch4; // 44032
		int code5 = ch5; // 45208
		int code6 = ch6; // 45796
		int code7 = ch7; // 64
	}

}
