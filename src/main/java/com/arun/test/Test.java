package com.arun.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {


        Emp e = new Emp(1, "Arun");

        Map<Emp, Boolean>  map = new HashMap<>();

        map.put(e, Boolean.TRUE);

        Boolean b = map.get(e);

        System.out.println(map.keySet());
        map.keySet().stream().forEach(s-> System.out.println(s.hashCode()+ "--> "+( s.hashCode() ^ s.hashCode() >>> 16)));


        System.out.println(b);

        e.name = "ArunGupta";

        System.out.println(map.get(e));

        System.out.println(map.keySet());


        map.keySet().stream().forEach(s-> System.out.println(s.hashCode()+ "--> "+( s.hashCode() ^ s.hashCode() >>> 16)));

    }

}

class Emp {

    int id;
    String name;
    Emp(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return id+ " "+ name;
    }
}
