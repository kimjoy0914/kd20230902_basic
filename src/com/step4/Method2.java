package com.step4;
import java.util.Random;

public class Method2 {
  int strike = 0;
  int ball = 0;
  int com[] = new int[3];
  int dap[] = new int[3];
  Random r = new Random();
  void nanSu(){
    com[0] = r.nextInt(10);
    do{
      com[1] = r.nextInt(10);
    }while(com[0] == com[1]);
    do{
      com[2] = r.nextInt(10);
    }while(com[0] == com[2] || com[1] == com[2]);
  }
  public static void main(String[] args) {
    Method2 m = new Method2();
    m.nanSu();
    System.out.println(m.com[0]+""+m.com[1]+""+m.com[2]);
  }
}
