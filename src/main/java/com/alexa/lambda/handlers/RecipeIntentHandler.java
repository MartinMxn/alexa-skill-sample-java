package com.alexa.lambda.handlers;

import com.alexa.lambda.utils.Utils;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.impl.IntentRequestHandler;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Response;

import java.util.Optional;
import java.util.ResourceBundle;

public class RecipeIntentHandler implements IntentRequestHandler {

    @Override
    public boolean canHandle(HandlerInput input, IntentRequest intentRequest) {
        return intentRequest.getIntent().getName().equals("RecipeIntent");
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput, IntentRequest intentRequest) {
        final ResourceBundle Text = Utils.getResourceBundle(handlerInput, "Text");

        return handlerInput.getResponseBuilder()
                .withSpeech("TBD")
                .withReprompt("TBD")
                .build();
    }
}
