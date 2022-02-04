package technology;

public class Computer {
    private String maker;
    private String OS;

    public Computer(String maker, String OS){
        this.maker= maker;
        this.OS= OS;

    }

    public String getMaker(){return maker;}
    public void setMaker(String make){this.maker=make;}

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "maker='" + maker + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}
