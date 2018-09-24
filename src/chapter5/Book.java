class Book {
  protected void finalize() {
    System.out.println("finalize"); 
  }
  public static void main(String[] args){
    Book b  = new Book(); 
    b = null ; 
    System.gc();
  }
}

