import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterate {

    public static void main(String[] args){
        Map mp= new HashMap();
        mp.put("smruti",121);
        mp.put("bikash",453);
        mp.put("sahoo",874);
        Set studentKeys= mp.keySet();
        Iterator it= studentKeys.iterator();
        while(it.hasNext()){
            Object key= it.next();
            Object value= mp.get(key);
            System.out.println(key+"="+value);
        }
    }
}
