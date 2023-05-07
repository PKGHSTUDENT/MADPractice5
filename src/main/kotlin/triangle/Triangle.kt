package triangle

import kotlin.math.abs

class Triangle(val A: Point, val B: Point, val C: Point) {
    private val a = distance(B, C)
    private val b = distance(A, C)
    private val c = distance(A, B)

    private fun distance(p1: Point, p2: Point): Double {
        val dx = p1.x - p2.x
        val dy = p1.y - p2.y
        return kotlin.math.sqrt(dx * dx + dy * dy)
    }

    fun contains(point: Point): Boolean {
        val area = abs((A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2)
        val s1 = abs((point.x * (A.y - B.y) + A.x * (B.y - point.y) + B.x * (point.y - A.y)) / 2)
        val s2 = abs((point.x * (B.y - C.y) + B.x * (C.y - point.y) + C.x * (point.y - B.y)) / 2)
        val s3 = abs((point.x * (C.y - A.y) + C.x * (A.y - point.y) + A.x * (point.y - C.y)) / 2)
        return area == s1 + s2 + s3
    }
}