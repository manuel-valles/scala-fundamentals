val str = String.format("This is an old %s", "Test")
println(str)

val str2 = "This is a new %s".format("Test")
println(str2)

// Change the order with $
println("Beacause you're %3$s, %2$s, %1$s times a lady".format("Three", "Twice", "Once"))

// B: month; e: day; Y: year
import java.time._
println("We will be eating lunch on %1$tB the %1$te in the year %1$tY.".format(LocalDate.now))
printf("We will be eating lunch on %1$tB the %1$te in the year %1$tY.", LocalDate.now)