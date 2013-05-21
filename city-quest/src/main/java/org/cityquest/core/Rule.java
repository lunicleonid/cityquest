package org.cityquest.core;

import java.util.Map;

public abstract class Rule extends GenericOobject {

    protected Rule(String id) {
        super(id);
    }

    public abstract void apply(Map<String, Dimension> dimensions) throws RuntimeException;

    public void apply(Oobject oobject) {
        this.apply(oobject.getDimensions());
    }

    protected Dimension getDimension(String dimensionId, Map<String, Dimension> dimensions) {
        Dimension dimension = dimensions.get(dimensionId);
        if (dimension == null) {
            throw new RuntimeException("The rule " + this.getId() + " has been applied on an object that doesn't have "
                    + dimensionId + " dimension");
        } else
            return dimension;

    }

}
