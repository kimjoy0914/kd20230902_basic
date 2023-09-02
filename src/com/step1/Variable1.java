package com.step1;

public class Variable1 {
  int i;//전역변수선언
  void methodA(){//사용자정의메소드구현
    int i = 5;
    System.out.println(i);
  }//end of methodA
  //메인메소드
  public static void main(String[] args) {
    Variable1 v1 = new Variable1();
    v1.methodA();
  }//end of main
}
