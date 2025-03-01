


# Architecture Overview

## C4 Context Diagram

```mermaid
graph LR
  A[Patient] -->|Books Appointment| B[Appointment System]
  C[Healthcare Provider] -->|Manages Schedule| B[Appointment System]
  B[Appointment System] --> D[Database]
  B[Appointment System] --> E[Notification System]


graph LR
  A[Patient Web App] -->|Makes Requests| B[Backend API]
  B[Backend API] -->|Fetches Data from| C[Database]
  B[Backend API] -->|Sends Notifications| D[Notification System]
