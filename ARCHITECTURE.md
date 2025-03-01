


graph LR
  A[Patient Web App] -->|Makes Requests| B[Backend API]
  B[Backend API] -->|Fetches Data from| C[Database]
  B[Backend API] -->|Sends Notifications| D[Notification System]


## C4 Model
The system architecture is based on the C4 Model, which focuses on:
- **Level 1: System Context Diagram**
- **Level 2: Container Diagram**
- **Level 3: Component Diagram**
- **Level 4: Code Diagram**

### System Context Diagram
The system interacts with:
- **Patients**: Patients book and manage appointments.
- **Doctors**: Doctors manage their appointments and availability.
- **Admin**: Admins oversee the system and handle user data.
- **External Email Service**: Sends appointment reminders.

### Container Diagram
The system consists of the following containers:
- **Frontend (React.js)**: Displays the user interface and sends requests to the backend.
- **Backend (Node.js)**: Handles business logic, API requests, and connects to the database.
- **Database (MongoDB)**: Stores user, appointment, and schedule data.
- **Email Service (NodeMailer)**: Sends email notifications.

### Component Diagram
The main components in the backend include:
- **Appointment Service**: Manages the logic for creating, updating, and deleting appointments.
- **Notification Service**: Sends email reminders and confirmations.
- **User Service**: Handles user authentication and management.

## Deployment Architecture
The system will be deployed using:
- **Frontend**: Deployed on a cloud service such as Netlify or Vercel.
- **Backend**: Hosted on a cloud platform like AWS or Heroku.
- **Database**: MongoDB Atlas or an equivalent cloud database service.

## Technologies Used
- **Frontend**: React.js
- **Backend**: Node.js with Express
- **Database**: MongoDB
- **Email Service**: NodeMailer
- **Deployment**: AWS, Netlify, MongoDB Atlas

![System Context Diagram]("C:\Users\Uthimna\Pictures\Screenshots\31b65c1d-5d55-4ca5-b9f4-13f8a5b3282d.webp")


