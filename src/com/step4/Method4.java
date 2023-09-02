package com.step4;

public class Method4 {
  int input[] = new int[3];
  public void init(String user){
    int temp = Integer.parseInt(user);
		input[0]=temp/100;//백의 자리구함
		input[1]=(temp%100)/10;//십의 자리구함
		input[2]=temp%10;//일의 자리구함    
  }
  public static void main(String[] args) {
    Method4 m = new Method4(); 
    String user = "356";
    m.init(user);
    for(int i:m.input){
      System.out.println(i);
    }
  }
}
