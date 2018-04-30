package com.github.gwtchartjs.client;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Pie and doughnut charts are probably the most commonly used charts. They are divided into segments, the arc
 * of each segment shows the proportional value of each piece of data.
 * 
 * They are excellent at showing the relational proportions between data.
 * 
 * Pie and doughnut charts are effectively the same class in Chart.js, but have one different default value -
 * their cutoutPercentage. This equates what percentage of the inner should be cut out. This defaults to 0 for
 * pie charts, and 50 for doughnuts.
 * 
 * They are also registered under two aliases in the Chart core. Other than their different default value, and
 * different alias, they are exactly the same.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartDataSetPie<T> extends ChartDataSet<T> {

  /**
   * The fill color under the line. <br>
   * 
   * {@link com.github.gwtchartjs.client.core.Colors}
   */
  public JsArray<String> backgroundColor;

  /**
   * The color of the line. <br>
   * 
   * {@link com.github.gwtchartjs.client.core.Colors}
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