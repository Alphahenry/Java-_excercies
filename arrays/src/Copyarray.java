//copy an array
public class Copyarray {
    public  static  void main(String [] args){
    int[] sourcearray = {2, 3, 4, 5, 6, 7, 8};

    int[] targetarray = new int[sourcearray.length];

    for (int i = 0; i < sourcearray.length; i++){
        targetarray[i] = sourcearray[i];
        System.out.println(targetarray[i]);
    }


}
}
