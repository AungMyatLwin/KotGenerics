

class Team<T>(val name: String, val players: MutableList<in  T>)where T:Player, T:Listener{
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

interface Listener{
    fun listen(){}
}

fun <T> addPlayer(player:T) where T:Player, T:Listener{}


fun main(args: Array<String>) {
    val gamesTeam=Team<FootballPlayer>(
        "Football Team",mutableListOf()
    )
}
open class Player(val name:String)
// here
class FootballPlayer(name:String):Player(name),Listener
class BaseballPlayer(name: String):Player(name)
open class GamesPlayer(name:String):Player(name)

class CounterStrikePlayer(name:String):GamesPlayer(name)