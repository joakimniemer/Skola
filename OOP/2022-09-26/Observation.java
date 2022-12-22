import java.util.concurrent.ThreadLocalRandom;

public class Observation {
    private int id;
    private int hour;
    private int minute;
    private double temp, windspeed, windDeg;
    private String dirWind;

    public Observation(int id, int hour, int minute, double temp, double windspeed, double windDeg) {
        this.id = id;
        this.hour = hour;
        this.minute = minute;
        this.temp = temp;
        this.windspeed = windspeed;
        this.windDeg = windDeg;
    }

    public String windDir() {
        if (this.windDeg > 348.75 && this.windDeg <= 360) {
            this.dirWind = "N";
        } else if (this.windDeg >= 0 && this.windDeg <= 11.25) {
            this.dirWind = "N";
        } else if (this.windDeg > 11.25 && this.windDeg <= 33.75) {
            this.dirWind = "NNO";
        } else if (this.windDeg > 33.75 && this.windDeg <= 56.25) {
            this.dirWind = "NO";
        } else if (this.windDeg > 56.25 && this.windDeg <= 78.75) {
            this.dirWind = "ONO";
        } else if (this.windDeg > 78.75 && this.windDeg <= 101.25) {
            this.dirWind = "O";
        } else if (this.windDeg > 101.25 && this.windDeg <= 123.75) {
            this.dirWind = "OSO";
        } else if (this.windDeg > 123.75 && this.windDeg <= 146.25) {
            this.dirWind = "SO";
        } else if (this.windDeg > 146.25 && this.windDeg <= 168.75) {
            this.dirWind = "SSO";
        } else if (this.windDeg > 168.75 && this.windDeg <= 191.25) {
            this.dirWind = "S";
        } else if (this.windDeg > 191.25 && this.windDeg <= 213.75) {
            this.dirWind = "SSV";
        } else if (this.windDeg > 213.75 && this.windDeg <= 236.25) {
            this.dirWind = "SV";
        } else if (this.windDeg > 236.25 && this.windDeg <= 258.75) {
            this.dirWind = "VSV";
        } else if (this.windDeg > 258.75 && this.windDeg <= 281.25) {
            this.dirWind = "V";
        } else if (this.windDeg > 281.25 && this.windDeg <= 303.75) {
            this.dirWind = "VNV";
        } else if (this.windDeg > 303.75 && this.windDeg <= 326.25) {
            this.dirWind = "NV";
        } else if (this.windDeg > 326.25 && this.windDeg <= 348.75) {
            this.dirWind = "NNV";
        }
        return this.dirWind;
    }

    public int getId() {
        return this.id;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = ThreadLocalRandom.current().nextInt(25);
    }

    public double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(double windspeed) {
        this.windspeed = ThreadLocalRandom.current().nextInt(55);
    }

    public double getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(double winddir) {
        this.windDeg = ThreadLocalRandom.current().nextInt(360) + 1;
    }

    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }

}