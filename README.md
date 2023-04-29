
# User Management

This is a small spring boot project uses CRUD operation to manage users


## Resource used

**Framework:** SpringBoot

**Language:** Java

**Dependency:** Spring Boot DevTools , Spring Web

**Data Structure:** ArrayList

## Data Flow

**Controller** 

**Service** 

**Repository** 
## API Reference

#### Get all items

```http
  GET /getalluser
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `User` | `string` | Return all users |

#### POST item

```http
  POST /addUser
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `User`      | `string` | Add Individual user |

#### Get Individual user

```http
  GET /getUser/{userid}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `User` | `string` | Return user based on id |

#### Delete particular user

```http
  DELETE /delete/{userid}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `User` | `string` | delete user |

#### Update user phone number

```http
  Update /updateUserInfo/{userid}/{phoneNO}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `User` | `string` | Update phoneNO|

## Features

- Print All users
- Add individual user
- Get user details based on ID
- Delete user
- Update user info based on ID


## Lessons Learned

The lesson that i have learned while building the project is importance of dependency injection, with the help of dependency injection I made my code more scalable and decoupled I have created differnet package of each function, because of this my code became scalable.


## Summary

This small springboot project will manage user, Ihave used basic CRUD operation to manage users by getting all user info at once , get individual user based on his ID , Add particular user to the user list, Delete particular user based on ID , Update user info based on ID.

