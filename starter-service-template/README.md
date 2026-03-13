
# Starter Service Template

## Endpoints

### Health Check
GET /health

Response
{
 "status": "UP"
}

### Data Processor
POST /example

Request
{
 "userId": "123",
 "value": 42
}

Response
{
 "status": "SUCCESS",
 "requestId": "uuid-string"
}

## Run

mvn spring-boot:run
