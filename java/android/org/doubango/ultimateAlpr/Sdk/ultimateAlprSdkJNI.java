/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.ultimateAlpr.Sdk;

public class ultimateAlprSdkJNI {

  static {
    System.loadLibrary("ultimateALPR_SDK");
  }

  public final static native long new_UltAlprSdkResult__SWIG_0(int jarg1, String jarg2, String jarg3, long jarg4);
  public final static native long new_UltAlprSdkResult__SWIG_1(int jarg1, String jarg2, String jarg3);
  public final static native void delete_UltAlprSdkResult(long jarg1);
  public final static native int UltAlprSdkResult_code(long jarg1, UltAlprSdkResult jarg1_);
  public final static native String UltAlprSdkResult_phrase(long jarg1, UltAlprSdkResult jarg1_);
  public final static native String UltAlprSdkResult_json(long jarg1, UltAlprSdkResult jarg1_);
  public final static native long UltAlprSdkResult_numPlates(long jarg1, UltAlprSdkResult jarg1_);
  public final static native boolean UltAlprSdkResult_isOK(long jarg1, UltAlprSdkResult jarg1_);
  public final static native long new_UltAlprSdkParallelDeliveryCallback();
  public final static native void delete_UltAlprSdkParallelDeliveryCallback(long jarg1);
  public final static native void UltAlprSdkParallelDeliveryCallback_onNewResult(long jarg1, UltAlprSdkParallelDeliveryCallback jarg1_, long jarg2, UltAlprSdkResult jarg2_);
  public final static native void UltAlprSdkParallelDeliveryCallback_director_connect(UltAlprSdkParallelDeliveryCallback obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void UltAlprSdkParallelDeliveryCallback_change_ownership(UltAlprSdkParallelDeliveryCallback obj, long cptr, boolean take_or_release);
  public final static native long UltAlprSdkEngine_init__SWIG_0(Object jarg1, String jarg2, long jarg3, UltAlprSdkParallelDeliveryCallback jarg3_);
  public final static native long UltAlprSdkEngine_init__SWIG_1(Object jarg1, String jarg2);
  public final static native long UltAlprSdkEngine_init__SWIG_2(Object jarg1);
  public final static native long UltAlprSdkEngine_deInit();
  public final static native long UltAlprSdkEngine_process__SWIG_0(int jarg1, java.nio.ByteBuffer jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long UltAlprSdkEngine_process__SWIG_1(int jarg1, java.nio.ByteBuffer jarg2, long jarg3, long jarg4);
  public final static native long UltAlprSdkEngine_process__SWIG_2(int jarg1, java.nio.ByteBuffer jarg2, java.nio.ByteBuffer jarg3, java.nio.ByteBuffer jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9, long jarg10);
  public final static native long UltAlprSdkEngine_process__SWIG_3(int jarg1, java.nio.ByteBuffer jarg2, java.nio.ByteBuffer jarg3, java.nio.ByteBuffer jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9);
  public final static native long UltAlprSdkEngine_warmUp(int jarg1);
  public final static native void delete_UltAlprSdkEngine(long jarg1);

  public static void SwigDirector_UltAlprSdkParallelDeliveryCallback_onNewResult(UltAlprSdkParallelDeliveryCallback self, long result) {
    self.onNewResult((result == 0) ? null : new UltAlprSdkResult(result, false));
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
