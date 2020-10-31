package org.itstep.task05;

public class Money {
    private long hryvnia;
    private byte kopecks;

    public Money(long hryvnia) {
        this(hryvnia , (byte) 0);
    }

    public Money(long hryvnia, byte kopecks) {
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }

    public Money(){

    }

    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }

    public Money addition(Money that){
        Money result=new Money();
        result.hryvnia=this.hryvnia+that.hryvnia;
        result.kopecks= (byte) (this.kopecks+that.kopecks);
        return result;
    }

    public Money subtraction(Money that){
        Money result=new Money();
        result.hryvnia=this.hryvnia-that.hryvnia;
        result.kopecks= (byte) (this.kopecks-that.kopecks);
        return result;
    }

    public Money multiplication(Money that){
        Money result=new Money();
        result.hryvnia=this.hryvnia*that.hryvnia;
        result.kopecks= (byte) (this.kopecks*that.kopecks);
        return result;
    }

    public Money division(double n){
        Money result=new Money();
        result.hryvnia= (long) (this.hryvnia/n);
        result.kopecks= (byte) (this.kopecks/n);
        return result;
    }

    public Money multiply(double n){
        Money result=new Money();
        result.hryvnia= (long) (this.hryvnia*n);
        result.kopecks= (byte) (this.kopecks*n);
        return result;
    }

    public boolean equals(Money that){
        return this.hryvnia==that.hryvnia && this.kopecks==that.kopecks;
    }

    public String toString(){
        return hryvnia+","+kopecks;
    }
}
