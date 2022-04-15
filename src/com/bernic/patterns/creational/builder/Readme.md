Use the Builder pattern when

• The algorithm for creating a complex object should be independent of the parts that make up the object and how they’re
assembled.

• The construction process must allow different representations for the object that’s constructed.

Builder Pattern in JDK

• java.lang.StringBuilder#append() (unsynchronized)

• java.lang.StringBuffer#append() (synchronized)

• java.nio.ByteBuffer#put() (also on CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)

• javax.swing.GroupLayout.Group#addComponent()

• All implementations of java.lang.Appendable



