package com.step3;

public class ReturnType2 {
  int tot;//총점을 담을 변수선언
  double a;//평균을 담을 변수선언
  void hello(){
    System.out.println("return 예약어 사용불가함");
  }
  void hap(){
    tot = 85+90+70;
  }
  void avg(){
    a = tot/3.0;
  }
  public static void main(String[] args) {
    ReturnType2 t = new ReturnType2();
    t.hap();
    t.avg();
    System.out.println("총점은 " + t.tot);
    System.out.println("평균은 " + t.a);
  }
}
