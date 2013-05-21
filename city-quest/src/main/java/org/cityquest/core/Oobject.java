package org.cityquest.core;


import java.util.HashMap;
import java.util.Map;

public abstract class Oobject extends GenericOobject{

    protected Map<String, Oobject> subOobjects = new HashMap<String, Oobject>();
    protected Map<String, Dimension> dimensions = new HashMap<String, Dimension>();
    protected Map<String, Universe> universes = new HashMap<String, Universe>();

    protected Oobject(){
        this.id = this.getClass().getName();
    }

    protected Oobject(String id){
        this.id = id;
    }

    protected Oobject(Map<String, Oobject> subOobjects, Map<String, Dimension> dimensions, Map<String, Universe> universes) {
        this.id = this.getClass().getName();
        this.subOobjects = subOobjects;
        this.dimensions = dimensions;
        this.universes = universes;
    }

    protected Oobject(String id, Map<String, Oobject> subOobjects, Map<String, Dimension> dimensions, Map<String, Universe> universes) {
        super(id);
        this.subOobjects = subOobjects;
        this.dimensions = dimensions;
        this.universes = universes;
    }

    public Map<String, Oobject> getSubOobjects() {
        return subOobjects;
    }

    public void setSubOobjects(Map<String, Oobject> subOobjects) {
        this.subOobjects = subOobjects;
    }

    public Map<String, Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(Map<String, Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    public Map<String, Universe> getUniverses() {
        return universes;
    }

    public void setUniverses(Map<String, Universe> universes) {
        this.universes = universes;
    }

    public void addUniverse(Universe universe){
        this.universes.put(universe.getId(), universe);
    }

    public void addDimension(Dimension dimension){
        this.dimensions.put(dimension.getId(), dimension);
    }

    public void addSubOobject(Oobject oobject){
        this.subOobjects.put(oobject.getId(), oobject);
    }

    public void removeUniverse(String universe){
        this.universes.remove(universe);
    }

    public void removeDimension(String dimension){
        this.dimensions.remove(dimension);
    }

    public void removeSubOobject(String oobject){
        this.subOobjects.remove(oobject);
    }
}
