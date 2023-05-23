package be.thomasmore.screeninfo.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class FestivalItem {
    private String festivalName;
    private String festivalImage;
    private String backgroundColor;
    private String date;
    private String festivalLink;
    private boolean onGoing; // om manueel te zeggen dat een event bezig is


    // !!moet weg!! voor nu steekt dit er in om html te laten werken
    private Integer maxCapacity; // dit is voor de barometer
    private Integer population; // dit is voor hoeveel man er momenteel is

    public FestivalItem(Festival festival){
        festivalName = festival.getFestivalName();
        festivalImage = festival.getFestivalImage();
        backgroundColor = festival.getBackgroundColor();
        festivalLink = festival.getFestivalLink();

        onGoing = Date.from(java.time.LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()).after(festival.getStartDate());

        // voor nu debuggen
        date = "";
        LocalDate startDate = festival.getStartDate().toLocalDate();
        LocalDate endDate = festival.getEndDate().toLocalDate();
        if(startDate.getYear() != endDate.getYear()){
            date = startDate.getDayOfMonth()+"-"+ startDate.getMonthValue()+"-"+startDate.getYear() + " - ";
        }
        else if(startDate.getMonth() != endDate.getMonth()){
            date = startDate.getDayOfMonth()+"-"+ startDate.getMonthValue() + " - ";
        }
        else if(startDate.getDayOfMonth() != endDate.getDayOfMonth()){
            date = startDate.getDayOfMonth() + " - ";
        }
            date += endDate.getDayOfMonth()+"-"+endDate.getMonthValue()+"-"+endDate.getYear();

        maxCapacity = festival.getMaxCapacity();
        population = festival.getPopulation();
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

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
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





    // !!moet weg!!
    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
