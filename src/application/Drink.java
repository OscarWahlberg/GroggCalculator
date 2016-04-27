package application;

public class Drink {
	private double spritStyrka;
	private double drinkVolym;
	private double drinkStyrka;
	private double mangdSprit;
	private double mangdLask;
	
	
	public Drink() {
		super();
		this.spritStyrka = 0;
		this.drinkVolym = 0;
		this.drinkStyrka = 0;
		this.mangdSprit = 0;
		this.mangdLask = 0;
	}
	
	public void calculateMangdSprit() {
		this.mangdSprit = (this.drinkVolym * (this.drinkStyrka / 100)) / (this.spritStyrka / 100);
	}
	
	public void calculateMangdLask() {
		this.mangdLask = this.drinkVolym - ((this.drinkVolym * (this.drinkStyrka / 100)) / (this.spritStyrka / 100));
	}
	
	public void calculateDrinkVolym() {
		this.drinkVolym = this.mangdSprit + this.mangdLask;
	}
	
	public void calculateDrinkStyrka() {
		this.drinkStyrka = (this.mangdSprit * (this.spritStyrka / 100)) / (this.mangdLask + this.mangdSprit);
	}
	
	public double getDrinkVolym() {
		return drinkVolym;
	}
	public void setDrinkVolym(double drinkVolym) {
		this.drinkVolym = drinkVolym;
	}
	public void setDrinkVolym(String drinkVolym) {
		this.drinkVolym = Double.parseDouble(drinkVolym);
	}
	
	
	public double getDrinkStyrka() {
		return drinkStyrka;
	}
	public void setDrinkStyrka(double drinkStyrka) {
		this.drinkStyrka = drinkStyrka;
	}
	public void setDrinkStyrka(String drinkStyrka) {
		this.drinkStyrka = Double.parseDouble(drinkStyrka);
	}
	
	
	public double getMangdSprit() {
		return mangdSprit;
	}
	public void setMangdSprit(double mangdSprit) {
		this.mangdSprit = mangdSprit;
	}
	public void setMangdSprit(String mangdSprit) {
		this.mangdSprit = Double.parseDouble(mangdSprit);
	}
	
	
	public double getMangdLask() {
		return mangdLask;
	}
	public void setMangdLask(double mangdLask) {
		this.mangdLask = mangdLask;
	}
	public void setMangdLask(String mangdLask) {
		this.mangdLask = Double.parseDouble(mangdLask);
	}
	
	
	public double getSpritStyrka() {
		return spritStyrka;
	}
	public void setSpritStyrka(double spritStyrka) {
		this.spritStyrka = spritStyrka;
	}
	public void setSpritStyrka(String spritStyrka) {
		double testSpritStyrka = 40;
		try {
			testSpritStyrka = Double.parseDouble(spritStyrka);
		} catch (NumberFormatException e) {
			testSpritStyrka = 40;
		} finally {
			this.spritStyrka = testSpritStyrka;
		}
	}
	
}
