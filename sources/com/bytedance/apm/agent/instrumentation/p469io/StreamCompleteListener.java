package com.bytedance.apm.agent.instrumentation.p469io;

/* renamed from: com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener */
public interface StreamCompleteListener {
    void streamComplete(StreamCompleteEvent streamCompleteEvent);

    void streamError(StreamCompleteEvent streamCompleteEvent);
}
