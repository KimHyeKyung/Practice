package Practice04;

public class Sparrow extends Bird{

	@Override
	public void sing() {
		System.out.println("참새(" + super.getName() + ")가 소리내어 웁니다.");
	}

	@Override
	public void fly() {
		System.out.println("참새(" + super.getName() + ")가 날아다닙니다.");
	}

	@Override
	public void showName() {
		System.out.println("참새의 이름은 " + super.getName() + "입니다.");
	}

	@Override
	public String sound() {
		return "짹짹";
	}

}
