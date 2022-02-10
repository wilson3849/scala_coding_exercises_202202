package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime, Month}

class Exercise004(dateTime: LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  def getDateTimeWithGigaSecond: LocalDateTime = dateTime

  def this(date: LocalDate)
  {
    this(LocalDateTime.of(date.getYear, date.getMonth, date.getDayOfMonth, 0, 0, 0, 0))
  }

  def this(year:Int, month:Month, dayOfMonth:Int, hour:Int = 0, minute:Int = 0, second:Int = 0, nanoOfSecond:Int = 0)
  {
    this(LocalDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond))
  }
}
