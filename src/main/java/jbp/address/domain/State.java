package jbp.address.domain;

import java.io.Serializable;

/**
 * Created by Silver on 22.1.2017..
 */
public class State implements Serializable {

    private String name;
    private String shortName;

    public State() {
    }

    public State(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(final String shortName) {
        this.shortName = shortName;
    }

    public String getState () {
        return this.shortName + " " + this.name;
    }
}
