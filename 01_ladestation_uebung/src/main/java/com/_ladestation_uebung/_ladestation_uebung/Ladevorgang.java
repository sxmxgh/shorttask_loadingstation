package com._ladestation_uebung._ladestation_uebung;

import java.sql.Time;
import java.util.Date;
import java.util.Random;

public class Ladevorgang {
    private long id;
    Random rand = new Random();

    private int load_kwh = (int) (rand.nextDouble()*75+5);
    private int load_sec = (int) (rand.nextDouble()*5940+60);
    final int millisInDay = 24*60*60*1000;
    Time time = new Time((long)rand.nextInt(millisInDay));
    Date date = new Date();
    String date_short = date.toString().substring(0,10);



    //ID (Increases with actualization, TIME (TODAY, RANDOM TIME), LOADED ENERGY kW/h (RANDOM 5 - 80), LOADING TIME (RANDOM 60-6000)
    public Ladevorgang(long id) {
        this.id = id;
    }

    //ID SECTION
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //TIME SECTION

    public String getDate_short() {
        return date_short;
    }

    public void setDate_short(String date_short) {
        this.date_short = date_short;
    }

    private Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    //KWH SECTION
    public int getLoad_kwh() {
        return load_kwh;
    }

    public void setLoad_kwh(int load_kwh) {
        this.load_kwh = load_kwh;
    }
    //TIME SECTION
    public int getLoad_sec() {
        return load_sec;
    }

    public void setLoad_sec(int load_sec) {
        this.load_sec = load_sec;
    }

    @Override
    public String toString() {
        return "[User ID: " + id + "; Loaded energy in kw/h: " + load_kwh + "; Loading time in seconds: " + load_sec + "]";
    }

}
