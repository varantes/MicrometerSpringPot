# MicrometerSpringPot

MicrometerSpringPot é um projeto Spring Boot que demonstra a integração do Micrometer para monitoramento e observabilidade de aplicações.

## Visão Geral do Projeto

Este projeto é construído com Kotlin e Spring Boot 3.1.5, demonstrando o uso do Micrometer para rastreamento e coleta de métricas em uma aplicação web.

## Características

- Spring Boot Actuator para insights da aplicação
- Integração com Micrometer para métricas e rastreamento
- Zipkin reporter para rastreamento distribuído
- Capacidades web com Spring Boot Web Starter

## Pré-requisitos

- JDK 17
- Gradle (wrapper incluído)

## Compilando o Projeto

Para compilar o projeto, execute:

``` shell
./gradlew build
```


## Executando a Aplicação

Para executar a aplicação, use:


``` shell
./gradlew bootRun
```


## Dependências

- Spring Boot Starter Actuator
- Spring Boot Starter Web
- Jackson Module Kotlin
- Micrometer Tracing Bridge Brave
- Zipkin Reporter Brave
- Kotlin Reflect

## Desenvolvimento

Este projeto usa Spring Boot DevTools para uma experiência de desenvolvimento aprimorada. O hot reloading é suportado nativamente.

## Testes

JUnit é usado para testes. Execute os testes com:


``` shell
./gradlew test
```


## Configuração

O projeto usa o processador de configuração do Spring Boot para propriedades de configuração seguras.

## Contribuindo

Contribuições são bem-vindas. Por favor, certifique-se de seguir os padrões de codificação do projeto e envie pull requests para novas funcionalidades ou correções de bugs.
