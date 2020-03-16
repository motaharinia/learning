package com.motaharinia.designpattern.structural.facade;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    public ShopKeeper() {
        iphone = new MobileShopIphone();
        samsung = new MobileShopSamsung();
        blackberry = new MobileShopBlackberry();
    }

    public String getIphoneSpec() {
        return iphone.getModelNo() + ":" + iphone.getPrice();
    }

    public String getSamsungSpec() {
        return samsung.getModelNo() + ":" + samsung.getPrice();
    }

    public String getBlackberrySpec() {
        return blackberry.getModelNo() + ":" + blackberry.getPrice();
    }
}
