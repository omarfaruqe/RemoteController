public class RemoteRunner {

    public static void main(String[] args) {

        // Create a default remote
        Remote defaultRemote = new Remote();
        System.out.println("Default remote height: " + defaultRemote.getHeight());
        System.out.println("Default remote width: " + defaultRemote.getWidth());
        System.out.println("Default remote depth: " + defaultRemote.getDepth());
        System.out.println("Default remote color: " + defaultRemote.getColor());

        // Create a custom remote
        Remote customRemote = new Remote(12.5, 5.0, 3.0, 1);
        System.out.println("Custom remote height: " + customRemote.getHeight());
        System.out.println("Custom remote width: " + customRemote.getWidth());
        System.out.println("Custom remote depth: " + customRemote.getDepth());
        System.out.println("Custom remote color: " + customRemote.getColor());

        // Modify the custom remote and print its new properties
        customRemote.setHeight(15.0);
        customRemote.setWidth(6.0);
        customRemote.setDepth(3.5);
        customRemote.setColor(2);
        System.out.println("Modified custom remote height: " + customRemote.getHeight());
        System.out.println("Modified custom remote width: " + customRemote.getWidth());
        System.out.println("Modified custom remote depth: " + customRemote.getDepth());
        System.out.println("Modified custom remote color: " + customRemote.getColor());
    }
}