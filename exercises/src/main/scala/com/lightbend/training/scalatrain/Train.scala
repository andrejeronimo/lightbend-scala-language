package com.lightbend.training.scalatrain

case class Station(name: String)

case class Train(kind: String, number: Int, schedule: Seq[Station]) {

  require(schedule.size >= 2, "Schedule must contains at least 2 elements")

}
