package gstu.chikanoff.entities;

import java.io.Serializable;

public class ReaderLib implements Serializable {
    private String fullName;

    public ReaderLib(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
