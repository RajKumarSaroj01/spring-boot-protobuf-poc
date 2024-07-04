# spring-boot-protobuf-poc

Project show how can we use protobuf with Spring boot and comparison among response in protobuf, json with key value and json with array.
Each API is designed to send the same set of 100 records in its own format.

### Observation
* There is a slight difference in response size between the Protobuf and JSON with array APIs.
* Additional configuration is required to integrate Protobuf.
* For the JSON with array API, developers need to be extra careful when generating and consuming the response. Since there are no identifiers for values, empty fields must be filled with null or a default value.
Below are the created APIs, their sample responses and size.
### Protobuf API
```
http://localhost:8080/v1/test/proto/students
```
``` 
sample response binary 
```
```
response size 4.47KB
```
### JSON with key value API
```
http://localhost:8080/v1/test/json/students
```
```
sample response 
[
    {  
     "id":100,"name":"Random name 1","marks":56.8,"place":"New York",
    "height":5.6
    }
]
```
```
response size 7.92KB
```
### JSON with array API
```
http://localhost:8080/v1/test/json-array/students
```
```
sample response 
[
    [
        100,"Random name 1",56.8,"New York",5.6
    ]
]
```
```
response size 4.31KB
```