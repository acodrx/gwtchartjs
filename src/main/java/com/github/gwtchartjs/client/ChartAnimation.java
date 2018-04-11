package com.github.gwtchartjs.client;

import com.github.gwtchartjs.client.core.AnimationEasing;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartAnimation {

  /** Time for the animation of the redraw in milliseconds */
  public Integer duration;

  /** If true, the animation can be interrupted by other animations */
  public boolean lazy;

  /** The animation easing function. See {@link AnimationEasing} for possible values. */
  public String easing;

}
