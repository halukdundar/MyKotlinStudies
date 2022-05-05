
//Inheritance...Miras alma

/*
Alt ve üst sınıfın ortak özelliklerinden alabilme sistemine Miras Alma denir. 
Örneğin; Bir nesneni diğer bir nesne ile ortak özelliklerindeki verileri alabilmektedir.

*/

open class Sanatci(isim:String, yas: Int, meslek:String, uzmanlik:String){

	var isim:String?=isim
		private set 	// isme erişilebilir 
		get				//isim değiştirilemez...
		
	private var meslek:String?=meslek // mesleğe hem erişilemez hem de değiştirilemez

	var uzmanlik:String?=uzmanlik  //sanatçının mesleğine hem erişilebilir hem de değiştirilebilir

}

//Inheritance...Sanatci sinifinden miras olma gerçekleşir
class FarkliSanatci(isim:String, yas: Int, meslek:String, uzmanlik:String) : Sanatci(isim, yas, meslek){

	
}
