# intercom

Take Home Test

## Build

mvn clean install

## Run

mvn spring-boot:run

## Available URLs

http://localhost:8080/customers
Datails: This URL is responsable for calling the customer service that will call the customer repository which will read the customer.txt file in JSON format and transform it into Customer objects.

http://localhost:8080/customers/within-distance/${number}
Details: This URL takes an input of a number and uses it to filter the number of a users within a distance range in relation to intercom dublin office. The range is closed, meaning that the number passed as parameter counts is consided in the filtering. 
