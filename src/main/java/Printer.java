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

    public void PrintPages(int pages, int copies) {
        int total = (pages * copies);
        if ((this.paper > total) && (this.toner > total)) {
            this.paper -= total;
            this.toner -= total;
        }
    }


}
