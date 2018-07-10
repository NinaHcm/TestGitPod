package com.GWTApp.ui;

import com.GWTApp.client.AlgorithmsAppService;
import com.GWTApp.client.AlgorithmsAppServiceAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
/** Entry point classes define <code>onModuleLoad()</code>. */
public class AlgorithmsApp implements EntryPoint {

    private static AlgorithmsAppServiceAsync addressService = GWT.create(AlgorithmsAppService.class);

    public void onModuleLoad() {
        addressService.getMessage("ter", new AsyncCallback<String>() {
            @Override
            public void onFailure(Throwable caught) {
                GWT.log("error");
            }

            @Override
            public void onSuccess(String result) {
                GWT.log("success " + result);
            }
        });
        RootPanel.get().add(new AlgorithmsMainPanel());
    }


}
