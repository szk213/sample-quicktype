package io.quicktype;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

/**
 * し
 */
public class Def {
    private String[] d;
    private double[] e;

    @JsonProperty("d")
    public String[] getD() { return d; }
    @JsonProperty("d")
    public void setD(String[] value) { this.d = value; }

    @JsonProperty("e")
    public double[] getE() { return e; }
    @JsonProperty("e")
    public void setE(double[] value) { this.e = value; }
}
