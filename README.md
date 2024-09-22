# Student Management System - BackEnd
### Installation
1. **Clone the Repository**\
   Clone and open the project using IDEA.
   ```bash
   git clone https://github.com/YasiruRavishka/StudentManagementSystem-BackEnd.git
   ```
2. **Set Up the Database**
   ```mysql
   CREATE DATABASE SIMS;
   ```
3. **Configure Database Connection**\
   Path-
   ```
   ./src/main/resources/application.yml
   ```
   Open that file and configure the following preferences with your pc.
   ```yml
   datasource:
    url: jdbc:mysql://localhost:3306/SIMS
    username: root
    password: 12345
   ```
### Run the Loader.java
   ```
   ./src/main/java/edu/icet/Loader.java
   ```
### Use the front-end application
  https://github.com/YasiruRavishka/StudentManagementSystem-FrontEnd
   
