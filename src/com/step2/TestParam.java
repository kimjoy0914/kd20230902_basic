package com.step2;

class Param{
  int ival;
}//end of Param

public class TestParam {
  
  void effectParam(Param p){
    p.ival = 100;
    System.out.println("sub ival ===> " + p.ival);
  }//end of effectParam

  public static void main(String[] args) {
    TestParam tp = new TestParam();
    Param p = new Param();
    p.ival = 500;
    tp.effectParam(p);
    System.out.println("main ival ===> "+p.ival);
  }//end of main
}//end of TestParam
