package com.github.gwtchartjs.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ChartGlobals {

  /** Default font color for all text. Default: '#666' */
  public String defaultFontColor;

  /**
   * Default font family for all text. Default: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
   */
  public String defaultFontFamily;

  /**
   * Default font size (in px) for text. Does not apply to radialLinear scale point labels. Default: 12
   */
  public String defaultFontSize;

  /**
   * Default font style. Does not apply to tooltip title or footer. Does not apply to chart title. Default:
   * 'normal'
   */
  public String defaultFontStyle;

  /**
   * Default Animation
   */
  public ChartAnimation animation;

  /** {@link com.github.gwtchartjs.client.ChartGridLines } */
  public ChartGridLines gridLines;

  // public Padding????? padding;

  public ChartLegend legend;

  public ChartTitle title;

  public ChartTooltips tooltips;

  public ChartElements elements;

  /*
   * Line Configuration
   */

  /** If false, the lines between points are not drawn.- Default: true */
  public Boolean showLines;

  /** If false, NaN data causes a break in the line. Default: false */
  public Boolean spanGaps;

  /*
   * Bar Configuration
   */

  /**
   * 0.9 Percent (0-1) of the available width each bar should be within the category width. 1.0 will take the
   * whole category width and put the bars right next to each other. more...
   */
  public Integer barPercentage;

  /**
   * 0.8 Percent (0-1) of the available width each category should be within the sample width. more...
   */
  public Integer categoryPercentage;

  /**
   * Manually set width of each bar in pixels. If not set, the base sample widths are calculated automatically
   * so that they take the full available widths without overlap. Then, the bars are sized using barPercentage
   * and categoryPercentage.
   */
  public Integer barThickness;

  /** Set this to ensure that bars are not sized thicker than this. */
  public Integer maxBarThickness;

  /*
   * Pie/Doughnut Configuration
   */

  /**
   * 50 - for doughnut, 0 - for pie The percentage of the chart that is cut out of the middle.
   */
  public Integer cutoutPercentage;

  /** Number -0.5 * Math.PI Starting angle to draw arcs from. */
  public Double rotation;

  /** Number 2 * Math.PI Sweep to allow arcs to cover */
  public Double circumference;
}
