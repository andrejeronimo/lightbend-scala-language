package com.lightbend.training.scalatrain

import scala.math.Integral.Implicits._

class Time(val hours: Int = 0, val minutes: Int = 0) {
  // TODO: Verify that hours is within 0 and 23
  // TODO: Verify that minutes is within 0 and 59

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
    new Time(hours, minutes)
  }
}