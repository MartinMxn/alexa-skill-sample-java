package com.alexa.lambda.handlers;

import com.alexa.lambda.utils.Utils;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;
import java.util.ResourceBundle;

public class ErrorHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return true;
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        final ResourceBundle messages = Utils.getResourceBundle(handlerInput, "Text");
        return handlerInput.getResponseBuilder()
                .withSpeech(messages.getString("ERROR_PROMPT"))
                .withReprompt(messages.getString("ERROR_PROMPT"))
                .build();
    }
}
