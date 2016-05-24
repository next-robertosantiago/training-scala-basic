package comprehensions

object Comprehensions {

  case class Company(val name :String, val region :String, val avgSalary :Int)
  case class Employee(val name :String, val companyName :String, val age :Int)

  def main(args: Array[String]): Unit = {
    val companies = List(
      Company("SAL", "HE", 20000),
      Company("GOK", "DA", 25000),
      Company("MIK", "DA", 30000)
    )

    val employees = List(
      Employee("Joana", "GOK", 20),
      Employee("Mikey", "MIK", 31),
      Employee("Susan", "MIK", 27),
      Employee("Frank", "GOK", 28),
      Employee("Ellen", "SAL", 29)
    )

    val result =
      for(e <- employees;
          if e.age > 25;
          salary = e.age * 1000;

          c <- companies;
          if c.region == "DA";
          if c.name == e.companyName;
          if c.avgSalary < salary
      ) yield (e.name, c.name, salary - c.avgSalary)

    println(result)
  }

}
