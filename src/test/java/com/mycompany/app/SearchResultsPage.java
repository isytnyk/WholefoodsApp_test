package com.mycompany.app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage {

	@FindBy (id = "com.wholefoods.wholefoodsmarket:id/searchResultsNumber")
	WebElement res_num;
	
}
