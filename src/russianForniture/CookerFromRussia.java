package russianForniture;

import com.company.Cooker;

public class CookerFromRussia implements Cooker {
    private double price ;
    private String name ;
    private double Power ;

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public double getPower() {
        return Power;
    }
    @Override
    public void setPower(double power) {
        this.Power = power;
    }
    @Override
    public void getDescription() {
        System.out.println( "Наименование:" + getName() + "  Цена:" + getPrice() + " руб" +
                "  Склад: Location1"  + " Мощность:" + getPower() + " Вват" + " Страна производства: Россия");
    }
}
