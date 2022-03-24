package com;

public class PriceList {
    public static void main(String[] args){
        String macBrand = "MacBookAir";
        double macSize = 13.3;
        double macPrice = 6988.88;
        String macConfig = "i5处理器4G内存128G固态硬盘";
        int macCount = 5;

        String thinkpadBrand = "ThinkPadT0";
        double thinkpadSize = 14.0;
        double thinkpadPrice = 5999.99;
        String thinkpadConfig = "i5处理器4G内存128G固态硬盘";
        int thinkpadCount = 10;

        String ASUSBrand = "ASUS-F0";
        double ASUSSize = 15.6;
        double ASUSPrice = 4999.60;
        String ASUSConfig = "i9处理器32G内存1TB固态硬盘";
        int ASUSCount = 10;

        System.out.println("-----------------------Store List"
                + "----------------------");
        System.out.println("品牌         尺寸  价格             配置             库存数");
        System.out.println(macBrand+"  "+macSize+" "+macPrice+"  "+macConfig+"  "+macCount);
        System.out.println(thinkpadBrand+"  "+thinkpadSize+" "+thinkpadPrice+"  "+thinkpadConfig+"  "+thinkpadCount);
        System.out.println(ASUSBrand+"     "+ASUSSize+" "+ASUSPrice+"   "+ASUSConfig+"  "+ASUSCount);

        int totalCount = macCount + thinkpadCount + ASUSCount;
        double totalMoney = (macCount * macPrice) + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);
        System.out.println("-------------------------------------------------------");
        System.out.println("总库存数:"+ totalCount);
        System.out.println("库存商品总金额:"+ totalMoney);

    }
}
