package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    private IDao dao;// Couplage faible
    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul(){
        double temp= dao.getData();
        double res = temp +275.15;
        return res;
    }
    /*
     Il permet d'injecter dans la variable DAO un objet
     qui implémente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
