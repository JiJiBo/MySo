package cpp;

public class JNITest {

    static {
        System.loadLibrary("jnilib");
    }

    public native String getString();
}