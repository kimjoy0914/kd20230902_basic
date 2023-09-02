package com.step3;

public class ReturnType1 {
  String hello(){
    return "안녕하세요";
  }
  int hap(){
    int tot = 85+90+70;
    return tot;
  }
  double avg(int tot){
    double a = tot/3.0;
    return a;
  }
  public static void main(String[] args) {
    ReturnType1 t = new ReturnType1();
    int tot = t.hap();
    double a = t.avg(tot);
    System.out.println("평균은 " + a);
  }
}
