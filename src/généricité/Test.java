package généricité;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<? extends Mere> liste = new ArrayList<Fille1>();
    }
}
