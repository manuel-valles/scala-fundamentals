val lyrics = """I see trees of green
                |Red roses too
                |I see then bloom
                |For me and you
                |And I think to myself
                |What a wonderful world""".stripMargin

val lyrics2 = """I see trees of green
                @Red roses too
                @I see then bloom
                @For me and you
                @And I think to myself
                @What a wonderful world""".stripMargin('@')

println(lyrics)

val message = "We are meeting on June 13th of this year, and having lunch at 12:30PM or 1:00PM"
val regex = "(\\s|[0-9])?[0-9]:[0-5][0-9]\\s*(AM|PM)".r
val regex2 = """(\s|[0-9])?[0-9]:[0-5][0-9]\s*(AM|PM)""".r

println(regex2.findAllIn(message).toList)