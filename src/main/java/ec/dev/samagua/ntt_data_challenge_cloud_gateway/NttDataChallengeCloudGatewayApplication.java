package ec.dev.samagua.ntt_data_challenge_cloud_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NttDataChallengeCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NttDataChallengeCloudGatewayApplication.class, args);
    }

}
