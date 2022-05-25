Doggy Day Care API
------------------------

Project Description
This API is designed for a Doggy Day Care in which the user can make and update reservations for boarding, check in and out dogs from day care, and check the database of dogs. It uses both SOAP and RESTful APIs that function both independently and through a consumer API.

------------------------

Technologies Used
- Java - Version 1.8
- Spring Boot - Version 2.6.7
- Spring Web - Version 2.6.7
- Spring Data JPA - Version 2.6.4
- PostgreSQL - Version 42.3.4
- SL4J - Version 1.7.36
- Spring Tool Suite - Version 4.14.0.RELEASE
- Postman - Version 9.19.0
- DBeaver - Version 22.0.3.202204170718

------------------------

Features
Some of the features in this project:
- Make requests to see all dogs in the database, as well as relevant information, including whether the dog's vet records are in the system.
- Allow the user to remove and add dogs to the database.
- User can make and update reservations for boarding.
- A Check In and Check Out service to allow the user to see which dogs are currently in day care.

------------------------

To-do list:

- Implement Unit testing.
- Adjust the consumer API
- Improve logging features

------------------------

Getting Started

1. Clone the project into the location of your choosing.
2. Edit the application properties file with updated credentials for your database.
3. Adjust the ports as needed. Ensure that all applications are running on different ports.
4. Run ALL programs.
5. Once all of the programs are running, insert your data into your database.
6. Use Postman to test your endpoints and ensure they are working correctly.

------------------------

Usage

In Postman, these are the links the endpoints that this program supports.

- GET: http://localhost:8089/doggy/view
- POST: http://localhost:8089/doggy/add
- DELETE: http://localhost:8089/doggy/remove
- GET: http://localhost:8089/dogsincare
- POST: http://localhost:8089/checkin
- DELETE: http://localhost:8089/checkout
- GET: http://localhost:8089/reservation/view
- GET: http://localhost:8089/reservation/view/{id}
- POST: http://localhost:8089/reservation/save

------------------------
