package com.step2;

public class Parameter1 {
  //파라미터로 받은 두 수의 합을 구하면
  void methodA(int x, int y){
    int hap = x+y;
    System.out.println("두수의 합은? "+hap);
  }//end of methodA
  public static void main(String[] args) {
    Parameter1 p = new Parameter1();
    p.methodA(2, 3);
  }//end of main
}//end of Parameter1