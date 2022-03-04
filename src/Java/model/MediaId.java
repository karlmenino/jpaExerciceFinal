package model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
@Getter @Setter
public class MediaId implements Serializable {

    public MediaId(String firstName,MediaType type) {
        this.name = firstName;
        this.mediaType = type;

    }

    public String name;
    public MediaType mediaType;

}
