package metiier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class metierImpl implements Imetier {
    //@Autowired


    public metierImpl(IDao dao) {
        this.dao = dao;
    }

    private IDao dao; //couplage faible
    /* injecter dans la variable dao un objet d une classe qui implement l'interface Idao*/
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp=dao.getData();
        double res=temp*540/5;
        return res;



    }




}
