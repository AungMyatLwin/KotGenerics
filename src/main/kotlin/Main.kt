

class Team<T:Player>(val name: String, val players: MutableList<T>){
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
    val footballTeam=Team<Player>(
        name = "Football Team",
        mutableListOf<FootballPlayer>(FootballPlayer("Player 1"),FootballPlayer("Player 2"))
    )
}




fun collectionGeneric(){
    val numbers:Array<Int> = arrayOf<Int>(1,2,3,4,5,6)
}

open class Player(val name:String)
class FootballPlayer(name:String):Player(name)
class BaseballPlayer(name: String):Player(name)
open class GamesPlayer(name:String):Player(name)

class CounterStrikePlayer(name:String):GamesPlayer(name)