package pres;

import metiier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presentationSpringAnnotation {
    public static void main(String [] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext("dao","metiier");
        Imetier metier =context.getBean(Imetier.class);
        System.out.println("resultat="+metier.calcul());
    }






}
