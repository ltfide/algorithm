package codewars.tujuhkyu;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lutfi Dendiansyah
 * @created 01/05/2023 08:11
 */
public class InteractiveDictionary {

    @Test
    void test() {
        Dictionary dic = new Dictionary();
        dic.newEntry("Apple", "A fruit that grows on trees");
        System.out.println(dic.look("Apple"));
        System.out.println(dic.look("not found"));
    }
}

class Dictionary {
    Map<String, String> map = new HashMap<>();

    public Dictionary(){
        // your code
    }

    public void newEntry(String key, String value){
        map.put(key, value);
    }

    public String look(String key){
//        if (map.containsKey(key)) {
//            return map.get(key).toString();
//        }
//        return "Cant find entry for " + key;
        // or
        return map.getOrDefault(key, "Cant find entry for " + key);
    }
}
