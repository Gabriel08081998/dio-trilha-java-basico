package sistemaSmartTv;

public class SmartTv {

	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}
	
	public void mudarCanal (int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarvolume() {
		volume++;
		System.out.println("volume (+) " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("volume (-) " + volume);
	}
	
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
}
