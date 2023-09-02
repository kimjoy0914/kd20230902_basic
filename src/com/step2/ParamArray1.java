package com.step2;

public class ParamArray1 {
  void methodA(int[] javas){
    System.out.println(javas[0]);//85출력
    System.out.println(javas[1]);//90출력
    System.out.println(javas[2]);//70출력
  }
  public static void main(String[] args) {
    int javas[] = {85, 90, 70};
    ParamArray1 p = new ParamArray1();
    p.methodA(javas);
  }
}
