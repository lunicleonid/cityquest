package org.cityquest.core;

import java.util.HashMap;
import java.util.Map;

public abstract class Universe extends GenericOobject{

    protected Universe(String id) {
        super(id);
    }

    protected Universe(String id, Map<String, Rule> rules) {
        super(id);
        this.rules = rules;
    }

    protected Map<String, Rule> rules = new HashMap<String, Rule>();

    public Map<String, Rule> getRules() {
        return rules;
    }

    public void setRules(Map<String, Rule> rules) {
        this.rules = rules;
    }

    public void addRule(Rule rule){
        this.rules.put(rule.getId(), rule);
    }
}
