import dao.impl.ArtistDaoImpl;
import model.Artist;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        Artist artist = new Artist("test","test","test","test",1);
        ArtistDaoImpl dao = new ArtistDaoImpl();
        dao.add(artist);
        Artist artist1= dao.findById(1L);
        System.out.println(artist1);
        dao.remove(artist1);
//        dao.removeById(1L);
    }
}
