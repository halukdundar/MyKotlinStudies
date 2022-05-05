//Encapsulation

class Sanatci(isim:String, yas: Int, meslek:String, uzmanlik:String){

	var isim:String?=isim
		private set 	// isme erişilebilir 
		get				//isim değiştirilemez...
		
	private var meslek:String?=meslek // mesleğe hem erişilemez hem de değiştirilemez

	var uzmanlik:String?=uzmanlik  //sanatçının mesleğine hem erişilebilir hem de değiştirilebilir

}