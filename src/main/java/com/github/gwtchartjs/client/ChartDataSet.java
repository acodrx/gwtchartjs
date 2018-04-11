package com.github.gwtchartjs.client;

import com.github.gwtchartjs.client.core.ChartTypes;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public abstract class ChartDataSet<T> {
  /**
   * See {@link ChartTypes}. Optional
   */
  public String type;

  public JsArray<T> data;

}
