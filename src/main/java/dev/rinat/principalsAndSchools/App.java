package dev.rinat.principalsAndSchools;

import dev.rinat.principalsAndSchools.model.Principal;
import dev.rinat.principalsAndSchools.model.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Principal.class).addAnnotatedClass(School.class).buildSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();

        try {
            currentSession.beginTransaction();

//            1
//            Principal principal = currentSession.get(Principal.class, 1);
//            School school = principal.getSchool();
//            System.out.println(principal);
//            System.out.println(school);

//            2
//            School school = currentSession.get(School.class, 1);
//            Principal principal = school.getPrincipal();
//            System.out.println(school);
//            System.out.println(principal);

//            3
//            Principal principal = new Principal("Rinat", 41);
//            School school = new School(40);
//            principal.setSchool(school);
//            school.setPrincipal(principal);
//            currentSession.persist(principal);

//            4
//            Principal principal = new Principal("Rustam", 47);
//            School school = currentSession.get(School.class, 1);
//            principal.setSchool(school);
//            currentSession.persist(principal);

//            5
            Principal principal = currentSession.get(Principal.class, 1);
            School school = currentSession.get(School.class, 1);
            principal.setSchool(school);

            currentSession.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }
}
