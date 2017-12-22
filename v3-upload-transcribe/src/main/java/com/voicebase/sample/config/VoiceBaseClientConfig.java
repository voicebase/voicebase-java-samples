package com.voicebase.sample.config;

import com.voicebase.sample.v3client.VoiceBaseV3MinimalClient;
import com.voicebase.sample.v3client.VoicebaseV3MinimalClientImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VoiceBaseClientConfig {
    @Bean(name = "voicebase")
    public VoiceBaseV3MinimalClient voicebase(@Value("token") final String voicebaseBearerToken) {
        return new VoicebaseV3MinimalClientImpl(voicebaseBearerToken);
    }
}
