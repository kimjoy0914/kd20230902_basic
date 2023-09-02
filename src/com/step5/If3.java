package com.step5;

public class If3 {
  int su = 85;
  void methodA(){
    if(su%5 == 0){
      System.out.println("5의 배수");
    }else if(su%7 == 0){
      System.out.println("7의 배수");
    }else{
      System.out.println("5나 7의 배수가 아니다");
    }
  }
  public static void main(String[] args) {
    If3 if1 = new If3();
    if1.methodA();
  }
}
