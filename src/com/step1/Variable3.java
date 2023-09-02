package com.step1;

public class Variable3 {
  int i;//전역변수선언
  //생성자 구현
  public Variable3(){
    i = 7;
  }
  void methodA(int j){//사용자정의메소드구현
    System.out.println(i);//i가 0이아니고 왜 7이지?
    System.out.println(j);//j는 호출될 때 결정됨
  }//end of methodA
  //메인메소드
  public static void main(String[] args) {
    Variable3 v = new Variable3();
    v.methodA(2);
  }//end of main
}
