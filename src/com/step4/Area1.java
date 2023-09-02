package com.step4;
public class Area1 {
  int area(int width, int height){
    int result = 0;
    result = width * height;
    return result;
  }
  double area(int width, int height, double d){
    double result = 0;
    result = (width * height)/d;
    return result;
  }
  double area(int r, double pi){
    double result = 0;
    result = r*r*pi;
    return result;
  }
  public static void main(String[] args) {
    Area1 a = new Area1();
    System.out.println("사각형 면적 구하기 : "+a.area(5, 4));
    System.out.println("삼각형 면적 구하기 : "+a.area(5, 4, 0.5));
    System.out.println("원 면적 구하기 : "+a.area(5, 3.14));
  }
}
