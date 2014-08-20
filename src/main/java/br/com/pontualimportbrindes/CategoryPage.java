package br.com.pontualimportbrindes;

import br.com.pontualimportbrindes.util.*;

public class CategoryPage {
    String name;
    String filename;
    String contents;
    
    public CategoryPage(String name) {
        this.name = name;
        this.filename = StringUtil.normalize(name);
        
    }
}
