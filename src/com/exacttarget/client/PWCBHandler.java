package com.exacttarget.client;


import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class PWCBHandler implements CallbackHandler {

  public PWCBHandler() {
  }

  @Override
public void handle(Callback callbacks[]) throws IOException, UnsupportedCallbackException {
    for(int i = 0; i < callbacks.length; i++)
      if(callbacks[i] instanceof WSPasswordCallback) {
         WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];
         pc.setIdentifier(PropertiesUtil.getInstance().getProperty("username"));
         pc.setPassword(PropertiesUtil.getInstance().getProperty("password"));
         //pc.setPassword("welcome@1");
      } else {
        throw new UnsupportedCallbackException(callbacks[i], "Unrecognized Callback");
      }
  }
}