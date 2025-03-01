#### **C4 Container Diagram**
```markdown
## C4 Container Diagram

```mermaid
graph LR
  A[Patient Web App] -->|Makes Requests| B[Backend API]
  B[Backend API] -->|Fetches Data from| C[Database]
  B[Backend API] -->|Sends Notifications| D[Notification System]
