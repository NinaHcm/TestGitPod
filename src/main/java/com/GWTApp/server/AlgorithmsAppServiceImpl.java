package com.GWTApp.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.GWTApp.client.AlgorithmsAppService;

public class AlgorithmsAppServiceImpl extends RemoteServiceServlet  implements AlgorithmsAppService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}