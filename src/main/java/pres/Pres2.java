package pres;
import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        /* Instanciation dynamique */
        String daoClassName= scanner.nextLine();//Pour connaître le non de la classe
        Class cDao = Class.forName(daoClassName);//Pour charger la classe en mémoire
        IDao dao =(IDao) cDao.newInstance();//Pour instancier la classe
        //System.out.println(dao.getData());

        String metierClassName= scanner.nextLine();//Pour connaître le non de la classe
        Class cMetier = Class.forName(metierClassName);//Pour charger la classe en mémoire
        IMetier metier =(IMetier) cMetier.newInstance();//Pour instancier la classe

        Method method = cMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao);
        method.invoke(metier,dao);
        System.out.println("Le résultat => "+metier.calcul());
    }
}
