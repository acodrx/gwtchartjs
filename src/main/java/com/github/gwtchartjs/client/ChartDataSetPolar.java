package com.github.gwtchartjs.client;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Polar area charts are similar to pie charts, but each segment has the same angle - the radius of the
 * segment differs depending on the value.
 * 
 * This type of chart is often useful when we want to show a comparison data similar to a pie chart, but also
 * show a scale of values for context.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartDataSetPolar<T> extends ChartDataSet<T> {
  /**
   * The fill color under the line. <br>
   * 
   * @see {@link com.github.gwtchartjs.client.core.Colors}
   */
  public JsArray<String> backgroundColor;

  /**
   * The color of the line. <br>
   * 
   * @see {@link com.github.gwtchartjs.client.core.Colors}
   */
  public JsArray<String> borderColor;

  /** The width of the line in pixels. */
  public JsArray<Integer> borderWidth;

  /** The fill color of the arcs when hovered. */
  public JsArray<String> hoverBackgroundColor;

  /** The stroke color of the arcs when hovered. */
  public JsArray<String> hoverBorderColor;

  /** The stroke width of the arcs when hovered. */
  public JsArray<Integer> hoverBorderWidth;
}