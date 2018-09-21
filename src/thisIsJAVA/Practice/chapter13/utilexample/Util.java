package thisIsJAVA.Practice.chapter13.utilexample;

import thisIsJAVA.Practice.chapter13.genericmethod.Pair;

public class Util {
    public <K,V> V getValue(Pair<K,V> p, K k){
        if(p.getKey() == k){
            return p.getValue();
        }else
            return null;
    }
}
