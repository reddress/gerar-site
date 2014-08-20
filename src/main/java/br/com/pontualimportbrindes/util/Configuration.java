package br.com.pontualimportbrindes.util;

import java.io.*;

import static br.com.pontualimportbrindes.util.Convenience.print;

public class Configuration {
    final String filename = "config.txt";
    Properties config;

    public Configuration() {
        InputStream is = null;
        this.config = new Properties();
        try {
            is = new FileInputStream(filename);
            config.load(is);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // public String getProperty
}
