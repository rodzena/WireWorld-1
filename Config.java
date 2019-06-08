public class Config {
    private int timeJump;
    private int genNumber;
    private String inFile;
    private String outFile;
    private boolean wireMode;

    public Config(int timeJump, int genNumber, String inFile, String outFile, boolean wireMode){
        this.timeJump = timeJump;
        this.genNumber = genNumber;
        this.inFile = inFile;
        this.outFile = outFile;
        this.wireMode = wireMode;
    }

    //brak zdefiniowania trybu
    public Config(int timeJump, int genNumber, String inFile, String outFile){
        this.timeJump = timeJump;
        this.genNumber = genNumber;
        this.inFile = inFile;
        this.outFile = outFile;
        this.wireMode = true;
    }

    //brak zdefiniowania skoku czasowego
    public Config(int genNumber, String inFile, String outFile, boolean wireMode){
        this.timeJump = 1;
        this.genNumber = genNumber;
        this.inFile = inFile;
        this.outFile = outFile;
        this.wireMode = wireMode;
    }

    //brak zdefiniowania trybu i skoku
    public Config(int genNumber, String inFile, String outFile){
        this.timeJump = 1;
        this.genNumber = genNumber;
        this.inFile = inFile;
        this.outFile = outFile;
        this.wireMode = true;
    }




}
