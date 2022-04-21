import java.util.ArrayList;

public class Person {

  //region  ცვლადები
  private static ArrayList<Person> people = new ArrayList<>();
  private static double companySalarySum;
  private static int counter;
  private static double salarySum;

  private String name;
  private String surname;
  private int age;
  private Company company;
  private double salary;
  //endregion

  //region კონსტრუქტორები
  public Person(String name, String surname, int age, Company company, double salary) {
    if (salary < 0 || age < 0) {
      throw new IllegalArgumentException("უარყოფითი არ შეიძლება");
    }

    if (name.isBlank() || surname.isBlank()) {
      throw new IllegalArgumentException("ცარიელი სახელი არ შეიძლება");
    }

    if (company == null) {
      throw new IllegalArgumentException("ცარიელი კომპანია არ შეიძლება");
    }

    this.company = company;

    if (salary < this.company.getMinimumSalary()) {
      throw new IllegalArgumentException("მეტი ხელფასი დაუნიშნე, ძმაო, აი, ამ კაცს: " + name + " " + surname + "! მინიმუმ სტავკაა " +
          this.company.getMinimumSalary() + " ლარი, შენ კიდე მარტო " +
          salary + " დაუნიშნე, სირცხვილი შენს კაცობას!");
    }

    this.name = name;
    this.surname = surname;
    this.age = age;
    this.salary = salary;

    counter++;
    salarySum += salary;
    companySalarySum += company.getMinimumSalary();
    people.add(this);
  }

  //endregion

  //region setters

  public void setSalaryByPercentage(double percentage) {
    this.salary *= (100-percentage)/100;
  }

  //endregion

  //region getters

  public Company getCompany() {
    return company;
  }

  public int getAge() {
    return age;
  }
  public double getSalary() {
    return salary;
  }

  public String getName() {
    return name;
  }

  public static ArrayList<Person> getPeople() {
    return people;
  }

  //endregion


  //region მეთოდები
  public static double emplyeesAverageSalary() {
    return salarySum / counter;
  }

  public static double companysAverageMinimumSalary() {
    return (double) companySalarySum / counter;
  }


  //endregion

}
