package com.techreturners.exercise003

class Exercise003 {

  def getIceCreamCode(iceCreamFlavour: String): Int = {
    //throw new UnsupportedOperationException("You can delete this line and add your code here.")
    try {
      iceCreamFlavours.indexOf(iceCreamFlavour)
    }catch {
      case e: Exception => -1
    }
  }

  def iceCreamFlavours: Array[String] = {
    throw new UnsupportedOperationException("You can delete this line and add your code here.")
  }

}
