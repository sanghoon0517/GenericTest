
/**
 * @author 전상훈
 * 제네릭 타입을 써보자.
 * 제네릭은 특정 타입을 지정할 수 있게 도와주는 역할을 한다.
 */

class 호랑이 {
	String name = "호랑이";
}
class 사자 {
	String name = "사자";
}

//제너릭 문법
class 큰바구니<T> {
	T data;
}
public class GenericTest {

	public static void main(String[] args) {
		큰바구니<호랑이> basket = new 큰바구니<>();
		basket.data = new 호랑이(); //data안에 호랑이 객체를 넣음.
		System.out.println(basket.data.name);

		큰바구니<사자> basket2 = new 큰바구니<>();
		basket2.data = new 사자(); //data안에 사자 객체를 넣음.
		System.out.println(basket2.data.name);
	}

}
