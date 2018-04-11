package com.github.gwtchartjs.client.resource;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

public class ChartEntryPoint implements EntryPoint {

  @Override
  public void onModuleLoad() {
    ScriptInjector.fromString(ChartClientBundle.INSTANCE.script()
        .getText())
        .setWindow(ScriptInjector.TOP_WINDOW)
        .inject();
  }
}
