# Remote Control System
This project contains two Java classes: `Remote` and `RemoteRunner`. The Remote class represents a remote control device, and the `RemoteRunner` class contains a main method that tests the `Remote` class.

# Remote Class
The Remote class encapsulates the properties of a remote control device, such as its height, width, depth, and color. It has two constructors: one that creates a default remote with predefined dimensions and color, and another that allows you to specify custom dimensions and color. The class also provides getter and setter methods for each property.

## Here is an example of how to use the Remote class:


```
Remote myRemote = new Remote(10.0, 5.0, 2.0, 1);
double height = myRemote.getHeight();
int color = myRemote.getColor();
myRemote.setWidth(6.0);
```

# RemoteRunner Class
The RemoteRunner class contains a main method that tests the Remote class. It creates instances of the Remote class using both the default and custom constructors, and then tests the getter and setter methods to ensure they are working correctly. It prints out the properties of the remote objects to the console so that you can verify that they have been set correctly.

## Here is an example of how to run the RemoteRunner class:

```
$ javac Remote.java RemoteRunner.java
$ java RemoteRunner
```

# Dependencies
This project has no external dependencies.

# Contributing
Contributions are welcome! If you would like to contribute to this project, please open a pull request.

# License
This project is licensed under the MIT License. See the LICENSE file for details.
