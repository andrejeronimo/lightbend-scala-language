package com.lightbend.training.scalatrain

import scala.math.Integral.Implicits._

case class Time(hours: Int = 0, minutes: Int = 0) {

  require(hours >=0 && hours <= 23)       // Verify that hours is within 0 and 23
  require(minutes >= 0 && minutes <= 59)  // Verify that minutes is within 0 and 59

  val asMinutes: Int = hours * 60 + minutes

  def minus(that: Time): Int = {
    asMinutes - that.asMinutes
  }

  def -(that: Time): Int = {
    minus(that)
  }
}

object Time {

  def fromMinutes(totalMinutes: Int): Time = {
    val (hours, minutes) = totalMinutes /% 60
    Time(hours, minutes)
  }
}