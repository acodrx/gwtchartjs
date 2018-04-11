package com.github.gwtchartjs.client.resource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ChartClientBundle extends ClientBundle {
  public static final ChartClientBundle INSTANCE = GWT.create(ChartClientBundle.class);

  public static final String VERSION = "2.7.2";

  @Source("js/Chart.min.js")
  TextResource script();
}
