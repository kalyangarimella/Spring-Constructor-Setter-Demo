package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.santosh.spring.HelloService;

@SuppressWarnings("deprecation")
public class Application {

    public static void main(String[] args) {

    	BeanFactory beanFactory =  new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\beans.xml"));
    	
    	HelloService helloService1 = (HelloService)beanFactory.getBean("helloService1");
    	System.out.println(helloService1.getMessage());
    	
    	System.out.println("=========================");
    	
    	HelloService helloService2 = (HelloService)beanFactory.getBean("helloService2");
    	System.out.println(helloService2.getMessage());
    	
    	System.out.println("=========================");
    	
    	HelloService helloService3 = (HelloService)beanFactory.getBean("helloService3");
    	System.out.println(helloService3.getMap());
    	
    	System.out.println("=========================");
    	
    	HelloService helloService4 = (HelloService)beanFactory.getBean("helloService4");
    	System.out.println(helloService4.getList());
    	
    	System.out.println("=========================");
    	
    	HelloService helloService5 = (HelloService)beanFactory.getBean("helloService5");
    	System.out.println(helloService5.getSet());
    	
    	System.out.println("=========================");
    	
    	HelloService helloService6 = (HelloService)beanFactory.getBean("helloService6");
    	System.out.println(helloService6.getProps());
    }
}
