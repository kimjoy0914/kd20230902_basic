package com.step5;

public class GuguDan {
  public static void main(String[] args) {
    for(int i=2;i<10;i=i+1){
      for(int j=1;j<10;++j){
        System.out.println(i+"*"+j+"="+(i*j));
      }//end of inner for
    }//end of outter for
  }
}
