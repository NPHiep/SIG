package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * 
 * @author PhiHiep
 */
public class ImageDownloader {

    public static final int WIDTH = 180;
    private Image image = null;

    public ImageDownloader(String url) {
        try {
            URL imgUrl = new URL(url);
            image = ImageIO.read(imgUrl);
            int h = image.getHeight(null);
            int w = image.getWidth(null);
            h = h*180/w;
            w = WIDTH;
            BufferedImage bi = new BufferedImage(w,h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = (Graphics2D) bi.createGraphics();
            g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,
                    RenderingHints.VALUE_RENDER_QUALITY));
            g2d.drawImage(image, 0, 0, w, h , null);
            ImageIO.write(bi, "jpg", new File("./img.jpg"));
        } catch (Exception e) {
            System.out.printf("Downloading error");
        }
    }
}
