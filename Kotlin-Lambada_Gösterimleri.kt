//Kotlin Lambda Kullanımı ---- Lambada Gösterimi bu şekildedir (   ->    )

// TOPLAMA fonksiyonu ve geriye iki sayının toplamını veren lambada gösterimiyle 


val toplama = { x: Int, y: Int -> x + y }

println(toplama(11,23) // geriye 34 değerini vermektedir.


        

        
//Diğer bir örnek gösterim

val carpma: (Int,Int)-> Int={x,y-> x*y}


println(carpma(11,11))  //geriye 121 değerini vermektedir.
