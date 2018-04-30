package com.github.gwtchartjs.client;

import com.github.gwtchartjs.client.core.Colors;
import com.github.gwtchartjs.client.core.Position;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartTitle {

  /** true is the legend shown. Default: true */
  public Boolean display;

  /**
   * Position of the legend. Default: 'top'<br>
   * 
   * {@link com.github.gwtchartjs.client.core.Position}
   */
  public String position;

  /** font size of text. Default: 12 */
  public Integer fontSize;

  /** Font family of legend text. Default: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif" */
  public String fontFamily;

  /**
   * Color of text. Default: '#666'<br>
   * 
   * {@link com.github.gwtchartjs.client.core.Colors}
   */
  public String fontColor;

  /** font style of text. Default: 'normal' */
  public String fontStyle;

  /** Number of pixels to add above and below the title text. Default: 10 */
  public Integer padding;

  /**
   * Height of an individual line of text. Number/String. Default: 1.2<br>
   * 
   * See <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/line-height">MDN</a>
   */
  public Object lineHeight;

  /**
   * Title text to display. If specified as an array, text is rendered on multiple lines. String/String[].
   * Default: ''
   */
  public Object text;

}
