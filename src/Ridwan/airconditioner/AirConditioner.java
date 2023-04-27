package Ridwan.airconditioner;

public class AirConditioner {
        private String name, colour;
        private int temperature = 0, temperatureBeforeWeOffTheAc;
        public void onTheAc(){
            temperature = temperatureBeforeWeOffTheAc;
        }
        public void offTheAc(){
            temperatureBeforeWeOffTheAc =getTemperature();
            temperature = 0;
        }
        public int increaseTheTemperature(){
            temperature++;
            return temperature;
        }
        public int decreaseTheTemperature(){
            temperature--;
            return temperature;
        }

        public AirConditioner(String name, int temperature, String colour) {
            this.name = name;
            this.temperature = temperature;
            this.colour = colour;
        }

        public AirConditioner(){}
        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public String getColour() {


            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public void setName(String name) {

            this.name = name;
        }

        public String getName() {

            return name;
        }

        public int getTemperature() {

            return temperature;
        }

        public void setTemperatureBeforeWeOffTheAc(int temperatureBeforeWeOffTheAc) {
            this.temperatureBeforeWeOffTheAc = temperatureBeforeWeOffTheAc;
        }
    }

