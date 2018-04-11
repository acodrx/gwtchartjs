package com.github.gwtchartjs.client;

import com.github.gwtchartjs.client.core.TooltipInteraction;
import com.github.gwtchartjs.client.core.TooltipPosition;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The tooltip configuration is passed into the options.tooltips namespace. The global options for the chart
 * tooltips is defined in Chart.defaults.global.tooltips.
 *
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartTooltips {

  /** Are on-canvas tooltips enabled. Default: true */
  public Boolean enabled;

  // public Function custom;null See custom tooltip section.

  /**
   * Sets which elements appear in the tooltip. more....Default: 'nearest'<br>
   * @see {@link TooltipInteraction}
   */
  public String mode;

  /**
   * if true, the tooltip mode applies only when the mouse position intersects with an element. If false, the
   * mode will be applied at all times. Default: true
   */
  public Boolean intersect;

  /**
   * The mode for positioning the tooltip. more... Default: 'average'<br>
   * @see {@link TooltipPosition}
   */
  public String position;

  // public Object callbacks; See the callbacks section

  // public Function itemSort; Sort tooltip items. more...

  // public Function filter; Filter tooltip items. more...

  /** Background color of the tooltip. Default 'rgba(0,0,0,0.8)' */
  public String backgroundColor;

  /** title font. Default "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif" */
  public String titleFontFamily;

  /** Title font size. Default 12 */
  public Integer titleFontSize;

  /** Title font style. Default 'bold' */
  public String titleFontStyle;

  /** Title font color. Default '#fff' */
  public String titleFontColor;

  /** Spacing to add to top and bottom of each title line. Default 2 */
  public Integer titleSpacing;

  /** Margin to add on bottom of title section. Default 6 */
  public Integer titleMarginBottom;

  /** body line font. Default "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif" */
  public String bodyFontFamily;

  /** Body font size. Default 12 */
  public Integer bodyFontSize;

  /** Body font style. Default 'normal' */
  public String bodyFontStyle;

  /** Body font color. Default '#fff' */
  public String bodyFontColor;

  /** Spacing to add to top and bottom of each tooltip item. Default 2 */
  public Integer bodySpacing;

  /** footer font. Default "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif" */
  public String footerFontFamily;

  /** Footer font size. Default 12 */
  public Integer footerFontSize;

  /** Footer font style. Default 'bold' */
  public String footerFontStyle;

  /** Footer font color. Default '#fff' */
  public String footerFontColor;

  /** Spacing to add to top and bottom of each footer line. Default 2 */
  public Integer footerSpacing;

  /** Margin to add before drawing the footer. Default 6 */
  public Integer footerMarginTop;

  /** Padding to add on left and right of tooltip. Default 6 */
  public Integer xPadding;

  /** Padding to add on top and bottom of tooltip. Default 6 */
  public Integer yPadding;

  /** Extra distance to move the end of the tooltip arrow away from the tooltip point. Default 2 */
  public Integer caretPadding;

  /** Size, in px, of the tooltip arrow. Default 5 */
  public Integer caretSize;

  /** Radius of tooltip corner curves. Default 6 */
  public Integer cornerRadius;

  /** Color to draw behind the colored boxes when multiple items are in the tooltip. Default '#fff' */
  public String multiKeyBackground;

  /** if true, color boxes are shown in the tooltip. Default true */
  public Boolean displayColors;

  /** Color of the border. Default 'rgba(0,0,0,0)' */
  public String borderColor;

  /** Size of the border. Default 0 */
  public Integer borderWidth;
}
