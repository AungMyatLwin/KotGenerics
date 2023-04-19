fun main(args: Array<String>) {
    var footballPlayer = FootballPlayer("Footballplayer 1")
    var footballPlayer2 = FootballPlayer("Footballplayer 12")
    var footballPlayer3 = FootballPlayer("Footballplayer 14")
    var baseballPlayer = BaseballPlayer("baseballplayer 1")
    var baseballPlayer2 = BaseballPlayer("BaseballPlayer 2")

    var footballteam=Team<FootballPlayer>("FootballTeam", mutableListOf(footballPlayer, footballPlayer2))
    footballteam.addPlayer(footballPlayer3)
    var baseballteam = Team<BaseballPlayer>("BaseballTeam", mutableListOf(baseballPlayer))
    baseballteam.addPlayer(baseballPlayer2)

    val games=Team<GamesPlayer>("BloodBorne", mutableListOf())

}




fun collectionGeneric(){
    val numbers:Array<Int> = arrayOf<Int>(1,2,3,4,5,6)
}

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

open class Player(val name:String)
class FootballPlayer(name:String):Player(name)
class BaseballPlayer(name: String):Player(name)
class GamesPlayer(name:String):Player(name)

