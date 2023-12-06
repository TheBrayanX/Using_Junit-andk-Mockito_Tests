package com.pruebas;

public class MoneyUtil {

    public String format(float money, String symbol) {

        String s = symbol;
        money = Math.abs(money);

        if(money<0){
            s = "-"+ symbol + money;
        }

        String response = String.format("%.2f", money);

        return s+response;
    }   

    public static void main(String[] args) {
        MoneyUtil mu = new MoneyUtil();
        String muf = mu.format(3000, "\u0024");
        System.out.print(muf);
    }
}
