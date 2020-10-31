package org.itstep.task04;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction addition(Fraction that){
        Fraction result=new Fraction();
        if(this.denominator==that.denominator){
            result.numerator=this.numerator+ that.numerator;
            result.denominator=this.denominator;
        }
        else{
            result.denominator=this.denominator*that.denominator;
            this.numerator*= that.denominator;
            that.numerator*=this.denominator;
            result.numerator=this.numerator+ that.numerator;
        }
        if(result.numerator==result.denominator){
            result.numerator=result.denominator=1;
        }
        return result;
    }

    public Fraction subtraction(Fraction that){
        Fraction result=new Fraction();
        if(this.denominator==that.denominator){
            result.denominator=this.denominator;
            result.numerator=this.numerator-that.numerator;
        }
        else{
            result.denominator=this.denominator*that.denominator;
            this.numerator*= that.denominator;
            that.numerator*=this.denominator;
            result.numerator=this.numerator - that.numerator;
        }
        if(result.numerator==result.denominator){
            result.numerator=result.denominator=1;
        }
        return result;
    }

    public Fraction multiplication(Fraction that){
        Fraction result=new Fraction();
        result.numerator=this.numerator*that.numerator;
        result.denominator=this.denominator*that.denominator;
        if(result.numerator==result.denominator){
            result.numerator=result.denominator=1;
        }
        return result;
    }

    public Fraction division(Fraction that){
        Fraction result=new Fraction();
        Fraction tmp=new Fraction();
        tmp.numerator= that.denominator;
        tmp.denominator=that.numerator;
        if(this.denominator== tmp.numerator){
            this.denominator= tmp.numerator=1;
        }
        if(this.numerator== tmp.denominator){
            this.numerator= tmp.denominator=1;
        }
        result.numerator=this.numerator*tmp.numerator;
        result.denominator=this.denominator*tmp.denominator;
        if(result.numerator==result.denominator){
            result.numerator=result.denominator=1;
        }
        return result;
    }

}
