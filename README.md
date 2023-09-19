# OAuth JWT Key Implementation

This repository enlists the JWT impelementation for the access and refresh token of OAuth.

## Description

1. Add the required dependencies for the project.
2. Configure the `application.properties` to hold the `jwt.key` symmetric key used for signing tokens.
3. Create the endpoint for testing.
4. Create the configuration class named `ResourceServerConfig` and extend it with `ResourceServerConfigurerAdapter`.
5. Use annotation `@EnableResourceServer` to mark the configuration as the auth resource server.
6. Create the bean  for JWT Token configurer with jwt key.
7. Create the bean for the token store with JWT Token store.
8. Configure the resource to use the token store.


## Usages

```curl
curl -H "Authorization:bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2OTUxNDY4OTgsInVzZXJfbmFtZSI6ImVrbGFrIiwiYXV0aG9yaXRpZXMiOlsicmVhZCJdLCJqdGkiOiI2OTk0ODE5My1jY2QzLTRiMjQtODExYi1kMzUwYjk0NDdkYWYiLCJjbGllbnRfaWQiOiJjbGllbnQiLCJzY29wZSI6WyJyZWFkIl19.Th1x7UeY72n3bKkzM8-M5iOG3eP9QidnDbik3Lprjjw" "http://localhost:9090/hello
```

Response
```text
Hello World!!
```

## References

[OAuth-Auth-Server](https://github.com/azens1995/spring-oauth-server/tree/auth-server-jwt)
