import org.scalatest.prop.Configuration.MaxDiscarded

def sum(xs: List[Int]): Int = {
  if (xs.isEmpty) 0
  else xs.head + sum(xs.tail)
}





def max(xs: List[Int]): Int = {

  def abs(x: Int) = if (x < 0) -x else x

  def maxAccum2(xs: List[Int], theMax: Int): Int = {
    if (xs.isEmpty) {
      return theMax
    } else {
      val newMax = if (abs(xs.head) < theMax) xs.head else theMax
      maxAccum2(xs.tail, newMax)
    }
  }
  maxAccum2(xs, xs.head)

}

def test = List(1,4,5)
//def test = List(1,45,3)
sum(test)
max(test)
test.max
test.head

