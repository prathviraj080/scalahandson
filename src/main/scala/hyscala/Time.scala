package hyscala

class Time(val hours:Int,val minutes:Int,val seconds:Int) {
  require(hours >= 0 && hours <=23, "hours are invalid "+hours)
  require(minutes >= 0 && minutes <=59, "minutes are invalid "+minutes)
  require(seconds >= 0 && seconds <=59, "seconds are invalid")
  val minutesOfDay:Int = hours*60+minutes

}