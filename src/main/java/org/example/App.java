package org.example;

import org.example.entities.*;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Country Kyrgyzstan=new Country("KG");
        Country Kazakhstan=new Country("KZ");
        Country Russia=new Country("RU");
        List<Country>countries=new ArrayList<>();
        countries.add(Kazakhstan);
        countries.add(Kyrgyzstan);
        countries.add(Russia);
        create(Kazakhstan);
        create(Kyrgyzstan);
        create(Russia);
        System.out.println("___________");

        Logo peace=new Logo(1,"Rainbow");
        Logo SMM=new Logo(2,"Aliens");
        Logo DoctorClean=new Logo(3,"White Old Man");
        create(peace);
        create(SMM);
        create(DoctorClean);
        System.out.println("___________");

        SportType swimming=new SportType("Swimming");
        SportType dancing=new SportType("Dancing");
        SportType horsebackRiding=new SportType("HorsebackRiding");

        create(swimming);
        create(dancing);
        create(horsebackRiding);
        System.out.println("____________");

        Championship championship=new Championship("Swimming",countries,swimming);
        Championship championship1=new Championship("HorsebackRiding",countries,horsebackRiding);

        create(championship);
        create(championship1);

        Team peaceTeam=new Team("Rainbow",peace,"peace&world.com",swimming);
        Team SmmTeam=new Team("Aliens",SMM,"Aliens.com",dancing);
        Team DoctorCleanTeam=new Team("DoctorClean",DoctorClean,"DoctorClean.com",horsebackRiding);

        create(peaceTeam);
        create(SmmTeam);
        create(DoctorCleanTeam);
    }

    public static <T> void create(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entity);
        session.getTransaction().commit();
        session.close();
        System.out.println("You did it. You soooo gooood GIRRRL!");
    }
}

