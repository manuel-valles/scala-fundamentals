val a = 99
println(s"${a+3} luftballons floating in the summer sky.")

val ticketCost = 50
val bandName = "Psycgedelic Furs"
println(f"The $bandName%s tickets are probably $$$ticketCost%1.2f")

val precentIncrease = 20
val musicGenre = "New Wave"
println(f"The $bandName%s tickets are probably $$$ticketCost%1.2f%nThat's a $precentIncrease%% bump because everyone like $musicGenre")

println(f"""The $bandName%s tickets are probably $$$ticketCost%1.2f
            |That's a $precentIncrease%% bump because everyone like $musicGenre""".stripMargin)