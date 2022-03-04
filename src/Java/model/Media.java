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
    @ManyToOne()
    private Artist artist;

    private LocalDate date ;

    public Media() {
    }

    public Media(MediaId mediaId) {
        this.mediaId = mediaId;
        this.date = LocalDate.now();
    }

}
