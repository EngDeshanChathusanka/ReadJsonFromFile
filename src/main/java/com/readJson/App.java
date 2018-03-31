package com.readJson;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App
{
    public static void main( String[] args )
    {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/man.json");
        try
        {
            Man man = mapper.readValue(file, Man.class);
            System.out.println("Name: "+man.getName()+" Age: "+man.getAge()+" B Year: "+man.getDoB().getYear());
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }

    }
}
