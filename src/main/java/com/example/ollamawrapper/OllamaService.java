package com.example.ollamawrapper;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OllamaService {
    private final String baseUrl = "http://localhost:11434"; // Replace with your Ollama server URL
    private final RestTemplate restTemplate = new RestTemplate();

    public String generateResponse(String prompt) {
        String url = baseUrl + "/generate"; // Update as per your Ollama API endpoint
        // Make a POST request with prompt to the Ollama API
        return restTemplate.postForObject(url, prompt, String.class);
    }
}

