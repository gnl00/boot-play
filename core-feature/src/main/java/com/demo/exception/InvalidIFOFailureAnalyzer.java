package com.demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Slf4j
public class InvalidIFOFailureAnalyzer extends AbstractFailureAnalyzer<InvalidIFOException> {

    {
        log.info("Initial InvalidIFOFailureAnalyzer");
    }

    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, InvalidIFOException cause) {
        return new FailureAnalysis(getDescription(cause), getAction(), cause);
    }

    public String getDescription(InvalidIFOException cause) {
        return InvalidIFOException.buildMessage(cause.getMessage());
    }

    public String getAction() {
        return "Change your configuration to start with IFO";
    }
}
