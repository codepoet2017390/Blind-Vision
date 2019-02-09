package org.tensorflow.demo;

import java.util.HashMap;

public class DepthFinder {

    double res=0;
    double apparentWidth=0;
    double focalLength=378.544;
    double knownWidth=20;

    public static  HashMap<String,Double> wmap = new HashMap<String, Double>()
    {{
        wmap.put("person", 20.0);
        wmap.put("laptop", 15.0);
        wmap.put("chair", 18.0);
        wmap.put("bottle", 5.0);
    }};

    public DepthFinder(){}

    public DepthFinder(double Width){
        apparentWidth=Width;
    }


    public void populateHashMap(){
        wmap.put("person", 20.0);
        wmap.put("laptop", 15.0);
        wmap.put("chair", 18.0);
        wmap.put("bottle", 5.0);
    }

    public double DepthFinder(double Width,String s){
        apparentWidth=Width;
        if(wmap.get(s)==null){
            knownWidth=10.0;
        }else{
            knownWidth=wmap.get(s);
        }
        res=(knownWidth*focalLength)/apparentWidth;
        return res;
    }
}
