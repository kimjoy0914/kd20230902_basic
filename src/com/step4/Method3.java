package com.step4;
public class Method3 {
  int strike = 0;
  int ball = 0;
  int com[] = null;
  int dap[] = null;
  public Method3(){
    com = new int[]{2,5,6};
    dap = new int[]{5,1,6};
  }
  public String account(){
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(com[i]==dap[j]){
          if(i==j) strike = strike + 1;
          else ball = ball + 1;
        }
      }
    }
    return strike+" strike, "+ ball+" ball";
  }
  public static void main(String[] args) {
    Method3 m = new Method3();
    System.out.println(m.account());
  }
}
