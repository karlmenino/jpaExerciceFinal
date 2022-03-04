package model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Manager extends Person{
    private int budget;
    @OneToMany(mappedBy = "manager")
    private List<Artist> artists = new ArrayList<>();

    public Manager() {
    }

    public Manager(String firstName, String lastName, int budget) {
        super(firstName, lastName);
        this.budget = budget;
    }
}
