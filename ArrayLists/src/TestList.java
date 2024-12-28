//import arraylist
import java.util.ArrayList;
public class TestList {
    public static void main(String[] args) {

        //create a string arraylist
        ArrayList<String> niceCities = new ArrayList<>();
        ArrayList<Integer> cityAddress = new ArrayList<>();

        //add cities

        niceCities.add("Nairobi");
        niceCities.add("Kampala");
        niceCities.add("Kuala Lumpur");
        niceCities.add("Hong kong");
        niceCities.add("Rio");

        //print list
        System.out.println(niceCities.toString());

        //check if a city is in the list
        System.out.println("is Nairobi in the list?" + niceCities.contains("Nairobi"));

        //get the size of the list
        System.out.println("size of the list: " + niceCities.size());

        //get location of a value
        System.out.println("The location of Rio is at index : " + niceCities.indexOf("Rio") );
        


    }
}
