package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class GroggCalculatorController implements Initializable {
	
	@FXML 
	Button fromResultToRecipe, fromRecipeToResult;
	
	@FXML
	TextField spritStyrka,drinkVolym,drinkStyrka,mangdSprit,mangdLask;
	
	Drink drink = new Drink();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {		
		
		
		spritStyrka.setOnAction(e->{
			drink.setSpritStyrka(spritStyrka.getText());
			spritStyrka.setText(String.valueOf(drink.getSpritStyrka()));
		});
		
		fromResultToRecipe.setOnAction(e->{
			drink.setSpritStyrka(spritStyrka.getText());
			drink.setDrinkVolym(drinkVolym.getText());
			drink.setDrinkStyrka(drinkStyrka.getText());
			
			drink.calculateMangdSprit();
			mangdSprit.setText(String.valueOf(drink.getMangdSprit()));
			
			drink.calculateMangdLask();
			mangdLask.setText(String.valueOf(drink.getMangdLask()));
		});
		
		fromRecipeToResult.setOnAction(e->{
			drink.setSpritStyrka(spritStyrka.getText());
			drink.setMangdLask(mangdLask.getText());
			drink.setMangdSprit(mangdSprit.getText());
			
			drink.calculateDrinkStyrka();
			drinkStyrka.setText(String.valueOf(drink.getDrinkStyrka() * 100));
			
			drink.calculateDrinkVolym();
			drinkVolym.setText(String.valueOf(drink.getDrinkVolym()));
		});
	}

}