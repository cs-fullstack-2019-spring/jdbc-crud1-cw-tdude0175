# CRUD Operations with JDBC

## Write each Exercise as a Separate Function called from main(), ALL interaction with the database should be done via JDBC

For this exercise you will create a ```Company``` Database that contains a single table called ```Employee```.

### Exercise 1:
* Create a new Postgres datasource ```2019_05_20```
* Create a new database called ```Company```
* Create a new table in the database called ```Employee```
* NOTE: Go back and update your datasource properties to point to the ```Company``` database

The ```Employee``` table should have the following fields:

```
Employee ID - Which should automatically increment for each new record added and should also be the primary key
Employee First Name
Employee Last Name
Employee Job Position 
Employee Salary
```

* Insert 4 new Employees using JDBC INSERT
```
Chuck, Jones, MANAGER, 100000
Marty, Krofft, ENGINEER, 80000
Peter, Barker, DEVELOPER, 50000
Sam, Sham, DEVELOPER, 35000
Ellen, Musk, DEVELOPER, 38000
```
* SELECT all Employee records from the database
* SELECT only the DEVELOPERS from the table
* SELECT only the Employees making more than 50000
* INSERT a new ENGINEER, Thomas Tank, with a salary of 75000
* UPDATE the salary for Ellen Musk and change her salary to 42000
* DELETE Sam Sham

### Challenge
Refactor your program so the User can interactively manage employees in the database (e.g.)
* List all Employees
* Allow the User to add a new Employee
* Allow the User to select an Employee in the database
* Allow the User to edit or delete a selected Employee



