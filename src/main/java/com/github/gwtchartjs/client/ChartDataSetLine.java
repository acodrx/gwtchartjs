package com.github.gwtchartjs.client;

import elemental2.core.JsArray;
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
public class ChartDataSetLine<T> extends ChartDataSet<T> {

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
   * @see {@link com.github.gwtchartjs.client.core.Colors}
   */
  public String backgroundColor;

  /**
   * The color of the line. <br>
   * 
   * @see {@link com.github.gwtchartjs.client.core.Colors}
   */
  public String borderColor;

  /** The width of the line in pixels. */
  public Integer borderWidth;

  /**
   * Length and spacing of dashes.<br>
   * 
   * @see <a href=
   *      "https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash">MDN</a>
   */
  public JsArray<Integer> borderDash;

  /**
   * Offset for line dashes.<br>
   * 
   * @see <a href=
   *      "https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineDashOffset">MDN</a>
   */
  public Integer borderDashOffset;

  /**
   * Cap style of the line.<br>
   * 
   * @see <a href= "https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap">MDN</a>
   */
  public String borderCapStyle;

  /**
   * Line joint style.<br>
   * 
   * @see <a href=
   *      "https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin">MDN</a>
   */
  public String borderJoinStyle;

  /**
   * Algorithm used to interpolate a smooth curve from the discrete data points.<br>
   * 
   * @see {@link com.github.gwtchartjs.client.core.CubicInterpolationMode}
   */
  public String cubicInterpolationMode;

  /**
   * How to fill the area under the line.<br>
   * 
   * @see AreaCharts
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
  public Object pointRadius;

  /**
   * Style of the point. String/String[]/Image/Image[]
   * 
   * @see @link com.github.gwtchartjs.client.core.PointStyles}
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

  /** If false, the line is not drawn for this dataset. */
  public Boolean showLine;

  /**
   * If true, lines will be drawn between points with no or null data. If false, points with NaN data will
   * create a break in the line
   */
  public Boolean spanGaps;

  /**
   * If the line is shown as a stepped line.<br>
   * 
   * @see {@link com.github.gwtchartjs.client.core.SteppedLine}
   */
  public Object steppedLine;
}