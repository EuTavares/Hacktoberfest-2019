public class Person{



  public Person(String name, Date birth){
    this.name = name
    this.birth = birth;
  }
  
  private String name;
  private Date birth;
  
  public void talk(){
    System.out.println("Hello everyoe");
  }
}
