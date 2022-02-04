package technology;

public class Laptop extends Computer{
    private int screenSize;
    private int hardDriveSize;
    private String Procesor;
    private boolean hasWebCam;


    public Laptop  (String maker, String OS, int screenSize,
                    int hardDriveSize, String Procesor, boolean hasWebCam){
                    super(maker, OS);
                    this.screenSize= screenSize;
                    this.hardDriveSize= hardDriveSize;
                    this.Procesor=Procesor;
                    this.hasWebCam=hasWebCam;
    }


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public String getProcesor() {
        return Procesor;
    }

    public void setProcesor(String procesor) {
        Procesor = procesor;
    }

    public boolean isHasWebCam() {
        return hasWebCam;
    }

    public void setHasWebCam(boolean hasWebCam) {
        this.hasWebCam = hasWebCam;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Made By"+
                "screenSize=" + screenSize +
                ", hardDriveSize=" + hardDriveSize +
                ", Procesor='" + Procesor + '\'' +
                ", hasWebCam=" + hasWebCam +
                '}';
    }
    public static void main(String[] args){
        Laptop myLaptop= new Laptop("HP","Windows",14,500,"Intel 20x", true);
        SmartPhone myPhone= new SmartPhone("Apple","IOS",6,"Not bad","ATT", false);
        System.out.println(myLaptop);
        System.out.println(myPhone);
    }
}
