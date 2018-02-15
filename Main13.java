import java.util.HashMap;
import java.util.Map;

public class Main13 {

    /*
    Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if no
    two keys map to the same value (and false if any two or more keys do map to the same value). For example, if the map
    contains the following key/value pairs, your method would return true :
    {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins} . But calling it on the following map would
    return false , because of two mappings for Perkins and Reges :
    {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins} .
     */

    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("Pee","Bee");
        names.put("Sara","Ryder");
        names.put("Cora","Harper");
        names.put("Liam","Kosta");
        names.put("Vetra","Nyx");
        names.put("Drack","Nakmor");
        System.out.println(isUnique(names));
        names.put("Scott","Ryder");
        System.out.println(isUnique(names));
    }
    
    public static boolean isUnique(Map<String, String> map) {
        for (String key0:map.keySet()) {
            for (String key1:map.keySet()) {
                if (!key0.equals(key1) && map.get(key0).equals(map.get(key1))) {
                    return false;
                }
            }
        }
        return true;
    }
}
