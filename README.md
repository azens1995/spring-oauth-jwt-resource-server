# OAuth JWT Key Implementation

This repository enlists the JWT impelementation for the access and refresh token of OAuth.

## Description

1. Add the required dependencies for the project.
2. Configure the `application.properties` to hold public key exchange urls from oauth server.
3. Create the endpoint for testing.
4. Create the configuration class named `ResourceServerConfig` and extend it with `ResourceServerConfigurerAdapter`.
5. Use annotation `@EnableResourceServer` to mark the configuration as the auth resource server.

Note: Since OAuth server is used for receiving the public key, no any configuration is required in the `ResourceServerConfig`. All the exising code can be deleted.


## Usages

```curl
curl -H "Authorization:bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2OTUxNDY4OTgsInVzZXJfbmFtZSI6ImVrbGFrIiwiYXV0aG9yaXRpZXMiOlsicmVhZCJdLCJqdGkiOiI2OTk0ODE5My1jY2QzLTRiMjQtODExYi1kMzUwYjk0NDdkYWYiLCJjbGllbnRfaWQiOiJjbGllbnQiLCJzY29wZSI6WyJyZWFkIl19.Th1x7UeY72n3bKkzM8-M5iOG3eP9QidnDbik3Lprjjw" "http://localhost:9090/hello
```

Response
```text
Hello World!!
```

## References

[OAuth-Auth-Server](https://github.com/azens1995/spring-oauth-server/tree/public-key-exchange)
