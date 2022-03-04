package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class SacemRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String code;
    @Column(nullable = false)
    private LocalDate date;

    public SacemRegistration(Long id, String code, LocalDate date) {
        this.id = id;
        this.code = code;
        this.date = date;
    }
    @OneToOne(mappedBy = "sacem")
    private Artist artist;
}
