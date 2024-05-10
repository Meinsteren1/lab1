package ru.lab

// Базовый абстрактный класс Shape
abstract class Shape {
    // Абстрактный метод для вычисления площади фигуры
    abstract fun calculateArea(): Double
}

// Подкласс Circle, представляющий круг
class Circle(val radius: Double) : Shape() {
    // Переопределите метод calculateArea(), чтобы он возвращал площадь круга
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

// Подкласс Rectangle, представляющий прямоугольник
class Rectangle(val width: Double, val height: Double) : Shape() {
    // Переопределите метод calculateArea(), чтобы он возвращал площадь прямоугольника
    override fun calculateArea(): Double {
        return width * height
    }
}

fun main() {
    // Создайте экземпляр круга и прямоугольника
    val circle = Circle(6.0)
    val rectangle = Rectangle(3.0, 6.0)

    // Выведите площади фигур
    println("Площадь круга: ${circle.calculateArea()}")
    println("Площадь прямоугольника: ${rectangle.calculateArea()}")
}
