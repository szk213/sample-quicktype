// To use this code, add the following Maven dependency to your project:
//
//     com.fasterxml.jackson.core : jackson-databind : 2.9.0
//
// Import this package:
//
//     import io.quicktype.Converter;
//
// Then you can deserialize a JSON string with
//
//     Enum data = Converter.EnumFromJsonString(jsonString);
//     Abc data = Converter.AbcFromJsonString(jsonString);
//     Def data = Converter.DefFromJsonString(jsonString);

package io.quicktype;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Converter {
    // Serialize/deserialize helpers

    public static Enum EnumFromJsonString(String json) throws IOException {
        return getEnumObjectReader().readValue(json);
    }

    public static String EnumToJsonString(Enum obj) throws JsonProcessingException {
        return getEnumObjectWriter().writeValueAsString(obj);
    }

    public static Abc AbcFromJsonString(String json) throws IOException {
        return getAbcObjectReader().readValue(json);
    }

    public static String AbcToJsonString(Abc obj) throws JsonProcessingException {
        return getAbcObjectWriter().writeValueAsString(obj);
    }

    public static Def DefFromJsonString(String json) throws IOException {
        return getDefObjectReader().readValue(json);
    }

    public static String DefToJsonString(Def obj) throws JsonProcessingException {
        return getDefObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader EnumReader;
    private static ObjectWriter EnumWriter;

    private static void instantiateEnumMapper() {
        ObjectMapper mapper = new ObjectMapper();
        EnumReader = mapper.reader(Enum.class);
        EnumWriter = mapper.writerFor(Enum.class);
    }

    private static ObjectReader getEnumObjectReader() {
        if (EnumReader == null) instantiateEnumMapper();
        return EnumReader;
    }

    private static ObjectWriter getEnumObjectWriter() {
        if (EnumWriter == null) instantiateEnumMapper();
        return EnumWriter;
    }

    private static ObjectReader AbcReader;
    private static ObjectWriter AbcWriter;

    private static void instantiateAbcMapper() {
        ObjectMapper mapper = new ObjectMapper();
        AbcReader = mapper.reader(Abc.class);
        AbcWriter = mapper.writerFor(Abc.class);
    }

    private static ObjectReader getAbcObjectReader() {
        if (AbcReader == null) instantiateAbcMapper();
        return AbcReader;
    }

    private static ObjectWriter getAbcObjectWriter() {
        if (AbcWriter == null) instantiateAbcMapper();
        return AbcWriter;
    }

    private static ObjectReader DefReader;
    private static ObjectWriter DefWriter;

    private static void instantiateDefMapper() {
        ObjectMapper mapper = new ObjectMapper();
        DefReader = mapper.reader(Def.class);
        DefWriter = mapper.writerFor(Def.class);
    }

    private static ObjectReader getDefObjectReader() {
        if (DefReader == null) instantiateDefMapper();
        return DefReader;
    }

    private static ObjectWriter getDefObjectWriter() {
        if (DefWriter == null) instantiateDefMapper();
        return DefWriter;
    }
}
