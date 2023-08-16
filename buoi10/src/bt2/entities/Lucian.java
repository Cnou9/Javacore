package bt2.entities;

import bt2.service.CanShoot;

public class Lucian extends Champions implements CanShoot {

    @Override
    public void shoot() {
        System.out.println("Lucian can shooting");
    }

    @Override
    public void surf() {
        System.out.println("Lucian can surfing");
    }
}
