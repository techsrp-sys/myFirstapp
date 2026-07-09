// 1. We DEFINE the function (The Machine)
fun greetUser(userName: String) {
    println("Hello, " + userName + "!")
}

// 2. The program STARTS here (Turning the machine on)
fun main() {
    // We CALL the function and pass an argument
    greetUser("Rajesh")
    greetUser("Alice")
}