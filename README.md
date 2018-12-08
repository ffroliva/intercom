# intercom

Take Home Test

## About the stack of technologies

I have chosen SpringBoot because it is much easier to configure and plays well with other tech stacks. I have also used a REST API and SpringData JPA with an H2 database for future expansion of the project.

I used Spring Initializer to add all the dependencies and create a blank working project with all my configurations.

## Build

```
mvn clean install
```

## Run

```
mvn spring-boot:run
```

## Available URLs

Front-end entry point: http://localhost:8080

## Available API URLs

- http://localhost:8080/customers

*Datails:* This URL is responsible for calling the customer service that will call the customer repository
which will read the customer.txt file in JSON format and transform it into Customer objects.

- http://localhost:8080/customers/within-distance/${distance}

*Details:* This URL takes an input of a number and uses it to filter the number of a customers within a
distance range in comparison to Intercom's Dublin office. The range is closed, meaning that the number passed
in as parameter is considered in the filtering process.
