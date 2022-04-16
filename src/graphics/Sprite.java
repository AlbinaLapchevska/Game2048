package graphics;

public class Sprite {
    public int width;
    public int height;
    public int[] pixels;

    public Sprite(int width, int height, int color) {
        this.width = width;
        this.height = height;
        this.pixels = new int[width * height];
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                pixels[x + y * width] = color;

                if (x % 100 < 3 || x % 100 > 97 || y % 100 < 3 || y % 100 > 97) {
                    pixels[x + y * width] = 0xffff00ff;
                }
            }
        }
    }
}
