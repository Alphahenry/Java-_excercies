/*
* types of methods
*
* */

import java.util.ArrayList;
import java.util.Arrays;

public class Listmethods {
    public static void main(String[] args) {
        Integer[] evenNum = {2,4,6,8,10,12,14,16,18,20};
        //convert array into lists
        ArrayList<Integer> even = new ArrayList<>(Arrays.asList(evenNum));

        //print to string

        System.out.println("The list include: " + even);
    }
}
