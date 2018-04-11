package com.github.gwtchartjs.client;

import com.github.gwtchartjs.client.core.Colors;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartLabel {

  /** width of coloured box. Default: 40 */
  public Integer boxWidth;

  /** font size of text. Default: 12 */
  public Integer fontSize;

  /** font style of text. Default: 'normal' */
  public String fontStyle;

  /**
   * Color of text. Default: '#666'<br>
   * @see {@link Colors}
   */
  public String fontColor;

  /** Font family of legend text. Default: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif" */
  public String fontFamily;

  /** Padding between rows of colored boxes. Default: 10 */
  public Integer padding;

  // generateLabels Function Generates legend items for each thing in the legend. Default implementation
  // returns the text + styling for the color box. See Legend Item for details.

  // filter Function null Filters legend items out of the legend. Receives 2 parameters, a Legend Item and the
  // chart data.

  /**
   * Label style will match corresponding point style (size is based on fontSize, boxWidth is not used in this
   * case). Default: false
   */
  public Boolean usePointStyle;

}
