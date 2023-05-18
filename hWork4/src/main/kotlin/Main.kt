fun main(args: Array<String>) {
    var i = 0
    var list = Array(100){i++}.toList()
    list = list.filterIndexed{index, _ -> index%2 == 0 }
    list = list.slice(10..20)
    list = plusOneToElement(list)
    for (i in list){
        println(i)
    }
    val sumElement = list.sum()
    println(sumElement)

}

fun plusOneToElement(list: List<Int>):List<Int>{
    val newMutableList = list.toMutableList()
    for(i in 0 until newMutableList.size){
        newMutableList[i] += 1
    }
    return newMutableList.toList()
}
