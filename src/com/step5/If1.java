package com.step5;

public class If1 {
  int jumsu = 85;
  boolean isPass(){
    boolean pass = false;
    if(jumsu >= 60){
      pass = true;
    }
    return pass;
  }
  public static void main(String[] args) {
    If1 if1 = new If1();
    boolean pass = if1.isPass();
    if(pass) System.out.println("합격");
    else System.out.println("불합격");
  }
}
