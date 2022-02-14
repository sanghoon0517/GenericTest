abstract class 공 {
	abstract String getName(); //자식클래스의 getName을 Override할 수 있도록 이름을 맞춰놓는다.
}

class 농구공 extends 공{
	private String name = "농구공";

	//오버라이드를 통해 getName메서드가 동적바인딩이 된다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class 축구공 extends 공{
	private String name = "축구공";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class 가방<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
public class GenericWildCardTest {
	static 가방<? extends 공/*Object대신 사용 - getName을 사용하기 위해*/> 꺼내기(int time) { // 9시 축구, 그 이외에 시간 농구
		if(time == 9) {
			System.out.println("축구공이 담겼어요.");
			축구공 g2 = new 축구공();
			가방<축구공> b2 = new 가방<>();
			b2.setData(g2);
			return b2;
		} else {
			System.out.println("농구공이 담겼어요.");
			농구공 g1 = new 농구공();
			가방<농구공> b1 = new 가방<>();
			b1.setData(g1);
			return b1;
		}
	}

	//제네릭의 와일드 카드를 제대로 쓰기 위해서는
	// 다형성, Object, 추상클래스, 오버라이드, 동적바인딩에 대한 개념이 잡혀있어야 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//?(와일드 카드)는 뒤에 "extends Object"가 생략되어 있다.그래서 값을 모를경우, Object를 기본으로 한다.
		가방<? extends 공> r1 = 꺼내기(9);
		가방<? extends 공> r2 = 꺼내기(12);
		
		System.out.println(r1.getData().getName());
		System.out.println(r2.getData().getName());
	}

}
