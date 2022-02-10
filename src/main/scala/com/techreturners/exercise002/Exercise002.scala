package com.techreturners.exercise002

class Exercise002 {

  def isFromManchester(person: Person): Boolean =
    try{
      person.Location == "Manchester"
    } catch {
      case e: Exception => false
    }

  def canWatchFilm(person: Person, ageLimit: Int): Boolean =
    try{
      person.Age > ageLimit
    } catch {
      case e: Exception => false
    }
}
