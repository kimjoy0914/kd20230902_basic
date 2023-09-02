package com.step2;
public class K5 {
  int speed;
  String carColor;
  int wheelNum;
  public K5(int speed, String carColor, int wheelNum){
    this.speed = speed;
    this.carColor = carColor;
    this.wheelNum = wheelNum;
  }
  public void speedUp(){
    speed = speed + 1;
  }
  public void speedDown(){
    //insert here
  }
  public String toString(){
    return "K5";
  }
  public static void main(String[] args) {
    K5 k = new K5(0, "검정", 4);
    System.out.println(k);
  }
}
