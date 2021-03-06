package model.bootstrapper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EMFBootstrapper {
    private static EntityManagerFactory entityManagerFactory
            = Persistence.createEntityManagerFactory("ChilesDB");

    private EMFBootstrapper() {}

    public static EntityManager openEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}