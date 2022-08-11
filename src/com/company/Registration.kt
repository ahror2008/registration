package com.company

import java.util.*

fun main(args: Array<String>) {

    var registration: RegistrationArray
    var scanner = Scanner(System.`in`)
    val foydalanuvchi = arrayOfNulls<RegistrationArray>(100)
    var count: Int = 0
    print("L")
    Thread.sleep(500)
    print("o")
    Thread.sleep(500)
    print("a")
    Thread.sleep(500)
    print("d")
    Thread.sleep(500)
    print("i")
    Thread.sleep(500)
    print("n")
    Thread.sleep(500)
    print("g")
    Thread.sleep(500)
    println()
    while (true) {
        println("Ro'yxatdan o'tish -> 1")
        println("Tizimga kirish -> 2")
        println("Foydalanuvchilar -> 3")
        print("= ")
        val n = scanner.nextInt();

        when (n) {
            1 -> {


                print("Ismni kiriting:  ")
                val ism: String = scanner.next()
                scanner = Scanner(System.`in`)
                print("Tel raqam: +998 ")
                val telraqam: Int = scanner.nextInt()
                print("Parol: ")
                val parol = scanner.nextInt()
                print("Parolni qayta kiriting: ")
                val parol1 = scanner.nextInt()

                registration = RegistrationArray(ism, telraqam, parol, parol1)
                foydalanuvchi[count] = registration
                count++
                println()
                if (parol == parol1) {
                    println("Tabriklayman!!!!!")
                    println("Ro'yxatdan o'tdingiz")
                    println()
                    println()
                } else {
                    println("Kod xato")
                    println("Boshqatdan ro'yxatdan o'ting")
                    println()
                }
            }

            2 -> {
                println("Ismni kiriting")
                var ism = scanner.next()
                println("Parolni kiriting")
                val parol = scanner.nextInt()


                try {
                    for (e in foydalanuvchi) {

                        if (parol == e!!.password) {
                            println("Tabriklaymiz")
                            println("Tizimga kirdingiz")
                        } else {
                            println("Kod xato")
                        }
                    }
                } catch (e: Exception) {
                    println()
                }


            }
            3 -> {
                println("Foydalanuvchilar ro'yxati")
                try {
                    for (list in 0..count) {
                        println(foydalanuvchi[list]!!.show())
                    }


                } catch (exception: Exception) {
                    println()
                }
            }

        }


    }
}

