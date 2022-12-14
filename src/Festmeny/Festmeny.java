package Festmeny;

import java.time.LocalDateTime;

public class Festmeny {

    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;

    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        this.licitekSzama = 0;
        this.legmagasabbLicit = 0;
        this.legutolsoLicitIdeje = null;
        this.elkelt = false;
    }

    public String getFesto(){
        return this.festo;
    }

    public String getStilus(){
        return this.stilus;
    }

    public int getLicitekSzama(){
        return this.licitekSzama;
    }

    public LocalDateTime getLegutolsoLicitIdeje(){
        return this.legutolsoLicitIdeje;
    }

    public boolean getElkelt() {
        return elkelt;
    }

    public void setElkelt(boolean elkelt) {
        this.elkelt = elkelt;
    }

    public void licit(){
        if(this.elkelt==true){
            System.out.println("A festmény már elkelt");
        }
        else{
            if(this.licitekSzama==0){
                this.legmagasabbLicit=100;
                this.licitekSzama++;
                this.legutolsoLicitIdeje=LocalDateTime.now();
            }
            else{
                this.legmagasabbLicit=(int) (this.legmagasabbLicit*1.1);
                this.licitekSzama++;
                this.legutolsoLicitIdeje=LocalDateTime.now();
            }
        }

    }

    public void licit(int mertek){
        if (this.elkelt){
            System.out.println("A festmény elkelt!");
        }
        else {
            if (mertek<10 || mertek >100){
                System.out.println("Hiba");
            }
            else{
                this.legmagasabbLicit=(int)(this.legmagasabbLicit*(1+mertek*0.01));
                this.licitekSzama++;
                this.legutolsoLicitIdeje=LocalDateTime.now();
            }

        }
    }

    @Override
    public String toString() {
        if (this.elkelt){
            return String.format("Cím: %s, Festő: %s, Stílus: %s, Elkelt, Legmagasabb licit: %d $ " + this.legutolsoLicitIdeje + "Összesen %d db" , this.cim, this.festo, this.stilus, this.legmagasabbLicit, this.licitekSzama);
        }
        else {
            return String.format("Cím: %s, Festő: %s, Stílus: %s, Nem kelt el, Legmagasabb licit: %d $ " + this.legutolsoLicitIdeje + "Összesen %d db" , this.cim, this.festo, this.stilus, this.legmagasabbLicit, this.licitekSzama);
        }
    }
}
