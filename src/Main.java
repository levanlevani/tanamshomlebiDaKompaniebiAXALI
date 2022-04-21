public class Main {

  public static void main(String[] args) {

    //region კომპანიების დამატება

    Company ვიბარებთ_ბინებს = new Company("ვიბარებთ ბინებს", "ცაგარელი და სტრინგების 32", 10);
    Company ოქროს_ვიყიდით_ოქროს = new Company("ოქროს ვიყიდით, ოქროს", "გიორგი ბაბუაშვილის ჩიხი 23", 20);
    Company მაგთი = new Company("მაგთი", "ჯეოსელის ქუჩა 11", 10);
    Company ფასკუნჯი_და_ოცი_ცოცხი = new Company("ფასკუნჯი და ოცი ცოცხი", "თავის საქმეში ვაქო კახიძის 100", 20);
    Company შპს_ყვიბისი_ბანკი = new Company("შპს ყვიბისი ბანკი", "თიბისი ბანკის გამზირის 202", 22222);

    //endregion

    //region ადამიანების დამატება

    Person კაბუ = new Person("კაბუ", "ლექსსენიაშვილი", 50, ფასკუნჯი_და_ოცი_ცოცხი, 100);
    Person ბაბუ = new Person("ბაბუ", "პირსაყვირაშვილი", 17, მაგთი, 100);
    Person ნანუ = new Person("ნანუ", "კაჟორჟოლიანი", 90, ოქროს_ვიყიდით_ოქროს, 100);
    Person დადუ = new Person("დადუ", "ლამარიშვილი", 16, ვიბარებთ_ბინებს, 100);
    Person ბათუ = new Person("ბათუ", "ღობეგლეჯიაშვილი", 13, ფასკუნჯი_და_ოცი_ცოცხი, 100);

    Person ნინო = new Person("ნინო", "ლექსსენიაშვილი", 17, ვიბარებთ_ბინებს, 100);
    Person ნინა = new Person("ნინა", "ცქრიალაშვილი", 22, ვიბარებთ_ბინებს, 100);
    Person ნანა = new Person("ნანა", "ბუთხუზიშვილი", 10, მაგთი, 100);
    Person ნენე = new Person("ნენე", "ნენეშვილი", 20, ოქროს_ვიყიდით_ოქროს, 100);
    Person ნინე = new Person("ნინე", "ნინოსშვილი", 22, მაგთი, 100);

    Person გოგი = new Person("გოგი", "ლექსსენიაშვილი", 17, ოქროს_ვიყიდით_ოქროს, 100);
    Person გაგა = new Person("გაგა", "სეხნიაშვილი", 13, მაგთი, 100);
    Person გოგა = new Person("გოგა", "რამიშვილი", 23, ოქროს_ვიყიდით_ოქროს, 100);
    Person გუგუ = new Person("გუგუ", "გუგავა", 20, ოქროს_ვიყიდით_ოქროს, 100);
    Person გეგა = new Person("გეგა", "გოგავა", 13, ოქროს_ვიყიდით_ოქროს, 100);

    Person ჯეყვე = new Person("ჯეყვე","გაიჯეჯილაშვილი",24, ფასკუნჯი_და_ოცი_ცოცხი,100);

    //endregion

    //region ოჯახების დამატება

    Family kabuFamily = new Family(კაბუ, ბაბუ, ნანუ, დადუ, ბათუ);
    Family ninoFamily = new Family(ნინო, ნინა, ნანა, ნენე, ნინე);
    Family gogiFamily = new Family(გოგი, გაგა, გოგა, გუგუ, გეგა);

    //endregion


    //region რაღაცების დასატესტად
    System.out.println("კაბუს საბოლოო ხელფასი: " + კაბუ.getSalary() + "; ბაბუს საბოლოო ხელფასი: " + ბაბუ.getSalary());
    System.out.println("ნინოს საბოლოო ხელფასი: " + ნინო.getSalary() + "; ნინას საბოლოო ხელფასი: " + ნინა.getSalary());
    System.out.println("გოგის საბოლოო ხელფასი: " + გოგი.getSalary() + "; გაგას საბოლოო ხელფასი: " + გაგა.getSalary());
    System.out.println("მთავრობის საბოლოო ბიუჯეტი: " + Government.getBudget());
    System.out.println();
    System.out.println("მითითებული კომპანიის თანამშრომელთა საშუალო ხელფასი: "+ Company.companyEmployeesSum(ვიბარებთ_ბინებს));
    System.out.println("ყველა თანამშრომლის საშუალო ხელფასი: " + Person.employeesAverageSalary()); //TODO
    System.out.println("არაცარიელი კომპანიების მინიმალური ხელფასების საშუალო " + Person.companyAverageMinimumSalary()); //TODO
    //endregion

  }


}





