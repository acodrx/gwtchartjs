package com.github.gwtchartjs.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The line chart allows a number of properties to be specified for each dataset. These are used to set
 * display properties for a specific dataset. For example, the colour of a line is generally set this way.
 * 
 * All point* properties can be specified as an array. If these are set to an array value, the first value
 * applies to the first point, the second value to the second point, and so on.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartDataSetBubble<T> extends ChartDataSet<T> {
  /**
   * The fill color under the line. <br>
   * 
   * {@link com.github.gwtchartjs.client.core.Colors}
   */
  public String backgroundColor;

  /**
   * The color of the line. <br>
   * 
   * {@link com.github.gwtchartjs.client.core.Colors}
   */
  public String borderColor;

  /** The width of the line in pixels. */
  public Integer borderWidth;

  /**
   * The fill colour of the bars when hovered. Color/Color[]
   */
  public String hoverBackgroundColor;

  /**
   * The stroke colour of the bars when hovered. Color/Color[]
   */
  public String hoverBorderColor;

  /**
   * Default: 1
   */
  public Integer hoverBorderWidth;

  /** Default: 4 */
  public Integer hoverRadius;

  /** Default: 1 */
  public Integer hitRadius;

  /** The label for the dataset which appears in the legend and tooltips. */
  public String label;

  /**
   * Style of the point. String
   * 
   * {@link com.github.gwtchartjs.client.core.PointStyles}
   */
  public String pointStyle;

  /** Default: 3 */
  public Integer radius;
}