package br.com.pontualimportbrindes.util;

import java.text.*;

public class StringUtil {
    public static String normalize(String s) {
        return Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll(" ", "").toLowerCase();
    }
}
