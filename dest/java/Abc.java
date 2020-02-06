package io.quicktype;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

/**
 * 素晴らしいAbc
 */
public class Abc {
    private String a;
    private double b;
    private Def c;

    /**
     * あ
     */
    @JsonProperty("a")
    public String getA() { return a; }
    @JsonProperty("a")
    public void setA(String value) { this.a = value; }

    /**
     * べ
     */
    @JsonProperty("b")
    public double getB() { return b; }
    @JsonProperty("b")
    public void setB(double value) { this.b = value; }

    /**
     * し
     */
    @JsonProperty("c")
    public Def getC() { return c; }
    @JsonProperty("c")
    public void setC(Def value) { this.c = value; }
}
