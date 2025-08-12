# eRaktAdhikosh – Blood Bank Management System (Service)

## 📌 Overview

The **Service** module of **eRaktAdhikosh** is the backend REST API responsible for managing all core operations of the Blood Bank Management System.
It handles **data processing, business logic, and secure database interactions** for functionalities such as donor registration, blood inventory management, request processing, and hospital coordination.

---

## ⚙️ Features (Backend)

* **RESTful API Endpoints** for donors, recipients, and administrators.
* **Blood Inventory Management** – Track and update available blood units.
* **Donor & Recipient Management** – Register, update, and view records.
* **Request Handling** – Hospitals and patients can request blood units.
* **Secure Authentication & Authorization** (Role-based access).
* **Database Integration** – Persistent storage using MySQL.
* **Exception Handling & Validation** for robust service performance.

---

## 🛠️ Tech Stack (Service)

* **Backend Framework**: Java Spring Boot
* **Database**: MySQL
* **ORM**: Hibernate / JPA
* **Security**: Spring Security (JWT Authentication)
* **Build Tool**: Maven
* **API Testing**: Postman / Swagger UI

---

## 📂 Folder Structure

```plaintext
eRaktAdhikosh_Service/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.eraktadhikosh/      # Main package
│   │   │   │   ├── controller/         # REST Controllers
│   │   │   │   ├── service/            # Service Layer
│   │   │   │   ├── repository/         # JPA Repositories
│   │   │   │   ├── model/               # Entity Classes
│   │   │   │   └── config/              # Security & App Config
│   │   ├── resources/
│   │   │   ├── application.properties   # DB & App Config
│   │   │   └── data.sql                 # Sample Data
│   └── test/                            # Unit & Integration Tests
└── README.md
```

---

## 🚀 Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/eRaktAdhikosh_Service.git
cd eRaktAdhikosh_Service
```

### 2️⃣ Configure the database

Edit `src/main/resources/application.properties` and set your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/eraktadhikosh
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Build and run the application

```bash
mvn clean install
mvn spring-boot:run
```

The backend will run on **`http://localhost:8080/`**.

---

## 📡 API Documentation

Once the service is running, API documentation is available at:
**Swagger UI** → `http://localhost:8080/swagger-ui.html`

---

## 🔗 Related Repositories

* [eRaktAdhikosh UI (Angular)](https://github.com/vaishnavi-patil-04/eRaktAdhikosh_BDMS_UI)

---

## 👨‍💻 Contributors

* **Vaishnavi Patil** **Vagisha Sharma** **Vaishnavi Tathe**

