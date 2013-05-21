package org.cityquest.core;


public abstract class GenericOobject {
    protected String id = "";

    protected GenericOobject() {
        this.id = this.getClass().getName();
    }

    protected GenericOobject(String id) {
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }
}
