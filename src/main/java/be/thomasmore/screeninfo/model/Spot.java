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
    private float mapCorndinaatX;
    private float mapCorndinaatY;

    private String spotName;
    private String shortInfo;
    private String adress;
    private Date date;
    private String extraLink;



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
    public float getMapCorndinaatX() {
        return mapCorndinaatX;
    }
    public void setMapCorndinaatX(float mapCorndinaatX) {
        this.mapCorndinaatX = mapCorndinaatX;
    }
    public float getMapCorndinaatY() {
        return mapCorndinaatY;
    }
    public void setMapCorndinaatY(float mapCorndinaatY) {
        this.mapCorndinaatY = mapCorndinaatY;
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
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getExtraLink() {
        return extraLink;
    }
    public void setExtraLink(String extraLink) {
        this.extraLink = extraLink;
    }
}
