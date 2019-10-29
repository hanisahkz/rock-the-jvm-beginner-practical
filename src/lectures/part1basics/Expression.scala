package lectures.part1basics

object Expression extends App {

  // Takeaway 1: Expression
  // on the RHS is the expression.
  val b = 1 * 5

  //Takeaway 2: changing value of variable is side effect

  //Takeaway 3: the use of +=, -=, *= etc introduce side effects (changes) to variables
  var anInteger = 123
  anInteger += 2 // add '2' to the variable
  anInteger *= 2 // multiply by 2 the latest value of anInteger variable
  println(anInteger)

  // Takeaway 4: Instruction v Expression
  // Instructions: what you tell the program to DO. This way, you get a result by telling the program to "do something"
  // Expression: program gives VALUE / TYPE, "evaluate something"
    // In Scala, IF is an expression
  val aCondition = true
//  val aConditionValue = if (aConditionValue) 5 else 3 //this is called "IF Expression"

  // Takeaway 5: Everything in Scala is Expression except for defining val, var, creating a class, object

  // Takeaway 6: Loops are highly discouraged in Scala
    // Using while loop is discouraged. The following is NO-NO way of writing loop:
  var anInt = 1
  while (anInt < 10) {
    println(anInt)
    anInt += 1
  }

  //Takeaway: Side effect in Scala is Unit which returns nothing => ()
  //Side effect in Scala is EXPRESSION returning Unit (#=> ())
  //Side effects can be triggered by imperative programming such as:
    // i) println(), ii) while statement, iii) variable reassignment
    // all of these return Unit (void)
    // all of these introduce side effect in the form of doing something i.e. printing out the value

  //Takeaway: Code block
    // code block is an expression
    // type of code block is determined by the "last line" that needs to be evaluated
  val anIntegerFromCodeBlock = {
      val x = 4
      val y = x + 5
      if (y > 5) "more than 5" else "less than 5"
    }
}
