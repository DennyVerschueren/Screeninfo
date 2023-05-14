package be.thomasmore.screeninfo.model.taal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FestivalNederlands {
    @Id
    public Integer id;
    private String festivalName;
    private String festivalDate;

    private Integer festivalId;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setFestivalName(String festivalName) {
        this.festivalName = festivalName;
    }

    public String getFestivalName() {
        return festivalName;
    }

    public void setFestivalDate(String festivalDate) {
        this.festivalDate = festivalDate;
    }

    public String getFestivalDate() {
        return festivalDate;
    }

    public void setFestivalId(Integer festivalId) {
        this.festivalId = festivalId;
    }

    public Integer getFestivalId() {
        return festivalId;
    }
}
