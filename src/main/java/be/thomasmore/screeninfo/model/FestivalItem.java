package be.thomasmore.screeninfo.model;

import java.util.Date;

public class FestivalItem {
    private String festivalName;
    private String festivalImage;
    private String backgroundColor;
    private Date festivalDate;
    private String festivalLink;
    private boolean onGoing; // om manueel te zeggen dat een event bezig is

    public FestivalItem(Festival festival){
        festivalName = festival.getFestivalName();
        festivalImage = festival.getFestivalImage();
        backgroundColor = festival.getBackgroundColor();
        festivalLink = festival.getFestivalLink();
        onGoing = festival.isOnGoing();

        festivalDate = festival.getStartDate(); // voor nu debuggen
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

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setFestivalDate(Date festivalDate) {
        this.festivalDate = festivalDate;
    }

    public Date getFestivalDate() {
        return festivalDate;
    }

    public void setFestivalLink(String festivalLink) {
        this.festivalLink = festivalLink;
    }

    public String getFestivalLink() {
        return festivalLink;
    }

    public void setOnGoing(boolean onGoing) {
        this.onGoing = onGoing;
    }

    public boolean isOnGoing() {
        return onGoing;
    }
}
