//introduction to array lists
//Arraylist are mutable Arrays

import java.util.ArrayList;
public class intro {
    public static void main(String[] args) {
        //initialize and construct
        ArrayList<String> fruits = new ArrayList<>();

        //the add method adds a value to the end of the list
        fruits.add("apples");
        fruits.add("Bananas");
        fruits.add("pineaples");

        System.out.println(fruits);

        //adding at a specific index

        fruits.add(1,"strawberry");
        fruits.add(3, "watermelon" );

        System.out.println(fruits);

        //getting an element at an index
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(3));
        //changing an item

        fruits.set(0, "guava");

        System.out.println(fruits);

        //removing an element
        fruits.remove(0);
        System.out.println(fruits);

        //clear an arraylist
        fruits.clear();
        System.out.println(fruits);


    }
}
