package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex){
        this.tonerLevel = 100;
        this.duplex = duplex;
    }

    public void addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        if (tonerLevel<=0){
            tonerLevel = 1;
        } else if (tonerLevel>100) {
            tonerLevel = 100;
        }
    }

    public int printPages(int printed){
        if (duplex==true){
            pagesPrinted = printed*2;
            System.out.println("Its a duplex printer");
            return pagesPrinted;
        }else{
            pagesPrinted = printed;
            return pagesPrinted;
        }
    }
}
