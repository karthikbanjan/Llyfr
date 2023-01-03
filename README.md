

[![Code Size](https://img.shields.io/github/languages/code-size/karthikbanjan/Llyfr?label=Code%20Size)]() 
[![Java](https://img.shields.io/github/languages/top/karthikbanjan/Llyfr)]()


# Llyfr - An eBook Repository

An eBook repository built using Bootstrap and Spring Boot. It has both view and api functionalities. Uses PostgreSQL for database. This is also part of my 7th semester mini-project.


## Preview

![image](https://user-images.githubusercontent.com/92287364/210415147-da1787cb-4f95-4302-8dd9-b45fee73dbe4.png)
![image](https://user-images.githubusercontent.com/92287364/210415196-fb27b5e3-9a18-4503-b79d-c4c551d2173f.png)
![image](https://user-images.githubusercontent.com/92287364/210415216-a5499717-7a4d-4a99-922c-9bc0debbfeca.png)
![image](https://user-images.githubusercontent.com/92287364/210415245-ceb243d1-2b70-4d12-b1ac-0371c262105c.png)
![image](https://user-images.githubusercontent.com/92287364/210415271-c22a8280-5725-4938-af26-360da2414eff.png)
![image](https://user-images.githubusercontent.com/92287364/210415292-49f07fe9-da75-40a3-bec8-dd9908ed74ec.png)
![image](https://user-images.githubusercontent.com/92287364/210415321-3875f9cc-6e3e-42f1-a819-b7b9ded377b1.png)


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

