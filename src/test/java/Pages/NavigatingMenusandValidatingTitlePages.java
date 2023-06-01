package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class NavigatingMenusandValidatingTitlePages extends BaseClass{
	
	@FindBy(xpath = "//a [contains(text(),'Top Deals')]")
	WebElement TopDealsMenu;
	@FindBy(xpath = "//a [contains(text(),'Deal of the Day')]")
	WebElement DealoftheDaymenu;
	@FindBy(xpath = "//a [contains(text(),'Totaltech Membership')]")
	WebElement TotaltechMembershipMenu;
	@FindBy(xpath = "//a [contains(text(),'Credit Cards')]")
	WebElement creditCardsMenu;
	@FindBy(xpath = "//a [contains(text(),'Gift Cards')]")
	WebElement GiftCardsMenu;
	@FindBy(xpath = "//a [contains(text(),'Gift Ideas')")
	WebElement GiftIdeasMenu;
	@FindBy(xpath = "//span [contains(text(),'More')]")
	WebElement moreMenu;
	@FindBy(xpath = "//span [contains(text(),'Account')]")
	WebElement AccountMenu;
	@FindBy(xpath = "//span [contains(text(),'Recently Viewed')]")
	WebElement recentlyViewedMenu;
	@FindBy(xpath = "//span [contains(text(),'Order Status')]")
	WebElement OrderStatusMenu;
	@FindBy(xpath = "//span [contains(text(),'Saved Items'")
	WebElement SavedItemsMenu;
	
	
	



public NavigatingMenusandValidatingTitlePages() {
	PageFactory.initElements(driver, this);
}

public void navigatePage(WebElement TopDealsMenu, WebElement DealoftheDaymenu, WebElement TotaltechMembershipMenu,WebElement creditCardsMenu, WebElement GiftCardsMenu,WebElement GiftIdeasMenu,WebElement moreMenu,WebElement AccountMenu, WebElement recentlyViewedMenu,WebElement OrderStatusMenu,WebElement SavedItemsMenu  ) {
	
	
	TopDealsMenu = this.TopDealsMenu;
	DealoftheDaymenu = this.DealoftheDaymenu;
	TotaltechMembershipMenu = this.TotaltechMembershipMenu;
	creditCardsMenu = this.creditCardsMenu;
	GiftCardsMenu = this.GiftCardsMenu;
	GiftIdeasMenu = this.GiftIdeasMenu;
	moreMenu = this.moreMenu;
	AccountMenu = this.AccountMenu;
	recentlyViewedMenu = this.recentlyViewedMenu;
	OrderStatusMenu = this.OrderStatusMenu;
	OrderStatusMenu = this.SavedItemsMenu;
}
}
