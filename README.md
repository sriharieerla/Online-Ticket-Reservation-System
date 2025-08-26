# 🎟️ Online Ticket Reservation System (Spring Boot + MySQL)

## 📌 Project Info

The **Online Ticket Reservation System** is a full-stack application built with **Spring Boot** and **MySQL** to simulate real-world ticket booking (like bus, train, or movie shows).  
It allows users to **register, log in, book tickets, view bookings, and cancel reservations** — ensuring **transactional consistency** and **secure password storage** (SHA-256 hashing).

This project demonstrates **end-to-end ticket management** and can be extended for real-world use cases.

---

## 🚀 Features

- 👤 **User Registration & Login** (SHA-256 hashed passwords for security)
- 🎭 **Create & List Shows** (admin can create shows/movies/events)
- 🎟️ **Book Tickets** with seat availability check
- ❌ **Cancel Bookings** with transactional rollback safety
- 🗄️ **MySQL Integration** for persistence
- ⚡ **Spring Boot REST APIs** for backend logic

---

## 🛠️ Tech Stack

- **Backend**: Spring Boot (Java)
- **Database**: MySQL
- **ORM**: Hibernate / JPA
- **Security**: SHA-256 password hashing
- **Build Tool**: Maven

---

## ⚙️ Step-by-Step Execution

### 1️⃣ Prerequisites

- Install [Java JDK 17+](https://adoptium.net/)
- Install [Maven](https://maven.apache.org/)
- Install [MySQL](https://dev.mysql.com/downloads/) and create database `ticketdb`

```sql
CREATE DATABASE ticketdb;
```
