
// "in" operator
// use it with any Seq like: 
// 3 in (Array(1,3,5)) 
implicit def toIn[A](a: A) = new { def in(s: Seq[_>:A]) = s contains a }
