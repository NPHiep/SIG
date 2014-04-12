package imagescaler;

import utils.ImageDownloader;

/**
 * Get an image from an url and scale it to width = 180px
 *
 * @author PhiHiep
 */
public class ImageScaler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImageDownloader imgDownloader = new ImageDownloader("http://upload.wikimedia.org/wikipedia/commons/e/e9/Sombrero_Galaxy_in_infrared_light_(Hubble_Space_Telescope_and_Spitzer_Space_Telescope).jpg");
    }

}
