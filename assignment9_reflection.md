# 📓 Reflection – Domain Modeling & Class Diagram

---

## 1. Challenges Faced

Designing the domain model pushed me to think abstractly about which entities mattered most. At first, it was tempting to include too many classes, like AppointmentHistory or Rating. But I learned to simplify and focus on what delivers the core functionality.

Defining relationships (especially multiplicity) was tricky. For example, I struggled with whether a User should have multiple Appointments or just one active one. I resolved this by using a business rule that only one active appointment is allowed, but historical appointments can still be stored.

Naming attributes and methods clearly while keeping them meaningful was another challenge. Initially, I had methods like `confirm()` and `approve()` that overlapped in meaning. I refined them to make their roles specific.

---

## 2. Alignment with Prior Work

The domain model and class diagram align closely with earlier assignments:

- From **Assignment 4 (Requirements)**, entities like Appointment, Doctor, and Notification emerged directly from functional needs.
- From **Assignment 5 (Use Cases)**, I modeled interactions like "Book Appointment" and "Approve Appointment" using methods in respective classes.
- From **Assignment 8 (Activity/State Diagrams)**, workflows like sending reminders or managing availability became methods in Notification and Schedule.
  
This iterative layering helped ensure consistency across all design artifacts.

---

## 3. Design Trade-Offs

I debated whether to use inheritance for User → Doctor/Admin but opted not to. Even though it may reduce duplication, keeping them separate made it easier to define different responsibilities and enforce security rules specific to each role.

Another trade-off was between simplicity and extensibility. For now, I excluded detailed medical logic or feedback mechanisms to keep the model focused. This made the class diagram easier to maintain and understand.

---

## 4. Lessons Learned

I learned that **object-oriented design** is more than just drawing boxes and lines — it's about thinking in terms of responsibilities, data ownership, and interactions.

- **Relationships matter**: The way classes connect impacts system behavior.
- **Every method needs a reason**: I ensured each method aligned with a user goal or system function.
- **Balance abstraction and realism**: I avoided overcomplicating the model while still reflecting the system's logic.

Ultimately, this assignment helped me deeply understand the system’s structure and think critically about design quality.
