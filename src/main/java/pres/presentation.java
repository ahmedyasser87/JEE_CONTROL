package pres;

import dao.DaoImpl;
import metiier.metierImpl;

public class presentation {
    public static void main(String[] args) {
        //Factory

        /*injection des dependances par methode statiques*/

        DaoImpl dao =new DaoImpl();
        metierImpl metier= new metierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Résultat="+metier.calcul());
        /*cas de capteur */
        /* DaoImpl2 dao = new DaoImpl2();
         metier.setDao(dao);
         */

    }
}
