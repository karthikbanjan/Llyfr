

[![Code Size](https://img.shields.io/github/languages/code-size/karthikbanjan/Llyfr?label=Code%20Size)]() 
[![Java](https://img.shields.io/github/languages/top/karthikbanjan/Llyfr)]()


# Llyfr - An eBook Repository

An eBook repository built using Bootstrap and Spring Boot. It has both view and api functionalities. Uses PostgreSQL for database. This is also part of my 7th semester mini-project.




## API Reference

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | /api/hello | Returns a message indicating that the server is up and running. |
| POST   | /api/ebooks/new | Accepts a new eBook as a request body and saves it. Returns the saved eBook in the response body. |
| GET    | /api/ebooks/{id} | Accepts an eBook id as a path variable and returns the corresponding eBook if it exists. Returns a 404 NOT FOUND error if the eBook is not found. |
| GET    | /api/ebooks | Returns a paginated list of all eBooks. Accepts a `pageNumber` query parameter to specify the page number (defaults to 0). |

## Tech Stack

**View:** Bootstrap and Thymeleaf

**Server:** Java (Spring Boot)


## Acknowledgements

 - Project Gutenberg for inspiration.
 - Katherine Oelsner for the handy readme helper.

