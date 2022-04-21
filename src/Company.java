public class Company {

  //region ცვლადები
  private String name;
  private String address;
  private double minimumSalary;
  //endregion

  //region კონსტრუქტორი
  public Company(String name, String address, double minimumSalary) {
    this.name = name;
    this.address = address;
    this.minimumSalary = minimumSalary;
  }
  //endregion

  //region getters
  public String getName() {
    return name;
  }

  public double getMinimumSalary() {
    return minimumSalary;
  }
  //endregion

  //region მეთოდები
  public static double companyEmployeesSum(Company company) {
    double sum = 0;
    int counter = 0;
    for (Person t : Person.getPeople()) {
      if (t.getCompany().getName().equals(company.getName())) {
        sum += t.getSalary();
        counter++;
      }
    }
    if (counter == 0) {
      return 0.0;
    } else {
      return sum / counter;
    }
  }

  //endregion
}
