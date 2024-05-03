package ru.lab

interface FuelEfficient {
    fun fuelEfficiency()
}

open class Vehicle(val speed: Int, val color: String) {
    open fun displayInfo() {
        println("Транспортное средство - Скорость: $speed, Цвет: $color")
    }
}

open class Car(speed: Int, color: String, val numOfDoors: Int) : Vehicle(speed, color) {
    override fun displayInfo() {
        println("Машина - Скорость: $speed, Цвет: $color, Количество дверей: $numOfDoors")
    }
}

class Bike(speed: Int, color: String, val countOfWheels: Int) : Vehicle(speed, color) {
    override fun displayInfo() {
        println("Велосипед - Скорость: $speed, Цвет: $color, Количество колес: $countOfWheels")
    }
}

class ElectricCar(speed: Int, color: String, numOfDoors: Int, val batteryCapacity: Int) : Car(speed, color, numOfDoors), FuelEfficient {
    override fun displayInfo() {
        super.displayInfo()
        println("Электромобиль - Емкость батареи: $batteryCapacity kWh")
    }

    override fun fuelEfficiency() {
        println("Этот электромобиль энергоэфективен.")
    }
}

fun main() {
    val car = Car(200, "Черный", 4)
    val bike = Bike(20, "Красный", 2)
    val electricCar = ElectricCar(120, "Белый", 4, 75)

    car.displayInfo()
    bike.displayInfo()
    electricCar.displayInfo()
    electricCar.fuelEfficiency()
}

