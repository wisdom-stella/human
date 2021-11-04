package space.estrrella.ioc1;

public class HyndaiMaker implements CarMaker{
	public Car sell(Money money){
		System.out.println("금액 : " +money.getAmout());
		return new Car ("Genesis g80");
		
	}
}
