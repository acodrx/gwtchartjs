package com.github.gwtchartjs.client.core;

/**
 * When supplying colors to Chart options, you can use a number of formats. You can specify the color as a
 * string in hexadecimal, RGB, or HSL notations. If a color is needed, but not specified, Chart.js will use
 * the global default color. This color is stored at Chart.defaults.global.defaultColor. It is initially set
 * to 'rgba(0, 0, 0, 0.1)'
 * 
 * You can also pass a CanvasGradient object. You will need to create this before passing to the chart, but
 * using it you can achieve some interesting effects.
 */
public class Colors {

  public static String getColor(String[] colors, int num) {
    return colors[num % colors.length];
  }

  public static final String indigo[] = {
  "#E8EAF6",
  "#C5CAE9",
  "#9FA8DA",
  "#7986CB",
  "#5C6BC0",
  "#3F51B5",
  "#3949AB",
  "#303F9F",
  "#283593",
  "#1A237E",
  "#8C9EFF",
  "#536DFE",
  "#3D5AFE",
  "#304FFE"};
  
  public static final String blue[] = {
      "#060D96",
      "#131A9B",
      "#2028A1",
      "#2E35A7",
      "#3B43AD",
      "#4950B3",
      "#565EB8",
      "#646BBE",
      "#7179C4",
      "#7F86CA",
      "#8C94D0",
      "#9AA1D6",
      "#A7AFDB",
      "#B5BCE1",
      "#C2CAE7",
      "#D0D7ED",
      "#DDE5F3",
      "#EBF3F9" };

  public static final String rainbow[] = {
      "#FA0000",
      "#FA1700",
      "#FA2E00",
      "#FB4500",
      "#FB5C00",
      "#FC7300",
      "#FC8B00",
      "#FDA200",
      "#FDB900",
      "#FED000",
      "#FEE700",
      "#FFFF00",
      "#E7FF00",
      "#D0FF00",
      "#B9FF00",
      "#A2FF00",
      "#8BFF00",
      "#73FF00",
      "#5CFF00",
      "#45FF00",
      "#2EFF00",
      "#17FF00",
      "#00FF00",
      "#00E717",
      "#00D02E",
      "#00B945",
      "#00A25C",
      "#008B73",
      "#00738B",
      "#005CA2",
      "#0045B9",
      "#002ED0",
      "#0017E7",
      "#0000FF",
      "#1212FF",
      "#2424FF",
      "#3636FF",
      "#4848FF",
      "#5A5AFF",
      "#6D6DFF",
      "#7F7FFF",
      "#9191FF",
      "#A3A3FF",
      "#B5B5FF",
      "#C8C8FF" };
}
