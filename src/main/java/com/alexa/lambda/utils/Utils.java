package com.alexa.lambda.utils;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;

import java.util.Locale;
import java.util.ResourceBundle;

public class Utils {

    public static ResourceBundle getResourceBundle(HandlerInput handlerInput, String bundleName) {
        final Locale locale = new Locale(handlerInput.getRequestEnvelope().getRequest().getLocale());
        return ResourceBundle.getBundle(bundleName, locale);
    }
}
