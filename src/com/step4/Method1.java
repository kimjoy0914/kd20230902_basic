package com.step4;

public class Method1 {
  int tot = 0;
  //접근제한자 - 리턴타입 - 메소드이름
  int plus(int x, int y){
    tot = x + y;
    return tot;
  }
  void minus(int x, int y){
    tot = x - y;
  }
  public static void main(String[] args) {
    
  }
}
