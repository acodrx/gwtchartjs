package com.github.gwtchartjs.client.core;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class Point {

  @JsOverlay
  public static Point build(double x, double y) {
    Point p = new Point();
    p.x = x;
    p.y = y;
    return p;
  }

  @JsProperty
  public double x;

  @JsProperty
  public double y;
}
