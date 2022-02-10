package com.techreturners.exercise001

class Exercise001 {

  // Scala methods defined in various styles
  // Notice how the IDE identifies the return type even if
  // we don't specify it in the code
  // https://docs.scala-lang.org/tour/basics.html

  def capitalizeWord(word: String): String = word.charAt(0).toUpper + word.substring(1)

  def generateInitials(firstName: String, lastName: String) = firstName.charAt(0).toUpper + "." + lastName.charAt(0).toUpper

  def addVat(initialPrice: Double, interestRate: Double) : Double = "%.2f".format(initialPrice * (100 + interestRate) / 100).toDouble

  def reverse(sentence: String) : String = sentence.reverse

  /**
   * Here we show using a Scala sequence which is a type of collection
   * https://alvinalexander.com/scala/seq-class-methods-examples-syntax/
   *
   * @param users A collection of users
   * @return
   */
  def countLinuxUsers(users: Seq[User]): Int = {
    // Add your code here
    try {
      users.count(element => (element.osType == "Linux"))
    } catch {
      case e: Exception => 0
    }
  }
}
