package com.github.gwtchartjs.client;

import com.github.gwtchartjs.client.core.ChartTypes;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartConfig {
  /**
   * See {@link ChartTypes}
   */
  public String type;

  public ChartData data;

  public ChartOptions options;

  // @JsOverlay
  // public final ChartData getData() {
  // if (data == null)
  // data = new ChartData();
  // return data;
  // }

  // @JsOverlay
  // public final ChartOptions getOptions() {
  // if (options == null)
  // options = new ChartOptions();
  // return options;
  // }
}
