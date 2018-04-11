package com.github.gwtchartjs.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartLegend {

  /** true is the legend shown. Default: true */
  public Boolean display;

  /**
   * Position of the legend. Default: 'top'<br>
   * 
   * @see {@link Position}
   */
  public String position;

  /**
   * Marks that this box should take the full width of the canvas (pushing down other boxes). This is unlikely
   * to need to be changed in day-to-day use. Default: true
   */
  public Boolean fullWidth;

  // onClick Function A callback that is called when a click event is registered on a label item

  // onHover Function A callback that is called when a 'mousemove' event is registered on top of a label item

  /** Legend will show datasets in reverse order. Default: false */
  public Boolean reverse;

  /** See the {@link ChartLabel} Label Configuration. */
  public ChartLabel labels;
}
