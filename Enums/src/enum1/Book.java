package enum1;
//creating an enum with constructor and accessor

public enum Book {
    //declare constants of enumtype
    JHTP("Java how to program , 2015"),
    MP("modern python, 2017"),
    ITJP("Introduction to java programming"),
    POM("psychology of money");

    private String title;
    private int Copyright;

    Book(){

    }


    Book(String s) {
    }

    Book(String title, int copyright){
        this.title = title;
        this.Copyright = copyright;
    }


    public int getCopyright() {
        return Copyright;
    }

    public String getTitle() {
        return title;
    }



}
