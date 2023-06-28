# Javax Validations

### Usage
`POST` <br>
`localhost:8080/api/v1/register`

Sample successful request: <br>
```json
{
  "name": "Atif",
  "eMail": "me@atif.dev",
  "yearOfBirth": "1947",
  "lifeScore": "1.1",
  "registerDateTime": "2023-01-01T01:00:00.000Z",
  "lastLoginDate": "2023-02-02",
  "retirementDate": "2077-01-01",
  "expireDateTime": "2027-01-01T01:00:00.000Z",
  "gravity": "10",
  "temperatureKelvin": "100",
  "temperatureCelsius":"-173",
  "loss": "-200",
  "relations": ["Neo", "Trinity", "Smith", "Morpheus", "Oracle"],
  "bestRelationName": "Lia",
  "identity": "ad3456789012345678901",
  "piNumber": 3.14,
  "approveGdpr": true,
  "isHacker": false
}
```
<br> <br>
Sample failure request:

```json
{
  "name": "",
  "eMail": "me@atif.",
  "yearOfBirth": "1929",
  "lifeScore": "11.1",
  "registerDateTime": "2024-01-01T01:00:00.000Z",
  "lastLoginDate": "2025-02-02",
  "retirementDate": "2001-01-01",
  "expireDateTime": "2001-01-01T01:00:00.000Z",
  "gravity": "-10",
  "temperatureKelvin": "-100",
  "temperatureCelsius":"173",
  "loss": "200",
  "relations": ["Neo", "Trinity", "Smith", "Morpheus", "Oracle", "Women In Red"],
  "bestRelationName": "Li",
  "identity": "a23456789012345678901",
  "piNumber": 13.14,
  "approveGdpr": false,
  "isHacker": true
}
```
<br> <br>