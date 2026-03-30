# Emoflux-MoodToDoList Website
## Team
- Harika Raj
- Manya K N
- Impana H
### Live Demo:https://system-crashers.github.io/hack/
## Problem Statement
Many individuals, especially students, struggle to manage their daily tasks, emotions, and productivity effectively. Existing productivity tools focus mainly on task completion but fail to consider the user’s emotional state, which significantly impacts performance, motivation, and mental well-being.
There is a lack of an interactive, intelligent system that can:
Understand a user's mood in real-time
Provide emotional support through conversation
Suggest personalized tasks or activities based on mood
Help users stay productive while also maintaining mental balance
This gap often leads to stress, poor time management, and reduced efficiency, particularly among students balancing academics and personal responsibilities.
## Features
- Mood detection system
- Interactive chatbot
- Mood-based task suggestions
- To-do list management
- Personalized user experience
- Simple and user-friendly interface
- Login and logout functionality
- Fast and lightweight performance
## Tech Stack

| Category   | Technologies Used            |
|------------|-----------------------------|
| Frontend   | HTML, CSS, JavaScript       |
| Backend    | Java                        |
| Database   | MySQL / None                |
| Tools      | VS Code, Git, GitHub        |
| Deployment | GitHub Pages                |

## Project Structure
```

hackthis/
│── backend/
│   │── DemoApplication.java
│   │── DemoApplicationTests.java
│   │── Main.java
│   │── UserController.java
│
│── frontend/
│   │── chat.html
│   │── home.html
│   │── signup.html
│
│── index.html
│── module-info.java
│── README.md
```
## Quick Start(Local)

### 1. Clone the repository
git clone https://github.com/System-crashers/hackthis.git
cd hackthis

## API EndPoints

| Method | Endpoint        | Description                  |
|--------|---------------|------------------------------|
| GET    | /             | Load home page               |
| POST   | /signup       | Register new user            |
| POST   | /login        | User login                   |
| GET    | /chat         | Open chatbot interface       |
| POST   | /chat         | Send message to chatbot      |
| GET    | /users        | Get user details             |

## Deployment(Render.com)

| Component | Platform        | Details                                  |
|----------|----------------|------------------------------------------|
| Frontend | GitHub Pages   | Hosted using GitHub Pages (static site)  |
| Backend  | Local Server   | Runs using Java (Main.java)              |
| Access   | Browser        | Open via GitHub Pages or local HTML file |
