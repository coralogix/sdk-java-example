# Coralogix Java SDK sample project
## This code is deprecated and will be removed in August 4, please use otel [java sdk instead](https://opentelemetry.io/docs/languages/java/)

This is a sample project which demonstrates the example of usage of [Coralogix Java SDK](https://mvnrepository.com/artifact/com.coralogix.sdk/coralogix-sdk).

## Prerequisites

* **JDK** 8+
* **JRE** 8+
* **Maven** 3.x

## Build

The main application code is presented in `com.coralogix.sdk.ExampleApp` class.

To build the project you need to execute the following command:

```bash
mvn package
```

After compilation you will have `target/` folder which will contain the `.jar` file with the test application.

## Run

To run the package you need to execute the following command:

```bash
export CORALOGIX_PRIVATE_KEY="YOUR_CORALOGIX_PRIVATE_KEY"

java -jar target/coralogix-sdk-example-1.0-SNAPSHOT.jar
```

## Extend

To use **Coralogix Java SDK** in your application you should add the appropriate dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.coralogix.sdk</groupId>
    <artifactId>coralogix-sdk</artifactId>
    <version>2.0.x</version>
</dependency>
```

where `2.0.x` should be replaced with the latest version from the [Maven](https://mvnrepository.com/artifact/com.coralogix.sdk/coralogix-sdk) repository.
