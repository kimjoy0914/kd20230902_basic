package com.step5;

public class TwoArray {
  public static void main(String[] args) {
    int score[][] = {
      {100,90,80}
     ,{85,90,80}
     ,{80,70,80}
     ,{90,90,85}
     ,{65,80,70}
    };	   
    for(int i=0;i<5;i=i+1){
      for(int j=0;j<3;j=j+1){
        System.out.println("score["+i+"]["+j+"] = "+score[i][j]);
      }
    }
  }
}
