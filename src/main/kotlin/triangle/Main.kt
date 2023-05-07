package triangle

fun readPoint(prompt: String): Point {
    while (true) {
        print(prompt)
        try {
            val x = readLine()!!.toDouble()
            print("Enter y-coordinate of point: ")
            val y = readLine()!!.toDouble()
            return Point(x, y)
        } catch (e: Exception) {
            println("Invalid input. Please enter valid coordinates.")
        }
    }
}

fun main() {
    try {
        val A = readPoint("Enter x-coordinate of vertex A: ")
        val B = readPoint("Enter x-coordinate of vertex B: ")
        val C = readPoint("Enter x-coordinate of vertex C: ")
        val triangle = Triangle(A, B, C)

        val point = readPoint("Enter x-coordinate of point: ")
        val isInside = triangle.contains(point)
        if (isInside) {
            println("Point (${point.x}, ${point.y}) is INSIDE the triangle.")
        } else {
            println("Point (${point.x}, ${point.y}) is OUTSIDE the triangle.")
        }
    }
    catch (ex: Exception) {
        println("Error: ${ex.stackTrace}")
    }
}