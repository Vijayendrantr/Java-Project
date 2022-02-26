package understanding.java8.features;

public class LaptopComaprable implements Comparable<LaptopComaprable> {
	
	private String lapName;
	private int lapPrice;
	private int lapRam;
	
	public LaptopComaprable(String lapName, int lapPrice, int lapRam) {
		super();
		this.lapName = lapName;
		this.lapPrice = lapPrice;
		this.lapRam = lapRam;
	}
	
	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	public int getLapPrice() {
		return lapPrice;
	}

	public void setLapPrice(int lapPrice) {
		this.lapPrice = lapPrice;
	}

	public int getLapRam() {
		return lapRam;
	}

	public void setLapRam(int lapRam) {
		this.lapRam = lapRam;
	}
	
	@Override
	public String toString() {
		return "LaptopComaprable [lapName=" + lapName + ", lapPrice=" + lapPrice + ", lapRam=" + lapRam + "]";
	}

	@Override
	public int compareTo(LaptopComaprable obj) {
		if (this.getLapPrice() > obj.getLapPrice()) {
			return 1;
		} else if (this.getLapPrice() < obj.getLapPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

}
