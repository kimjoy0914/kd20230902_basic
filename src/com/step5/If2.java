package com.step5;

public class If2 {
  int jumsu = 85;
  void account(){
    if(jumsu >= 90){
      System.out.println("A학점");
    }else if(jumsu >= 80){
      System.out.println("B학점");
    }else if(jumsu >= 70){
      System.out.println("C학점");
    }else if(jumsu >= 60){
      System.out.println("D학점");
    }else{
      System.out.println("F학점");
    }
  }
  public static void main(String[] args) {
    If2 if1 = new If2();
    if1.account();
  }
}
