public class bensin {
    public static void main(String[] args) {
        
        int bensin_saatini = 80;
		int kapasitasbens =70;
		double persentasiBensin = bensin_saatini/ kapasitasbens*100;

		if(persentasiBensin >= 96){
			System.out.println("tangki bensin penuh (" + bensin_saatini + "liter " + persentasiBensin + "%");
		}
		else if(persentasiBensin >= 60){
			System.out.println("tangki bensin setengah (" + bensin_saatini + "liter " + persentasiBensin + "%");
		}
		else if(persentasiBensin >= 25){
			System.out.println("tangki bensin hampir habis (" + bensin_saatini + "liter " + persentasiBensin + "%");
		}
		else{
			System.out.println("tangki kosong " + bensin_saatini + "liter " + persentasiBensin + "%");
		}
    }
}
