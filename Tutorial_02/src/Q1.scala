

object Q1 {
  def main(args: Array[String]) = {
        //2   
        var i=2
        var j=2
        var K=2
        var m=5
        var n=5
        var f=12.0
        var g='X'
        //3
        println(K+12*m)
        println(m/j)
        println(n%j)
        println(m/j*j)
        println(f+10*5+g)
        println((i+1)*n)
        var a=2
        var b=3
        var c=4
        var d=5
        var k=4.3
        println( (b-1) * a + c *(d-1))
        println(a+1)
        println (-2 * ( g - k ) +c)
        println (c+1)
        println ((c+1)*(a+1));
        //4a
        def salary(wh:Int,oth:Int):Float={
          val temp=250*wh+85*oth
          return temp-temp*12*12/100
        }
        //4b
        def attendeees(tp:Int):Int={
          return 120 + (15-tp)/5*20
        }
        def revenue(tp:Int):Int={
          return attendeees(tp)*tp
        }
        def cost(tp:Int):Int={
          return 500+attendeees(tp)
        }
        def profit(tp:Int):Int={
          return revenue(tp)-cost(tp)
        }
        println(profit(5), profit(10), profit(15), profit(20))
    }
}