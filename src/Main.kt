// Writing a function that returns a value
// Shopping cart calculator

fun calculateTotalPrice(price: Double, taxRate: Double): Double {
    val totalPrice = price + (price * taxRate)
    return totalPrice
}

// Call the function calculateTotalPrice
fun main(){
    val result1 = calculateTotalPrice(500.0, 0.18)
    val result2 = calculateTotalPrice(1200.0, 0.12)
    val result3 = calculateTotalPrice(750.0, 0.05)

    println("=== SHOPPING RECEIPT ===")
    println("Item 1: ₹500.0 with 18% tax = ₹$result1")
    println("Item 2: ₹1200.0 with 12% tax = ₹$result2")
    println("Item 3: ₹750.0 with 5% tax = ₹$result3")
}