package russianForniture;
import com.company.Chair;

public class ChairFromRussia implements Chair {
    private double price ;
    private String name ;
    private double height;

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
    public double getHeight() {
        return height;
    }
    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void getDescription() {
        System.out.println( "Наименование:" + getName() + "  Цена:" + getPrice() + " руб" +
                "  Склад:  Location1"  + " Высота:" + getHeight() + " см" + " Страна производства: Россия");
    }
}


