package com.bytedance.apm.agent.instrumentation.p469io;

/* renamed from: com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource */
public interface StreamCompleteListenerSource {
    void addStreamCompleteListener(StreamCompleteListener streamCompleteListener);

    void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener);
}
