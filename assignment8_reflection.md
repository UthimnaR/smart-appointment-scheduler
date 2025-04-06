# 📓 Reflection – Assignment 8

---

## 🔄 Object State Modeling Challenges

One major challenge was choosing the right level of detail for object states. For example, the "Appointment" object could have multiple sub-states like "Pending Approval," "Missed," or "Rescheduled." Including too many could clutter the diagrams, but too few might miss edge cases.

---

## 🧩 Activity Workflow Modeling Challenges

The activity diagrams required careful thought about actor responsibilities and decisions. It was challenging to model conditional flows clearly, especially for cancellation and admin approval workflows. Using swimlanes in more complex tools (not mermaid) would make roles clearer.

---

## 🔁 Aligning with Agile Artifacts

Mapping these diagrams back to user stories and sprints helped validate that our features are user-centric. For example, the Book Appointment diagram directly maps to Sprint 1, User Story 2. Agile planning helped maintain scope.

---

## 🔍 State Diagrams vs. Activity Diagrams

State diagrams focus on the lifecycle of objects like Appointments and Notifications, showing how they change over time. Activity diagrams represent workflows and are more user/actor-centric. State modeling helps backend/data logic, while activity diagrams inform UI and frontend interactions.

---

## 💡 Lessons Learned

- Clear naming of states and transitions is critical.
- Mermaid is useful for fast prototyping, but dedicated UML tools offer better clarity for swimlanes and guards.
- Understanding user needs and system flow ensures better alignment between design and implementation.
