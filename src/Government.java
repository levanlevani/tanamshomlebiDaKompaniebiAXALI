public class Government {

  //region ცვლადები

  private static double budget = 1000;
  final public static int underAgeNumber = 18;
  final public static int numberOfUnderAgeMembersOfFamily = 3;
  final public static int standardPercentage = 20;
  final public static int percentageForLargeFamily = 10;

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


  //endregion
}
