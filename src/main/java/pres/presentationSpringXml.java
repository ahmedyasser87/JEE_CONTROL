package pres;
import metiier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support. ClassPathXmlApplicationContext;


public class presentationSpringXml {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Imetier metier= (Imetier) context.getBean("metiier");
        System.out.println(metier.calcul());
    }
}

