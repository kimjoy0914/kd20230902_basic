package com.step5;
//for문을 사용해서 1부터 10까지 세는 프로그램을 작성하시오.
public class For2 {
  public static void main(String[] args) {
    for(int i=1;i<11;i=i+1){
      if(i%2==0) System.out.println(i+"는 짝수");
    }
  }
}
