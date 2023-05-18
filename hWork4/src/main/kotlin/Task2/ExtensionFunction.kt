package Task2

fun List<Person>.sortByAgeDescending(): List<Person>{
    return sortedByDescending { it.age }
}


fun List<Person>.sortByAlphabet(): List<Person>{
    return this.sortedWith(compareBy<Person>{it.name}.thenBy {it.surname})
}

