package be.thomasmore.screeninfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;

@Entity
public class Spot {

    @Id
    private Integer id;
    private String spotType;
    private float mapCordinatX;
    private float mapCordinatY;

    private String spotName;
    private String shortInfo;
    private String adress;
    private Date startDate;
    private String extraLink;


    public Spot(){

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSpotType() {
        return spotType;
    }
    public void setSpotType(String spotType) {
        this.spotType = spotType;
    }
    public float getMapCordinatX() {
        return mapCordinatX;
    }
    public void setMapCordinatX(float mapCordinatX) {
        this.mapCordinatX = mapCordinatX;
    }
    public float getMapCordinatY() {
        return mapCordinatY;
    }
    public void setMapCordinatY(float mapCordinatY) {
        this.mapCordinatY = mapCordinatY;
    }
    public String getSpotName() {
        return spotName;
    }
    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }
    public String getShortInfo() {
        return shortInfo;
    }
    public void setShortInfo(String shortInfo) {
        this.shortInfo = shortInfo;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public String getExtraLink() {
        return extraLink;
    }
    public void setExtraLink(String extraLink) {
        this.extraLink = extraLink;
    }
}
