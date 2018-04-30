package com.github.gwtchartjs.client;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A radar chart is a way of showing multiple data points and the variation between them.
 * 
 * They are often useful for comparing the points of two or more different data sets.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartDataSetRadar<T> extends ChartDataSet<T> {

  /** The label for the dataset which appears in the legend and tooltips. */
  public String label;

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
   * Length and spacing of dashes.<br>
   * 
   * <a href=
   *      "https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash">MDN</a>
   */
  public JsArray<Integer> borderDash;

  /**
   * Offset for line dashes.<br>
   * 
   * <a href=
   *      "https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineDashOffset">MDN</a>
   */
  public Integer borderDashOffset;

  /**
   * Cap style of the line.<br>
   * 
   * <a href= "https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap">MDN</a>
   */
  public String borderCapStyle;

  /**
   * Line joint style.<br>
   * 
   * <a href=
   *      "https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin">MDN</a>
   */
  public String borderJoinStyle;

  /**
   * How to fill the area under the line.<br>
   */
  public Object fill;

  /**
   * Bezier curve tension of the line. Set to 0 to draw straightlines. This option is ignored if monotone
   * cubic interpolation is used.
   */
  public Integer lineTension;

  /** The fill color for points. Color/Color[] */
  public Object pointBackgroundColor;

  /** The border color for points. Color/Color[] */
  public Object pointBorderColor;

  /** The width of the point border in pixels. Number/Number[] */
  public Object pointBorderWidth;

  /**
   * The radius of the point shape. If set to 0, the point is not rendered. Number/Number[]
   */
  @JsProperty
  public Object pointRadius;

  /**
   * Style of the point. String/String[]/Image/Image[]
   * 
   * {@link com.github.gwtchartjs.client.core.PointStyles}
   */
  public Object pointStyle;

  /**
   * The pixel size of the non-displayed point that reacts to mouse events. Number/Number[]
   */
  public Object pointHitRadius;

  /**
   * Point background color when hovered. Color/Color[]
   */
  public Object pointHoverBackgroundColor;

  /** Point border color when hovered. Color/Color[] */
  public Object pointHoverBorderColor;

  /** Border width of point when hovered. Number/Number[] */
  public Object pointHoverBorderWidth;

  /** The radius of the point when hovered. Number/Number[] */
  public Object pointHoverRadius;
}