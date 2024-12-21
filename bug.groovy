def someMethod() {
    def list = [1, 2, 3]
    list.each { it ->
        if (it == 2) {
            return // This will exit the method, not just the loop
        }
        println it
    }
    println "End of method"
}
someMethod()