def someMethod() {
    def list = [1, 2, 3]
    list.each { it ->
        if (it == 2) {
            return //This will exit the loop in java 
            //continue //This will skip the current element in the list and continue with the next element
        }
        println it
    }
    println "End of method"
}
someMethod()

//Alternative solution using an explicit loop
def someMethod2() {
    def list = [1, 2, 3]
    for (item in list) {
        if (item == 2) {
            continue
        }
        println item
    }
    println "End of method"
}
someMethod2()