package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {

    public static void main(String[] args) {
        /* Injection des dépendances par instanciation statique  => new */
        DaoImpl d = new DaoImpl(); // NEW => Couplage fort
        MetierImpl metier = new MetierImpl(d); //Injection des dépendances via le Constructeur
        //metier.setDao(d);   // Injecion via le Setter
        System.out.println("RES="+metier.calcul());
    }
}
