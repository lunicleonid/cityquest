package org.cityquest.core;

import java.util.Map;

public class Trigger extends GenericOobject{

    public Trigger(String id) {
        super(id);
    }

    public void run(Oobject oobject){
        Map<String, Dimension> dimensions = oobject.getDimensions();
        Map<String, Universe> universes = oobject.getUniverses();

    }

}
