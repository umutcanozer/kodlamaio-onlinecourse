package intro;

public class Main {
	//main javada başlangıç metotudur
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//değişken isimlendirmeleri javada camelCase yazılır
		String ortaMetin="İlginizi Çekebilir";
		String altMetin="Vade Süresi";
		
		System.out.println(ortaMetin);
		
		int vade= 12;
		
		double dolarDun= 18.25;
		double dolarBugun= 18.30;
		
		boolean dolarDustuMu= false;
		
		String okYonu="";
		
		if (dolarBugun<dolarDun) { //false
			okYonu="down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan alanlar","Mutlu Emekli"};
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

	
}
