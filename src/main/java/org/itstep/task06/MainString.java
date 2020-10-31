package org.itstep.task06;

import java.util.Arrays;

public class MainString {
    private char[] chars = new char[0];

    public MainString(){

    }

    public MainString(CharSequence str){
        chars = new char[str.length()];
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
    }

    public MainString(char s,int len){
        chars=new char[len];
        Arrays.fill(chars,s);
    }

    public int length(){
        return chars.length;
    }

    public void clean(){
        chars=new char[0];
    }

    public MainString concat(MainString other){
        MainString result = new MainString();
        result.chars = Arrays.copyOf(this.chars,this.chars.length+other.chars.length);
        System.arraycopy(other.chars,0,result.chars,this.chars.length,other.chars.length);
        return result;
    }

    public int indexOf(char s){
        int indx=-1;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==s){
                indx=i;
                break;
            }
        }
        return indx;
    }

    public String toString(){
        return new String(chars);
    }
}
