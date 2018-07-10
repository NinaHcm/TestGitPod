package com.GWTApp.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AlgorithmsAppServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
