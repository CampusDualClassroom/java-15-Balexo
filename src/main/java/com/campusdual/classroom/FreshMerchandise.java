package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise{

    private Date experationDate;
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area,
                           String shelf, int quantity, Date experationDate){
    super(name, uniqueId,responsibleId, zone, area, shelf, quantity);
    this.experationDate=experationDate;
}
    @Override
    public String getSpecificData(){
        String date = getFormattedDate(this.experationDate);

        return "Name: " + this.name +
                ", Unique ID: " + this.uniqueId +
                ", Responsible ID: " + this.responsibleId +
                ", Zone: " + this.zone +
                ", Area: " + this.area +
                ", Shelf: " + this.shelf +
                ", Quantity: " + this. quantity +
                ", Date: " + date;

    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }

    public String getFormattedDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    public Date getExpirationDate(){
        return this.experationDate;
    }
}

