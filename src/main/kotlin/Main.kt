
import com.example.classes.*


fun main() {
    getData()
    val internalInfo= InternalInfo()
}

open class User(){
    public  var public :String = ""
    private var privated:String = ""
    protected var protected:String = ""
    internal var internal:String = ""

}

class ProtectedVar:User(){
    fun test(){
        println(protected)
//        println(privated) error
        println(internal)
        println(public)
    }
}