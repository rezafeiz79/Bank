import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class DatabaseUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable e) {
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static <T> Set<T> getAllEntities(Session session, Class<T> type) {
        Set<T> set = new HashSet<T>();
        set.addAll(session.createQuery("SELECT a FROM " + type.getSimpleName() + " a", type).getResultList());
        return set;
    }

    public static <T> void saveEntity(Session session, T object) {
        session.save(object);
    }

    public static <T> void deleteEntity(Session session, T object) {
        session.delete(object);
    }

    public static <T> void updateEntity(Session session, T object) {
        session.update(object);
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}