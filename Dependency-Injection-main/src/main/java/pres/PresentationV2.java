package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("config.txt"));

            // l'equivalent => DaoImpl d = new DaoImpl();
            String daoClassname = scanner.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDao dao=(IDao) cDao.getConstructor().newInstance();


            // l'equivalent => MetierImpl metier = new MetierImpl(d);
            String metierClassname = scanner.nextLine();
            Class cMetier = Class.forName(metierClassname);
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);


            // l'equivalent => metier.setDao(d); statique
            Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
            setDao.invoke(metier, dao);  // dynamique

            System.out.println("RES = "+metier.calcul());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }

