package model;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
public class Media {
    @EmbeddedId
    MediaId mediaId;
    private LocalDate date ;

    public Media(MediaId mediaId) {
        this.mediaId = mediaId;
        this.date = LocalDate.now();
    }
    @ManyToOne()
    private Artist artist;
}
