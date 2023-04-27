package Ridwan.myaeroplane;

public class Aeroplane {
    private String name;
    private boolean isOn;
    private String colour;
    private  int seat;
    private  String acName;
    private int ac;
    private  int acOn;
    private  int temperature = 0;
    private int decreaseTemperature;
    public void setDecreaseTemperature(int decreaseTemperature) {
        this.decreaseTemperature = decreaseTemperature;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }


    public Aeroplane(){}

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isOn(boolean b) {
        return isOn;
    }

    public void setOn(boolean on) {

        isOn = on;
    }
    public int getAcOn(){
        return acOn;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    public int getAc() {

        return ac;
    }

    public void setAc(int ac) {

        this.ac = ac;
    }


    public void setSeat(int seat) {

        this.seat = seat;
    }

    public Aeroplane(String name, boolean isOn, String colour, int ac,String acName,int seat,int acOn,int decreaseTemperature){
        this.name = name;
        this.isOn = isOn;
        this.colour = colour;
        this.ac = ac;
        this.acName = acName;
        this.acOn = acOn;
        this.decreaseTemperature = decreaseTemperature;

    }

    public int getTemperature() {

        return temperature++;
    }

//    public void setTemperature(int temperature) {
//        temperature++;
//    }

    public int getSeat() {
        return seat;
    }

    public void setAcOn(int acOn) {

        this.acOn = acOn;
    }


    public int getDecreaseTemperature() {
        return decreaseTemperature--;
    }
}
