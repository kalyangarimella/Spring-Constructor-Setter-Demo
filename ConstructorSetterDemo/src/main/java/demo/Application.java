package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.santosh.spring.EmployeeServices;

@SuppressWarnings("deprecation")
public class Application {

    public static void main(String[] args) {
    	
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\beans.xml"));
		
		EmployeeServices employeeServices = (EmployeeServices)beanFactory.getBean("employeeServices");
		
		employeeServices.incrementSalary(2, 3000);
		
		System.out.println("completed");
		
    }
}
