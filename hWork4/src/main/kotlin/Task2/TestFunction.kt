package Task2




fun main(){
    val test = {
    val persons = listOf(
        Person("Alexey", "Kozyrev", 26),
        Person("Alexey", "Lunin", 33),
        Person("Boris", "Krivov", 45)
    )
    val persons2 = persons.sortByAgeDescending()
    printListPerson(persons2)
    println("--------------------")
    val person3 = persons.sortByAlphabet()
    printListPerson(person3) }

    getTimeWorkFunction(test)
}


fun getTimeWorkFunction(action: () -> Unit){
    val timeBegin = System.currentTimeMillis()
    action.invoke()
    println(System.currentTimeMillis() - timeBegin)
}

fun printListPerson(list: List<Person>){
    for (person in list){
        println(person.toString())
    }
}