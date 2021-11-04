package space.estrrella.ioc1;

public class KiaMaker implements CarMaker {

	@Override
	public Car sell(Money money) {
		System.out.println("금액 : " + money.getAmout());
		return new Car("K5");

	}
}
