package tv;

public class Tv {
    int volume = 1;
    int channel = 1;
    boolean on = false;


    public  Tv(){

    }


    public Tv( int newVolume, int newChannel, boolean newOn){
         volume = newVolume;
         channel = newChannel;
         on = newOn;

    }

    public void turnOff(){
        on = false;
    }

    public void turnOn(){
        on = true;
    }
    public void  setVolume(int newVolume){
        if (on && newVolume >= 1 && newVolume <= 12)
            volume = newVolume;
    }

    public void setChannel (int newChannel ){
        if (on && newChannel >= 1 &&  newChannel <= 120 )
            channel = newChannel;
    }
//move channel upwards

    public  void channelUp (){
        if (on && channel < 120   )
            channel ++;
    }

    //move channel downwards

    public  void channeldown(){
        if (on && channel > 1 )
            channel --;
    }

    //turn u volume
    public void volumeUp(){
        if (on && volume < 12)
            volume ++;
    }
    public  void  volumeDown(){
        if (on && volume > 1)
            volume --;
    }

}







