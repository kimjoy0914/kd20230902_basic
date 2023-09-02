package com.step3;
public class ReturnType4 {
  public int[] data(){
    int[] jumsu = {75, 90, 80};
    return jumsu;
  }
  public void data2(){
    System.out.println("호출할때 대입연산자로 받을 수 없음");
  }
  public static void main(String[] args) {
    ReturnType4 r = new ReturnType4();
    int[] jumsu = r.data();
    //jumsu = r.data2();에러발생함
    System.out.println(jumsu[0]);
    System.out.println(jumsu[1]);
    System.out.println(jumsu[2]);
  }
}
