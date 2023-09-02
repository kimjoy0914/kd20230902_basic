package com.step2;

public class ParamArray2 {
  void methodA(int[] javas){
    int hap = javas[0]+javas[1]+javas[2];
    System.out.println("세 학생 자바 총점은 "+hap);//70출력
    methodB(hap);
  }
  void methodB(int hap){
    double avg = hap/3.0;
    System.out.println("자바 평균은 "+avg);//70출력
  }
  public static void main(String[] args) {
    int javas[] = {85, 90, 70};
    ParamArray2 p = new ParamArray2();
    p.methodA(javas);
  }
}
