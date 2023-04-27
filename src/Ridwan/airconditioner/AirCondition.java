package Ridwan.airconditioner;

public class AirCondition {
        private boolean isOn;
        private String acName;
        private int temperature;


        public AirCondition(String acName) {

        }
        public AirCondition(String acName, boolean isOn) {
            this.isOn = isOn;
        }

        public AirCondition(int temp, String acName, boolean isOn) {
            String putAcOn = "no response";
            if (!isOn) System.out.println(putAcOn);
        }

        public void setOn(boolean value) {
            if (value) isOn = true;
//        if (value == true) isOn = true;
            else isOn = false;

        }

        public boolean isOn() {
            return isOn;
        }

        public void increaseTemperature(int temp) {
            temperature = Math.min(temp, 30);
//        if (temp > 30) temperature = 30;
//        else temperature = temp;
        }

        public int getTemperature() {
            return temperature;
        }

        public void decreaseTemperature(int temp) {
            temperature = Math.max(temp, 16);
        /*if (temp < 16) temperature = 16;
        else temperature = temp;*/

    }
}
