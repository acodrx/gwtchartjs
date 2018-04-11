package com.github.gwtchartjs.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartOptions {
  public Boolean responsive;

  public int responsiveAnimationDuration;

  public Boolean maintainAspectRatio;

  public ChartLegend legend;

  public ChartTitle title;

  public ChartTooltips tooltips;

  public ChartScales scales;

  // @JsOverlay
  // public final ChartLegend getLegend() {
  // if (legend == null)
  // legend = new ChartLegend();
  // return legend;
  // }
  //
  // @JsOverlay
  // public final ChartTitle getTitle() {
  // if (title == null)
  // title = new ChartTitle();
  // return title;
  // }
  //
  // @JsOverlay
  // public final ChartTooltips getTooltips() {
  // if (tooltips == null)
  // tooltips = new ChartTooltips();
  // return tooltips;
  // }
  //
  // @JsOverlay
  // public final ChartScales getScales() {
  // if (scales == null)
  // scales = new ChartScales();
  // return scales;
  // }
}
