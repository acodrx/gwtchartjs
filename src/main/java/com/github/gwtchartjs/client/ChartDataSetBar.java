package com.github.gwtchartjs.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * A bar chart provides a way of showing data values represented as vertical bars. It is sometimes used to
 * show trend data, and the comparison of multiple data sets side by side.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartDataSetBar<T> extends ChartDataSet<T> {

  /** The label for the dataset which appears in the legend and tooltips. */
  public String label;

  /**
   * The ID of the x axis to plot this dataset on. If not specified, this defaults to the ID of the first
   * found x axis
   */
  public String xAxisID;

  /**
   * The ID of the y axis to plot this dataset on. If not specified, this defaults to the ID of the first
   * found y axis.
   */
  public String yAxisID;

  /**
   * The fill color under the line. <br>
   * 
   * {@link com.github.gwtchartjs.client.core.Colors}
   */
  public Object backgroundColor;

  /**
   * The color of the line. <br>
   * 
   * {@link com.github.gwtchartjs.client.core.Colors}
   */
  public String borderColor;

  /** The width of the line in pixels. */
  public Integer borderWidth;

  /**
   * Which edge to skip drawing the border for.<br>
   * This setting is used to avoid drawing the bar stroke at the base of the fill. In general, this does not
   * need to be changed except when creating chart types that derive from a bar chart.
   * 
   * {@link com.github.gwtchartjs.client.core.Position}
   */
  public String borderSkipped;

  /**
   * The fill colour of the bars when hovered. Color/Color[]
   */
  public Object hoverBackgroundColor;

  /**
   * The stroke colour of the bars when hovered. Color/Color[]
   */
  public Object hoverBorderColor;

  /**
   * The stroke width of the bars when hovered. Number/Number[]
   */
  public Object hoverBorderWidth;

  /**
   * The ID of the group to which this dataset belongs to (when stacked, each group will be a separate stack)
   */
  public String stack;
}