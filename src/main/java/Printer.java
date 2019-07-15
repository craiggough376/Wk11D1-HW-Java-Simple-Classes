public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int GetPaper(){
        return this.paper;
    }

    public int GetToner(){
        return this.toner;
    }


    public void PrintPages(int copies) {
        if ((this.paper > copies) & (this.toner > copies)) {
            this.paper -= copies;
            this.toner -= copies;
        }
    }


}
