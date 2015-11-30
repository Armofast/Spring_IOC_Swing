package loader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Loader {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("beans.xml");
	}

}
