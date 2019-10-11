public class Person{



  public Person(String name, Date birth){
    this.name = name
    this.birth = birth;
  }
  
  protected String name = "Lucas";
  protected Date birth;
  
  protected void talk(){
    System.out.println("Hello everyoe");
  }
}
