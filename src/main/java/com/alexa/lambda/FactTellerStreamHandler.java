package com.alexa.lambda;

import com.alexa.lambda.handlers.*;
import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class FactTellerStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
            .addRequestHandlers(
                // add all your intent handlers
                new LaunchHandler(),
                new HelpIntentHandler(),
                new RecipeIntentHandler(),
                new RepeatIntentHandler(),
                new ExitIntentHandler(),
                new ErrorHandler(),
                new SessionEndedHandler()
            )
            // Add your skill id below
            // .withSkillId("")
            .build();
    }

    public FactTellerStreamHandler() {
        super(getSkill());
    }
}
