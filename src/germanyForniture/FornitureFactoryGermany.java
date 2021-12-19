package germanyForniture;

import com.company.Chair;
import com.company.Cooker;
import com.company.FornitureFactory;
import russianForniture.ChairFromRussia;
import russianForniture.CookerFromRussia;

public class FornitureFactoryGermany implements FornitureFactory {
    @Override
    public Chair getChair() {
        return new ChairFromGermany();
    }
    @Override
    public Cooker getCooker(){
        return new CookerFormGermany();
    }
}
