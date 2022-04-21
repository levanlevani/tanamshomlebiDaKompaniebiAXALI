import java.util.ArrayList;
import java.util.Arrays;

public class Family {

  //region ცვლადები
  private ArrayList<Person> people = new ArrayList<>();

  //endregion

  //region კონსტრუქტორი
  public Family(Person... people) {
    this.people = new ArrayList<>(Arrays.asList(people));


    //region underage-ების გარკვევა
    int underageMembersOfTheFamily = 0;
    for (int i = 0; i < people.length; i++) {
      var eachPerson = getPeople().get(i);
      if (eachPerson.getAge() < Government.getUnderAgeNumber()) {
        underageMembersOfTheFamily++;
      }
    }
    //endregion

    //region ხელფასების დანიშნვა
    double decreaseSalaryBy = 0;

    if (underageMembersOfTheFamily > Government.numberOfUnderAgeMembersOfFamily - 1) {
      // მრავალშვილიანი ოჯახია
      decreaseSalaryBy = Government.percentageForLargeFamily;
    } else {
      // არ არის მრავალშვილიანი ოჯახი
      decreaseSalaryBy = Government.standardPercentage;
    }

    for (int i = 0; i < people.length; i++) {
      var eachPerson = getPeople().get(i);
      var eachPersonOldSalary = eachPerson.getSalary();
      eachPerson.setSalaryByPercentage(decreaseSalaryBy);
      Government.setBudget(Government.getBudget() + eachPersonOldSalary - eachPerson.getSalary());
    }
    //endregion

  }

  //endregion

  //region getters
  public ArrayList<Person> getPeople() {
    return people;
  }
  //endregion

  //region მეთოდები
  public void addMembers(Person... people) {
    this.people.addAll(new ArrayList<>(Arrays.asList(people)));
  }
  //endregion
}
