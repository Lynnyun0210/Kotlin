data class Vector(val x: Int, val y: Int) {
    // 加法重载
    operator fun plus(other: Vector): Vector {
        return Vector(x + other.x, y + other.y)
    }

    // 减法重载
    operator fun minus(other: Vector): Vector {
        return Vector(x - other.x, y - other.y)
    }

    // 标量乘法
    operator fun times(scalar: Int): Vector {
        return Vector(x * scalar, y * scalar)
    }

    // 一元负号
    operator fun unaryMinus(): Vector {
        return Vector(-x, -y)
    }

    // 比较运算符
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vector) return false
        return x == other.x && y == other.y
    }
}

fun main() {
    val v1 = Vector(1, 2)
    val v2 = Vector(3, 4)

    println(v1 + v2)  // 输出: Vector(x=4, y=6)
    println(v2 - v1)  // 输出: Vector(x=2, y=2)
    println(v1 * 3)   // 输出: Vector(x=3, y=6)
    println(-v1)      // 输出: Vector(x=-1, y=-2)
    println(v1 == Vector(1, 2)) // true
}