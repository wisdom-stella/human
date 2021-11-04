package space.estrrella.ioc2;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Setter
@Service
// 필드위에 setter추가하면 해당 필드에만 적용 / class위에 두면 모든 class에 적용 
public class OrderManager {	
	@Qualifier("hm")
	@Autowired
	private CarMaker maker;
//	@Autowired
//	@Resource
	@Inject
	private Money money;
	
	public void order(){
		Car car = maker.sell(money);
		System.out.println("차량이름 : " + car.getName());
	}
}
