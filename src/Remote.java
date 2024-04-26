/**
 * This class represents a Remote device.
 * It encapsulates the properties of a remote such as height, width, depth, and color.
 */
public class Remote {

    /**
     * The height of the remote in cm.
     */
    private double height;

    /**
     * The width of the remote in cm.
     */
    private double width;

    /**
     * The depth of the remote in cm.
     */
    private double depth;

    /**
     * The color of the remote represented as an integer.
     * The specific mapping of integers to colors should be defined elsewhere.
     */
    private int color;

    /**
     * Constructs a Remote object with default dimensions and color.
     * The default height is 10cm, width is 4.7cm, depth is 2.5cm, and color is 3.
     */
    public Remote() {
        height = 10;
        width = 4.7;
        depth = 2.5;
        color = 3;
    }

    /**
     * Constructs a Remote object with specified dimensions and color.
     *
     * @param height The height of the remote in cm.
     * @param width The width of the remote in cm.
     * @param depth The depth of the remote in cm.
     * @param color The color of the remote represented as an integer.
     */
    public Remote(double height, double width, double depth, int color) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.color = color;
    }

    /**
     * Sets the height of the remote.
     *
     * @param height The new height of the remote in cm.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Sets the width of the remote.
     *
     * @param width The new width of the remote in cm.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets the depth of the remote.
     *
     * @param depth The new depth of the remote in cm.
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * Sets the color of the remote.
     *
     * @param color The new color of the remote represented as an integer.
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * Returns the height of the remote.
     *
     * @return The height of the remote in cm.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns the width of the remote.
     *
     * @return The width of the remote in cm.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the depth of the remote.
     *
     * @return The depth of the remote in cm.
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Returns the color of the remote.
     *
     * @return The color of the remote represented as an integer.
     */
    public int getColor() {
        return color;
    }
}
