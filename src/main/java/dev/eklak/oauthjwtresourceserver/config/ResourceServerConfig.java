package dev.eklak.oauthjwtresourceserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Value("${publickey}")
    private String publicKey;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws
        Exception {
        // Configure the token store
        resources.tokenStore(tokenStore());
    }

    @Bean
    public TokenStore tokenStore() {
        // Declares the token store and adds it to the spring context
        return new JwtTokenStore(jwtAccessTokenConverter());
    }
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        // Creates an instance of the new AccessTokenConverter object
        var converter = new AdditionalClaimAccessTokenConverter();
        converter.setVerifierKey(publicKey);
        return converter;
    }
}
