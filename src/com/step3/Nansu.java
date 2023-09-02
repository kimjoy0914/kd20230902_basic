package com.step3;
import java.util.Random;

public class Nansu {
  int shuffle(){
    Random r = new Random();
    int no = r.nextInt(10);
    return no;    
  }
  public static void main(String[] args) {
    Random r = new Random();
    int no = r.nextInt(10);
    System.out.println(no);
    Nansu n = new Nansu();
    no = -1;
    no = n.shuffle();
    System.out.println(no);
  }
}
