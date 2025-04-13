# 🧱 Class Diagram – Smart Appointment Scheduling System

```mermaid
classDiagram
    class User {
        -userId: String
        -name: String
        -email: String
        -password: String
        -role: String
        +login()
        +logout()
        +updateProfile()
    }

    class Doctor {
        -doctorId: String
        -name: String
        -specialty: String
        -availability: String
        +updateAvailability()
        +approveAppointment()
    }

    class Appointment {
        -appointmentId: String
        -date: Date
        -time: String
        -status: String
        -notes: String
        +book()
        +cancel()
        +reschedule()
    }

    class Notification {
        -notificationId: String
        -message: String
        -sentAt: Date
        -type: String
        +send()
        +schedule()
    }

    class Schedule {
        -scheduleId: String
        -availableSlots: List
        +updateSlots()
        +viewAvailability()
    }

    class Admin {
        -adminId: String
        -name: String
        -contact: String
        +viewReports()
        +manageUsers()
    }

    class Report {
        -reportId: String
        -generatedAt: Date
        -content: String
        +generate()
        +export()
    }

    %% Relationships
    User "1" -- "0..*" Appointment : books
    Appointment "1" -- "1" Doctor : assignedTo
    Appointment "0..1" -- "0..*" Notification : triggers
    Doctor "1" -- "1" Schedule : has
    Admin "1" -- "0..*" Report : creates
```

---

### 🧠 Explanation of Design Decisions

- Chose **composition** for Doctor → Schedule (a doctor manages their own availability).
- Appointment is the central class, linked to both **User** and **Doctor**.
- Added **Notification** class to reflect reminder logic from prior assignments.
- Admin role separated from User to follow SRP (Single Responsibility Principle).
- Used `List` as a type for available slots in `Schedule` for better real-time modeling.

