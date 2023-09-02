package com.step2;

public class Parameter2 {
  public Parameter2(){}
  //생성자 안에서도 합을 구할 수 있다
  public Parameter2(int x, int y){
    //지역변수 hap선언
    int hap = x+y;
    System.out.println("두수의 합은? "+hap);
  }
  void methodA(){
    System.out.println("생성자 안에서 선언된 변수는 접근 불가함");
  }//end of methodA
  public static void main(String[] args) {
    Parameter2 p = new Parameter2(1,2);
  }//end of main
}//end of Parameter1