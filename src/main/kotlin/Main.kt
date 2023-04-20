

//class Team<T:Player>(val name: String, val players: MutableList<T>){

// convariances
//class Team<T:Player>(val name: String, val players: MutableList<out T>){


// contravariance
class Team<T:Player>(val name: String, val players: MutableList<in  T>){
    fun addPlayer(player: T){
        if(players.contains(player)){
//            println("Player: ${(player as Player).name} is already in the team ${this.name}")
            println("Player: ${player.name} is already in the team ${this.name}")
        }
        else{
            players.add(player)
//            println("Player: ${(player as Player).name} was added in the team ${this.name}")
            println("Player: ${player.name} was added in the team ${this.name}")
        }
    }
}

fun main(args: Array<String>) {
    val mixedList= mutableListOf(1,2,360,'a','b','c',"Hello","World")
    val spec=getSpecificTypes<Int>(mixedList)
    for(element in spec){
        println(element)
    }
}

inline fun <reified T> getSpecificTypes(list: List<Any>):List<T>{
    val specificList= mutableListOf<T>()
    for(element in list){
        if(element is T){
            specificList.add(element)
        }
    }
    return  specificList
}


fun collectionGeneric(){
    val numbers:Array<Int> = arrayOf<Int>(1,2,3,4,5,6)
}

open class Player(val name:String)
class FootballPlayer(name:String):Player(name)
class BaseballPlayer(name: String):Player(name)
open class GamesPlayer(name:String):Player(name)

class CounterStrikePlayer(name:String):GamesPlayer(name)