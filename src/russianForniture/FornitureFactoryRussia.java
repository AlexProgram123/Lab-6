package russianForniture;

import com.company.Chair;
import com.company.Cooker;
import com.company.FornitureFactory;

public class FornitureFactoryRussia implements FornitureFactory {
    @Override
    public Chair getChair() {
        return new ChairFromRussia();
    }
    @Override
    public Cooker getCooker(){
        return new CookerFromRussia();
    }
}
