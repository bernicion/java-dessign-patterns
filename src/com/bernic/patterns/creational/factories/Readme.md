Use the Factory Method pattern when

• A class can’t anticipate the class of objects it must create.

• A class wants its subclasses to specify the objects it creates.

• Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper
subclass is the delegate.


The following are the usage(s) of the Factory Method Pattern in JDK.

• java.util.Calendar#getInstance()

• java.util.ResourceBundle#getBundle()

• java.text.NumberFormat#getInstance()

• java.nio.charset.Charset#forName()

• java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Returns singleton object per
protocol)
