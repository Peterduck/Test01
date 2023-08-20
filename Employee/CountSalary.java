package Employee;

public class CountSalary {
  public  static void June(Employee e1){
    System.out.println("Lương tháng 6: "+(6*5* e1.salary)+"vnd");
  }
  public  static void July(Employee e1){
    System.out.println("Lương tháng 7: "+(6*5* e1.salary)+"vnd");
  }
  public  static void August(Employee e1){
    System.out.println("Lương tháng 8: "+(6*5* e1.salary)+"vnd");
  }
  public static void main(String[] args){
    Employee e1 = new Employee("Do Thanh Phat",500000);
    Employee e2 = new Employee("Teo",300000);
    June(e1);
    June(e2);
    July(e1);
    July(e2);
    August(e1);
    August(e2);
  }

}
