package com.github.gwtchartjs.client;

import com.github.gwtchartjs.client.core.PointStyles;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * While chart types provide settings to configure the styling of each dataset, you sometimes want to style
 * all datasets the same way. A common example would be to stroke all of the bars in a bar chart with the same
 * colour but change the fill per dataset. Options can be configured for four different types of elements:
 * arc, lines, points, and rectangles. When set, these options apply to all objects of that type unless
 * specifically overridden by the configuration attached to a dataset.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartElements {

  /** Point radius. Default 3 */
  public Integer radius;

  /**
   * Point style. Default 'circle'<br>
   * 
   * @see {@link PointStyles}
   */
  public String pointStyle;

  /** Point fill color. Default 'rgba(0,0,0,0.1)' */
  public String backgroundColor;

  /** Point stroke width. Default 1 */
  public Integer borderWidth;

  /** Point stroke color. Default 'rgba(0,0,0,0.1)' */
  public String borderColor;

  /** Extra radius added to point radius for hit detection. Default 1 */
  public Integer hitRadius;

  /** Point radius when hovered. Default 4 */
  public Integer hoverRadius;

  /** Stroke width when hovered. Default: 1 */
  public Integer hoverBorderWidth;

}
