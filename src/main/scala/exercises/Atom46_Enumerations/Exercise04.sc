// Exercise04.sc
import com.atomicscala.AtomicTest._

def season(name: MonthName): String = name match {
  case December | January | February => "Winter"
  case March | April | May => "Spring"
  case June | July | August => "Summer"
  case September | October | November => "Autumn"
}

import MonthName._

object MonthName extends Enumeration {
  type MonthName = Value
  val January, February, March, April, May, June, July, August, September, October, November,
  December = Value
}

season(January) is "Winter"
season(April) is "Spring"
season(August) is "Summer"
season(November) is "Autumn"
