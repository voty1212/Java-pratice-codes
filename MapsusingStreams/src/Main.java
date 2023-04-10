import java.util.*;

import static java.util.Arrays.stream;

class MapEx{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String >();
        map.put(0,"Srini");
        map.put(1,"Dazzle");
        map.put(2,"Harsha");
        map.put(3,"Srini");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
               /* for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        */}

    }
