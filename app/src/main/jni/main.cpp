#include "cpp_JNITest.h"
#include <string>
extern "C"
JNIEXPORT jstring JNICALL
JNICALL Java_cpp_JNITest_getString(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
