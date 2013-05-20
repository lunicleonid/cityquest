package org.cityquest.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericOobject {

    private List<GenericOobject> list = new ArrayList<GenericOobject>();
    private String id = "";
    private boolean enabled = false;
    private Map<String, Dimension> dimensions = new HashMap<String, Dimension>();

}
