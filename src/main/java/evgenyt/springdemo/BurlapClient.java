package evgenyt.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BurlapClient {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        Calculation calculation = (Calculation)context.getBean("calculationBean");
        System.out.println(calculation.cube(3));
    }
}
