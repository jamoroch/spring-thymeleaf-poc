# spring-thymeleaf-poc

Minimal PoC for Server-rendered frontend using Thymeleaf and it´s Spring integration. 

A content object made of two `String` `key` and `value` and a `java.util.Date` `date` field is sent to the backend using a html form and *validated* there. The `content.toString` is written to stdin.

This PoC showcases:
* Exception handling
* Html Form with backend validation
* Click button to download sample json
* Use of Resource Bundles
* How to place and reference css
* How to include a favicon to avoid the annoying 404 on the web dev tools
* Use Bootstrap's datepicker and parse the date.

Start demo at 
`http://localhost:8081/ui/`

See exception handling
`http://localhost:8081/ui/throwMe`
