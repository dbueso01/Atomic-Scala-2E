// Exercise03.sc
import com.atomicscala.AtomicTest._

def explicitSet(v: Vector[Double]): Set[Double] = {
  v.toSet
}

explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
