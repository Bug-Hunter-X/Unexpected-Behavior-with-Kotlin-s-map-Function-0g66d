fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) //Prints: [2, 4, 6, 8, 10]
    println(list) // Prints: [1, 2, 3, 4, 5] - original list remains unchanged
    //To modify the original list use toMutableList() and then map 
    val mutableList = list.toMutableList()
    mutableList.map{it*2}
    println(mutableList)//Prints: [1, 2, 3, 4, 5] - original list remains unchanged 
    val mutableList2 = list.toMutableList()
    mutableList2.replaceAll { it * 2 }
    println(mutableList2)//Prints: [2, 4, 6, 8, 10] - original list is changed
}