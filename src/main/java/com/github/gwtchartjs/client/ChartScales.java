package com.github.gwtchartjs.client;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartScales {
  public JsArray<ChartAxis> xAxes;

  public JsArray<ChartAxis> yAxes;

  // @JsOverlay
  // public final ChartAxis getxAxes() {
  // if (xAxes == null)
  // xAxes = new ChartAxis();
  // return xAxes;
  // }

  // @JsOverlay
  // public final ChartAxis getyAxes() {
  // if (yAxes == null)
  // yAxes = new ChartAxis();
  // return yAxes;
  // }
}
