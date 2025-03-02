package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier{

    //Couplage faible

    private IDao dao = null;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
       double t =dao.getData();
       double res =t*23;
       return res;
    }

    /* Pour Injecter dans la variable dao un objet d'une classe qui implémente l'interface IDao */

    public void setDao(IDao dao){
        this.dao = dao;
    }
}
