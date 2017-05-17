package bean.scope;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restorent restorent = (Restorent) context.getBean("restobean");
		restorent.setWelcomeNote("set property for obj1");
		restorent.greedCustomer();
		
		Restorent restorent1 = (Restorent) context.getBean("restobean");
		//restorent1.setWelcomeNote("set property for obj2");
		restorent1.greedCustomer();
		
	}

}
