package Początki

import org.jetbrains.annotations.Nullable
import java.util.Scanner


fun main () {
//    println("Witaj świecie Kotlin")
//    println("Witaj świecie Kotlin")

//    val scanner = Scanner(System.`in`)
//    val napis = scanner.nextLine()
//    println(napis)
//   var zmiennaInt:Int = 111
//    var zmiennaDouble = 123.123
//    var zmiennaFloat = 123.44f
//    var zmiennaLong : Long = zmiennaInt.toLong() //metoda
//
//    println(zmiennaLong)

    // Null pointer exception - błąd null! scrashowanie! wyrzucenie wyjątku!
    // var - zmienne mutowalne;
    // val - zmienne niemutowalne //final w java;
    ////////////////////////////////////////
//    var zmiennaNulowa : Int? = null
//    zmiennaNulowa = 5

//    zmiennaNulowa = null
//    zmiennaNulowa?.minus(other = 7) //WYWOŁYWANIE METODY wyrzuci "null" a nie scrashuje sie, nie wyrzuci wyjątku!

    // zmiennaNulowa!!.minus(other= 3) // Wymuszenie przez !! wyrzuci wyjątek!
//    var liczba1 : Float? = 3.23f
//    var liczba2 : Float? = 5.44f
//    var x : Float? = null
//    x = liczba1
//    liczba1=liczba2
//    liczba2 = x
//    println(liczba1)
//    println(liczba2)
//    println(liczba1?.toInt())
//    println(liczba2?.toInt())

//Nowy operator relacyjny:
//    var a : Int = 4
//    var b : Int = 8
//    var c : Int = 5
//
//    println(c in a..b)
//    println(c !in a..b)


//    1. Zamień poniższe wyrażenie !(x && y) || z na odpowiednik w kotlinie używając "and", "or".

//    val x = false
//    val y = true
//    val z = false
//    val wynik = !(x && y) || z
//    println(wynik)
//    val wynik1 = !(x and y) or z
//    println(wynik1)

//    . Na podstawie dotychczasowej wiedzy, zapisz krótszym sposobem wyrażenie wiek >= 18 AND wiek <= 70
//    var wiek: Int=33
//    println(wiek in 18..70 )


//
//    3. Wyobraź sobie, że zamierzasz kupić samochód. Chcesz napisać program, który wspomoże Ciebie w tej decyzji.
    //    Poniżej założenia:
//
//    musisz mieć wystarczającą ilość pieniędzy
//
//    wystarczy, że będzie koloru czerwonego albo nie będzie to Volkswagen
//
//    Napisz odpowiednie wyrażenie. Uzupełnił poniższe zmienne odpowiednimi wartościami, aby wyrażenie było prawdziwe:
//
//    val mamPieniadze = true
//    val czyCzerwony = true
//    val czyVolkswagen = true
////    // napisz wyrażenie ...
//
//    println(mamPieniadze && (czyCzerwony || !czyVolkswagen) )

//var tablica : IntArray = IntArray(3)
//    tablica1[0]=1
//    tablica1[1]=111

//    var tablica1 : IntArray = intArrayOf(3,2,1)
//
//
//    tablica1.set(1,999) //ustawianie wartości;
//    tablica1.get(1) // pobieranie wartości
//

//var tablica1 : Array<String> = arrayOf ("jeden","dwa","trzy")
//    println(tablica1[0])
//    println(tablica1[1])
//    println(tablica1[2])



    /////////////////////////////////tablice 2wymiarowe

//    var tablicaDwuwymiarowa = arrayOf(
//        intArrayOf(1,2,3),
//        intArrayOf(4,5,6),
//        intArrayOf(7,8,9)
//    )
//    println(tablicaDwuwymiarowa[1][1])

/////////// Instrukcje warunkowe

//    var czyParzysta : Boolean
//    val liczba: Int = 99
//
//    czyParzysta = if (liczba % 2 == 0) true else false
//
//    println(czyParzysta)


    /////////////////////////// When - taki Switch z c#

//    var number : Int = 22
//
//when (number){
//    1 -> println("Liczba 1")
//    2 -> println("Liczba 2")
//    3 -> println("Liczba 3")
//    4 -> println("Liczba 4")
//    //in 1..5 -> println("Jest w zakresie!")
//    else -> println("Wyjątek nie uwzgledniony")
//
//
//}






        //    if (a>b && a>c) println(a)
        //    else if (b>a && b>c ) println(b)
        //    else println(c)


//    var a : Int = 4
//    var b : Int = 5
//    var c : Int = 6
//
//    var opin : Boolean
//    opin = if ((a+b ==10) || (a+c==10) || (b+c==10)) true else false
//    println(opin)


//    var month : Int = 5
//    when (month){
//        1 -> println("Stryczeń")
//        2 -> println("Luty")
//        3 -> println("Marzec")
//        4 -> println("Kwiecień")
//        else -> println("Miesiące spoza zakresu!")
//    }




//    var b = "B"
//    println(if (false) "A" else b ?: "C")


//    var x = 100
//    if (x % 2 == 0) {
//        print("A")
//        when {
//            x < 100 -> print("B")
//            x in 200 downTo 100 -> print("C")
//            x in 0..1000 -> print("D")
//            else -> print("E")
//        }
//    } else if (x != 0) {
//        print("F")
//    }
//    print("G")

/// pętla for:
//
//    for (i in 0..10 step 2) /             /// until/downTo
//        println(i)


//var i = 0
//    while (i<10){
//        println(i)
//        i++
//    }
//
//     i  = 0
//    do {
//        println(i)
//        i++
//    } while (i < 10)


//for (i in 0..10){             ////CONTINUE
//    if (i ==8){
//        continue}
//    println(i)
//}


//    for (i in 0..10){          ////BREAK
//        if (i ==8){
//            break}
//        println(i)
//    }

//var tab1 : IntArray = intArrayOf(-33,0,10,33,100)
//    for (i in tab1){
//        println(i)
//    }
//
//
//    for (a in 0 until tab1.size){
//        println(tab1[a])
//    }
//
//
//
//    for (e in tab1.indices){
//        println(tab1[e])
//    }



//    . Zlicz ile występuje liczb parzystych w tablicy
//
//   val tab = arrayOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)
//    var counter: Int = 0
//    for (i in tab){
//        if (i %2 == 0){
//            println(i)
//            counter++
//        }
//    }
//    println(counter)



//    2. Wypisz od tyłu co trzecią liczbę od 100 do 1, czyli 100, 97, 94, 91, 88, …

  //  var licznik = 0
//    for (i in 100 downTo 0 ){
//        if (licznik == 0){
//        println(i)
//            licznik=3
//            }
//        licznik--
//    }


//    for (i in 100 downTo 0  step 3){  //ver 2.
//        println(i)
//    }


//
//    3. Napisz algorytm, który posortuje rosnąco tablicę z zadania 1.
//    W razie potrzeby zapoznaj się z przykładowymi algorytmami sortowania w internecie.
//    Przykładowe: sortowanie bąbelkowe, sortowanie przez wstawianie, sortowanie przez wybieranie.

//    val tab = arrayOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)
//    var iii=0
//    var aaa=0
//    for (i in 0 until tab.size){
//        for (ii in i+1 until tab.size){
//            //println(aaa)
//            aaa++
//            if (tab[ii]<tab[i]){
//                iii = tab[i]
//                tab[i]=tab[ii]
//                tab[ii]=iii
//            }
//        }
//        print(tab[i])
//        print(" ")
//    }


/////////////////////////////////////////// Stringi!!!!!!!!!!!!!!!!!!!

    //Rwa String """
//                      lorem ipsum....
//                      """.trimIntend() // wsystko zacznie się od poczatku ekranu(usuwa białe znaki);
    /// to to samo co \n



    var tekst1 = "Paweł"
    var tekst2 = "Strusiński"
    var razem1 = tekst1+tekst2
    var razem2 = "$tekst1$tekst2"

    println(razem1)
    println(razem2)





















}
//psvm; fun Początki.main(){}
//
//sout  println()

