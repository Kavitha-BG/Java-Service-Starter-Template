# Java-Service-Starter-Template

Sugarfit Technical Assignment:

Functional Requirements

Please implement the following REST endpoints:

1. Health Check
    ● GET /health
    ● Returns the current status of the application.

2. Data Processor

    ● POST /example

        Request Body:
        {
        
        "userId": "123",
        "value": 42
        }

        
    ● Response Body:
        {
        "status": "SUCCESS",
        "requestId": "uuid-string"
        }
