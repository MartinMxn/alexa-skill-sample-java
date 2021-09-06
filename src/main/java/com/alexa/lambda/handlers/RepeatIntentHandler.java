package com.alexa.lambda.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.impl.IntentRequestHandler;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Response;

import java.util.Map;
import java.util.Optional;

public class RepeatIntentHandler implements IntentRequestHandler {

    @Override
    public boolean canHandle(HandlerInput input, IntentRequest intentRequest) {
        return intentRequest.getIntent().getName().equals("AMAZON.RepeatIntent");
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput, IntentRequest intentRequest) {
        final Map<String, Object> sessionAttributes = handlerInput.getAttributesManager().getSessionAttributes();
        return handlerInput.getResponseBuilder()
                .withSpeech(String.valueOf(sessionAttributes.get("speakOutput")))
                .withReprompt(String.valueOf(sessionAttributes.get("repromptSpeech")))
                .build();
    }
}
