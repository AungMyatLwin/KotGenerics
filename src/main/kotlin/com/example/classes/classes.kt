package com.example.classes


private fun getDataFunction(){
    println("Getting data privately")
}
public fun getData(){
    println("Calling private fun in getData function")
    getDataFunction()

    println("Getting data")
}
internal class InternalInfo(){

}
private class PrivateInfo(){
    protected class ProtectedClass(){}
}