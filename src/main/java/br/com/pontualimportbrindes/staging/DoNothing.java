package br.com.pontualimportbrindes.staging;

import br.com.pontualimportbrindes.util.*;

class DoNothing {
    public static void main(String[] args) {
        System.out.println(3 +
                           9);
        System.out.println(String.join("\n", "did \\", "nothing"));
        System.out.println(StringUtil.normalize("Squeezes pré Nação"));
    }
}
