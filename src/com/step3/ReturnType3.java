package com.step3;
class Book{
  int price;//도서 가격
}
public class ReturnType3 {
  Book myBook = null;
  public Book getInstance(){
    if(myBook == null){
      myBook = new Book();
    }
    return myBook;
  }
  public static void main(String[] args) {
    ReturnType3 r = new ReturnType3();
    Book myBook = r.getInstance();
    System.out.println(myBook);
    System.out.println(myBook.price);
  }
}
