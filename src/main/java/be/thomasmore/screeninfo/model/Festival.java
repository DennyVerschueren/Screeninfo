package be.thomasmore.screeninfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Festival {


    @Id
    public Integer id;
    private String festivalName;
    private String festivalImage;
    private String festivalDate;
    private String backgroundColor;

    private String festivalLink;

    public Festival(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFestivalName() {
        return festivalName;
    }

    public void setFestivalName(String festivalName) {
        this.festivalName = festivalName;
    }

    public String getFestivalImage() {
        return festivalImage;
    }

    public void setFestivalImage(String festivalImage) {
        this.festivalImage = festivalImage;
    }

    public String getFestivalDate() {
        return festivalDate;
    }

    public void setFestivalDate(String festivalDate) {
        this.festivalDate = festivalDate;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getFestivalLink() {
        return festivalLink;
    }

    public void setFestivalLink(String festivalLink) {
        this.festivalLink = festivalLink;
    }
}
