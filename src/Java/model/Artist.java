package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Artist extends Person {
    private String brandName;
    private String country;
    private int size;


    @OneToOne(cascade = CascadeType.ALL)
    private SacemRegistration sacem;
    @ManyToOne
    private Manager manager;
    @OneToMany(mappedBy = "artist")
    private List<Media> medias = new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Instrument> instrumentList=new ArrayList<>();
    @ManyToOne
    private Instrument favoris;

    public Artist(String firstName, String lastName, String brandName, String country, int size) {
        super(firstName, lastName);
        this.brandName = brandName;
        this.country = country;
        this.size = size;
    }

    public Artist() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Artist{");
        sb.append("brandName='").append(brandName).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", size=").append(size);
        sb.append(", sacem=").append(sacem);
        sb.append(", manager=").append(manager);
        sb.append(", instrumentList=").append(instrumentList);
        sb.append(", favoris=").append(favoris);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
