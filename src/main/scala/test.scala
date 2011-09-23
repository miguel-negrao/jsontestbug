import net.liftweb.json.Serialization._
import net.liftweb.json._

object TestJSONBug4 {

  def main(args: Array[String]) {

    implicit val formats = DefaultFormats // Brings in default date formats etc.

    case class A(x:Int)
    //case class X(x:String,y:Option[java.util.Date])  //works
    //case class X(x:String,y:Option[String])          //works
    //case class X(x:String,y:Option[A])               //works
    //case class X(x:String,y:Option[Int])             //fails
    case class X(x:String,y:Option[Float])                 //fails
    val json = write(X("a",None))
    println( read[X](json) )

  }

}
