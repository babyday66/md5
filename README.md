# MD5 Service

REST API сервис для вычисления MD5 сумм текста.

## Технологический стек

- **Java 21**
- **Kotlin**
- **Spring Boot 3.3.0**
- **Maven**

## Требования

- Java 21 или выше
- Maven 3.8.1 или выше

## Сборка проекта

```bash
mvn clean package
```

## Запуск приложения

```bash
mvn spring-boot:run
```

Приложение будет доступно по адресу `http://localhost:8080`

## API Endpoints

### POST /api/md5/calculate

Вычисляет MD5 сумму переданного текста (JSON body).

**Request:**
```json
{
  "text": "hello"
}
```

**Response:**
```json
{
  "input": "hello",
  "hash": "5d41402abc4b2a76b9719d911017c592"
}
```

### GET /api/md5/calculate

Вычисляет MD5 сумму текста пере��анного через query параметр.

**URL:** `GET /api/md5/calculate?text=hello`

**Response:**
```json
{
  "input": "hello",
  "hash": "5d41402abc4b2a76b9719d911017c592"
}
```

## Примеры использования

### cURL

```bash
# POST запрос
curl -X POST http://localhost:8080/api/md5/calculate \
  -H "Content-Type: application/json" \
  -d '{"text":"hello"}'

# GET запрос
curl "http://localhost:8080/api/md5/calculate?text=hello"
```

### Python

```python
import requests

# POST
response = requests.post(
    'http://localhost:8080/api/md5/calculate',
    json={'text': 'hello'}
)
print(response.json())

# GET
response = requests.get(
    'http://localhost:8080/api/md5/calculate',
    params={'text': 'hello'}
)
print(response.json())
```

## Тестирование

```bash
mvn test
```

## Структура проекта

```
md5/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── com/md5service/
│   │   │       ├── Md5ServiceApplication.kt
│   │   │       ├── controller/
│   │   │       │   └── Md5Controller.kt
│   │   │       └── service/
│   │   │           └── Md5Service.kt
│   │   └── resources/
│   │       └── application.yml
│   └── test/
│       └── kotlin/
│           └── com/md5service/
│               └── service/
│                   └── Md5ServiceTest.kt
└── .gitignore
```

## Лицензия

MIT
