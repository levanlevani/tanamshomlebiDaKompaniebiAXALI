import java.util.ArrayList;
import java.util.Date;

public class Government {

  //region ცვლადები

  private static double budget = 1000;
  final private static int underAgeNumber = 18;
  final public static int numberOfUnderAgeMembersOfFamily = 3;
  final public static int standardPercentage = 20;
  final public static int percentageForLargeFamily = 10;

  private static ArrayList<String> logs = new ArrayList<>();
  //endregion

  //region getters
  public static double getBudget() {
    return Government.budget;
  }
  //endregion

  //region setters
  public static void setBudget(double budget) {
    Government.budget = budget;
  }

  public static double getUnderAgeNumber() {
    logs.add(new Date() + " სახელმწიფოსგან მოითხოვეს ინფორმაცია სრულწლოვნების შესახებ");
    return underAgeNumber;
  }


  //endregion
}
