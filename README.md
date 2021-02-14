# spring-thymeleaf-poc

Minimal PoC for Server-rendered frontend using Thymeleaf and it´s Spring integration. 
## Essentials
 **Run Spring Boot application:**
`mvn spring-boot:run`

 **Demo location:**
`http://localhost:8081/ui/`
## Details
A content object made of two `String` `key` and `value` and a `java.util.Date` `date` field is sent to the backend using a html form and *validated* there. The `content.toString` is written to stdin.

This PoC showcases:
* Custom error page
* Html Form with backend validation
* Click button to download sample json
* Use of Resource Bundles
* How to place and reference css
* How to include a favicon to avoid the annoying 404 on the web dev tools
* Use Bootstrap's datepicker and parse the date.


See custom error page
`http://localhost:8081/ui/throwMe`

## External references

* [Thymeleaf+Spring](https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html)
* [Webjar+Spring MVC](https://www.webjars.org/documentation#springmvc)
* [Bootstrap datepicker Options](https://bootstrap-datepicker.readthedocs.io/en/latest/options.html#)