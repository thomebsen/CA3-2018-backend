# jwtBackend

This backend-project is made to work with the following projects:

Frontend:	https://github.com/Srax/CA3-2018-frontend <br>
Native-app:	https://github.com/Zenzus/CA3-2018-native

<h3>Getting started:</h3>

- Clone the project
- Do either of the following two steps:

  1. Connect to our remote database:
    - Create a Persistence Unit and make it connect to the remote database with these settings:
    
    url: 138.68.73.7/remoteDB <br>
    user: testuser <br>
    password: kode1234
    
  2. Create your own database
    - Create the connection from your IDE(fx. netbeans) to the new database
    - Create a Persistence Unit and use the new connection
    - Clean and build the project.
    - Populate the database with by running the “SetupTestUsers”-class in the “utils”-package.

- Run the project and keep the server running to let the frontend and native-app work properly.
# SemPro-2018-Backend
