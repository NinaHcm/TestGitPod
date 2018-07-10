package com.GWTApp.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("GWTAppService")
public interface AlgorithmsAppService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);
}
