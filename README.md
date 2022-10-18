# Description bikleek-frontjsp
 Project for Spring Boot MVC with JSP(Java Server Pages). Technical Test Dev Web. Bikleek Company.
 Dependencias:
 -Spring Web
 -Spring Boot
 
 El proyecto base fue creado usando como ayuda https://start.spring.io/
 
 
# To run
Dentro de la ruta src/main/resources ubicar el archivo application.proporties y modificar la cadena de conexión de MySQL por la propia en localhost. No olvide especificar correctamente el username y password de la base datos, así como el nombre de la misma. Debe existir una base de datos previamente creada en el sql server llamada igual que en el string de conexión, en este caso "bikleek".

# Rutas
Por defecto: http://localhost:8080
Listar todos los empleados: http://localhost:8080/employees
Crear empleado: http://localhost:8080/employees/create
Editar Empleado http://localhost:8080/employees/edit/{id}
Eliminar Empleado http://localhost:8080/employees/edit/{id}

# Observaciones
El proyecto debe correr en la ruta https://localhost:8080/

Solo funciona. correctamente las vistas para listar, crear, leer. No está editando ni eliminando exitosamente.

# Consumo de API BikLeek-api-rest
Se realizo utilizando RestTemplate



