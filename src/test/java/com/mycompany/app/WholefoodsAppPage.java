package com.mycompany.app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WholefoodsAppPage {
	
@FindBy (id = "com.wholefoods.wholefoodsmarket:id/hamburger_icon")
WebElement home_button;

@FindBy (id = "com.wholefoods.wholefoodsmarket:id/tvReceipesTitle")
WebElement rec_search;

@FindBy (id = "com.wholefoods.wholefoodsmarket:id/tvReceipesTitle")
WebElement recps;

@FindBy (id = "com.wholefoods.wholefoodsmarket:id/etHomeSearch")
WebElement search;

@FindBy (id = "com.wholefoods.wholefoodsmarket:id/imgSearch")
WebElement search_icon;



}
