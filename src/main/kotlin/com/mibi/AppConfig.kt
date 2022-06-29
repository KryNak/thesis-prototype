package com.mibi

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain


@Configuration
class AppConfig {

    @Configuration
    class SecurityConfiguration {

        @Bean
        fun filterChain(http: HttpSecurity): SecurityFilterChain {
            http.authorizeRequests()
                .antMatchers("*")
                .permitAll()

            http.requiresChannel()
                .requestMatchers({ r -> r.getHeader("X-Forwarded-Proto") != null })
                .requiresSecure()
            return http.build()
        }
    }

}
