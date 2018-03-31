package com.readJson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by deshan on 3/22/2018.
 */
@JsonAutoDetect
public class Man
{
    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("doB")
    private DoB doB;

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge( int age )
    {
        this.age = age;
    }

    public DoB getDoB()
    {
        return doB;
    }

    public void setDoB( DoB doB )
    {
        this.doB = doB;
    }
}

