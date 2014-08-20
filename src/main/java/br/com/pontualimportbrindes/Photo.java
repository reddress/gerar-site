package br.com.pontualimportbrindes;

import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

import static br.com.pontualimportbrindes.util.Convenience.print;

public class Photo {
    BufferedImage image;

    public Photo(String filename) {
        try {
            BufferedImage originalImage = ImageIO.read(new File(filename));
            this.image = new BufferedImage(originalImage.getWidth(),
                                           originalImage.getHeight() + 50,
                                           BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = this.image.createGraphics();
            g.drawImage(originalImage, 0, 0, originalImage.getWidth(),
                        originalImage.getHeight(), null);
            g.dispose();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCaption(String caption) {
        Graphics g = this.image.getGraphics();
        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 16);
        g.setFont(font);

        FontMetrics fm = g.getFontMetrics(font);

        char[] captionChars = caption.toCharArray();
        int captionWidth = fm.charsWidth(captionChars, 0, captionChars.length);

        print(captionWidth);
        g.drawString(caption, (this.image.getWidth() - captionWidth) / 2, this.image.getHeight() - 30);
        g.dispose();
    }

    public void addBrand() {
        String caption = "PONTUAL IMPORT BRINDES";
        Graphics g = this.image.getGraphics();
        g.setColor(Color.RED);
        // g.setFont(g.getFont().deriveFont(16f));
        Font font = new Font("Arial", Font.PLAIN, 12);
        g.setFont(font);

        FontMetrics fm = g.getFontMetrics(font);

        char[] captionChars = caption.toCharArray();
        int captionWidth = fm.charsWidth(captionChars, 0, captionChars.length);

        print(captionWidth);
        g.drawString(caption, (this.image.getWidth() - captionWidth - 5), this.image.getHeight() - 14);
        g.dispose();
    }        
    
    public void save(String filename) {
        try {
            ImageIO.write(image, "png", new File(filename));
        }
        catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
