package com.step1;

public class Variable2 {
  int i;//전역변수선언
  void methodA(){//사용자정의메소드구현
    int i = 3;//지역변수 선언
    System.out.println(i);
  }//end of methodA
  //메인메소드
  public static void main(String[] args) {
    Variable1 v1 = new Variable1();
    v1.methodA();//5출력
    Variable2 v2 = new Variable2();
    v2.methodA();//3출력
  }//end of main
}
