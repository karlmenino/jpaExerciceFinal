package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private InstrementType type;

    public Instrument(String name, InstrementType type) {
        this.name = name;
        this.type = type;
    }
    @ManyToMany(mappedBy = "instrumentList")
    List<Artist> playableInstruments = new ArrayList<>();
    @OneToMany(mappedBy = "favoris")
    List<Artist> favoriteInstruments = new ArrayList<>();
}
