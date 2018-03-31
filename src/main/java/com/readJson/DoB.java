package com.readJson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by deshan on 3/22/2018.
 */
@JsonAutoDetect
public class DoB
{
    @JsonProperty("year")
    private int year;

    @JsonProperty("month")
    private int month;

    @JsonProperty("day")
    private int day;

    public int getYear()
    {
        return year;
    }

    public void setYear( int year )
    {
        this.year = year;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth( int month )
    {
        this.month = month;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay( int day )
    {
        this.day = day;
    }
}
