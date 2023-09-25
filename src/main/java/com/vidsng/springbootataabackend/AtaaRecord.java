package com.vidsng.springbootataabackend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "ATAA_Records")
public class AtaaRecord {


   // private long recordID;
    private String aircraftOwner;
    private String operation;
    private String aircraftType;
    private String runway;
    private String approach;
    private String departure;
    private int count;
    private Date date;
    //private boolean overflight;


    //Getters, Setters, ToString
   // public long getRecordID(){return recordID;}
   // public void setRecordID(long recordID){this.recordID = recordID;}

    public String getAircraftOwner(){return aircraftOwner;}
    public void setAircraftOwner(String aircraftOwner){this.aircraftOwner = aircraftOwner;}

    public String getOperation(){return operation;}
    public void setOperation(String operation){this.operation = operation;}

    public String getAircraftType(){return aircraftType;}
    public void setAircraftType(String aircraftType){this.aircraftType = aircraftType;}

    public String getRunway(){return runway;}
    public void setRunway(String runway){this.runway = runway;}

    public String getApproach(){return approach;}
    public void setApproach(String approach){this.approach = approach;}

    public String getDeparture(){return departure;}
    public void setDeparture(String departure){this.departure = departure;}

    public int getCount(){return count;}
    public void setCount(int count){this.count = count;}

    public Date getDate(){return date;}
    public void setDate(Date date){this.date = date;}

    //public boolean isOverflight(){return overflight;}
    //public void setOverflight(){this.overflight = overflight;}


    @Override
    public String toString() {
        return "AtaaRecord{" +
               " aircraftOwner='" + aircraftOwner + '\'' +
                ", operation='" + operation + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", runway='" + runway + '\'' +
                ", approach='" + approach + '\'' +
                ", departure='" + departure + '\'' +
                ", count=" + count +
                ", date=" + date +
                '}';
    }
}
