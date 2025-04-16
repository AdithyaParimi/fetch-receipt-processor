# 📄 Fetch Receipt Processor

This is a backend application for processing retail receipts and calculating reward points based on specific business rules.

---

## 🔧 Tech Stack

- Java 17
- Spring Boot 3.2.x
- Maven
- In-memory store using HashMap

---

## 🚀 How to Run

### 🔹 1. Prerequisites

- Java 17 installed
- Terminal access
- Maven or use provided `mvnw` wrapper
- (Optional) Postman or `curl` for testing

### 🔹 2. Start the App

```bash
./mvnw spring-boot:run
```

## API Endpoints & Sample Usage
### POST /receipts/process
* Submits a receipt and returns a receipt ID.
*  Request Example
```{
  "retailer": "Target",
  "purchaseDate": "2022-01-01",
  "purchaseTime": "13:01",
  "items": [
    {
      "shortDescription": "Pepsi - 12 pack",
      "price": "5.99"
    }
  ],
  "total": "5.99"
}
```
* cURL Command
```
curl -X POST http://localhost:8080/receipts/process \
  -H "Content-Type: application/json" \
  -d '{
    "retailer": "Target",
    "purchaseDate": "2022-01-01",
    "purchaseTime": "13:01",
    "items": [
      {"shortDescription": "Pepsi - 12 pack", "price": "5.99"}
    ],
    "total": "5.99"
  }'
```

* Sample Response
`{
  "id": "128e89c3-bbc4-4693-8f05-35ac8cf81a3e"
}
`