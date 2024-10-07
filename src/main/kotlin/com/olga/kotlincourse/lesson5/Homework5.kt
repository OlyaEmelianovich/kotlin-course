package com.olga.com.olga.kotlincourse.lesson5

Оператор элвиса


 First task

fun main () {
 printSoundIntensity(12.0, 0.5)
 printSoundIntensity(16.0, null)
 fullPrice(50)
 fullPrice ("null")
 getAtmosphericPressure(12 )
 getAtmosphericPressure ('null')
}


fun printSoundIntensity(initialIntensity: Double, defaultСoefficient: Double?) {
 val intensity = defaultСoefficient?: 0.5
 println (initialIntensity * intensity)
}


Second task
Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
Задача: Рассчитать полную стоимость доставки.

fun fullPrice (insurance: Int, standartPrice: Int?) {
 val price = standartPrice?: 50
 println (insurance * price)
}


third task

Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять. Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

val atmosphericPressure: Int = 12
var pressure: String? = getAtmosphericPressure()
val record = pressure ?: throw IllegalArgumentException "Нет данных"

        fun getAtmosphericPressure() : String? {
         return null
        }

