
//progrsm that displays a month when a rand integer is generated
/*
*generate a random number
*use switch statement to map int into months
*
* */
public class Month {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 12 );


        switch (number){
            case 0:
                System.out.println("January");
                break;
            case 1:
                System.out.println("February");
                break;
            case 2:
                System.out.println("March");
                break;
            case 3:
                System.out.println("April");
                break;
            case 4:
                System.out.println("may");
                break;
            case 5:
                System.out.println("june");
                break;
            case 6:
                System.out.println("july");
                break;
            case 7:
                System.out.println("August");
                break;
            case 8:
                System.out.println("September");
                break;
            case 9:
                System.out.println("october");
                break;
            case 10:
                System.out.println("November");
                break;
            case 11:
                System.out.println("December");
                break;
        }
    }
}
