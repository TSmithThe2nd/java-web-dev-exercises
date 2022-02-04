package technology;

public class SmartPhone extends Computer {
    private int batteryLife;
    private String cameraQuality;
    private String carrier;
    private boolean is5G;

    public SmartPhone(String maker, String OS, int batteryLife, String cameraQuality,
                      String carrier, boolean is5G) {
        super(maker, OS);
        this.batteryLife= batteryLife;
        this.cameraQuality=cameraQuality;
        this.carrier=carrier;
        this.is5G=is5G;
    }


    public int getBatteryLife() {
        return batteryLife;
    }

    public String getCameraQuality() {
        return cameraQuality;
    }

    public String getCarrier() {
        return carrier;
    }

    public boolean isIs5G() {
        return is5G;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "batteryLife=" + batteryLife +"hrs" +
                ", cameraQuality='" + cameraQuality + '\'' +
                ", carrier='" + carrier + '\'' +
                ", is5G=" + is5G +
                '}';
    }
}
