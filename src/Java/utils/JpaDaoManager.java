package utils;

import lombok.Getter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Getter
public class JpaDaoManager {
    private static JpaDaoManager instance=null;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("artist");
    private JpaDaoManager() {}

    public static JpaDaoManager getInstance() {
        if (instance == null)instance = new JpaDaoManager();
        return instance;
    }
    public static void stop() {
        instance.emf.close();
    }
}
