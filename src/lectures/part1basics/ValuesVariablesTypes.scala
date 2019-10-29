package lectures.part1basics

object ValuesVariablesTypes extends App {

  //Takeaway 1: syntax
  // (val) + (variableName:) + (variableType =) + (valueAssignment)
  val someNumber: Int = 999

  //Takeaway 2: val is immutable
  //someNumber = 111

  //Takeaway 3: compiler knows (can infer) the type of the variable
  // so, it's necessary to declare type
  val anotherNumber = 100

  //Takeaway 4: Basic types in Scala

  //Takeaway 5: Variables in Scala
  //i) var is not immutable. Can be re-assigned
  var someName = "Sally"
  someName = "Jenny"

  //Takeaway 6: FP is more on val

  //https://www.udemy.com/course/rock-the-jvm-scala-for-beginners/learn/lecture/7660552#questions
}
