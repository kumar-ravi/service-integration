package com.api.integtation.serviceintegration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class SampleAPITest {

  private RestTemplate restTemplate = new RestTemplate();

  @Test
  public void shouldVerifySampleEndpoint(){
    String result = restTemplate
        .getForObject("https://spinnaker-sr-api.apple.com/applications", String.class);

    assertThat(result).isEqualTo("200");

  }


}
