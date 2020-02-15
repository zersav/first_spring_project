package org.example.service;//stupid test

import org.apache.commons.text.similarity.LevenshteinDistance;

import java.util.HashMap;
import java.util.Map;

public class IDK{
    Map <String,String> sity;

    public IDK(){
        sity = new HashMap<>();
        sity.put("Rivne","695365");
        sity.put("Kherson","706448");
        sity.put("Khmelnytskyi","706369");
        sity.put("Lviv","702550");
        sity.put("Odesa","698740");
        sity.put("Dnipro","709930");
        sity.put("Kyiv","703448");
        sity.put("Ternopil","691650");
    }


    public String levenstein(String rawstring){
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        String str1 = "Ternopil";
        int distance = 8;
        for(Map.Entry <String,String> m: sity.entrySet()){
            if(levenshteinDistance.apply(m.getKey(),rawstring)<distance){
                str1 = m.getKey();
                distance = levenshteinDistance.apply(m.getKey(),rawstring);
            }
        }
        return sity.get(str1);
    }

}