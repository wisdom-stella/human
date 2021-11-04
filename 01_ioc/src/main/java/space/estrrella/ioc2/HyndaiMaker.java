package space.estrrella.ioc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service("hm")
public class HyndaiMaker implements CarMaker{
	@Setter
	@Autowired
	private Car car;
	
	
	public Car sell(Money money){
		System.out.println("금액 : " +money.getAmount());
//		return new Car ("Genesis g80");
		return car;
	}
}
