package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*se connecter a la base de donnée pour recupérer la température */
        System.out.println("VERSION BASSE DE  DONNEE");
        double temp=Math.random()*40;
        return temp;
    }


}
