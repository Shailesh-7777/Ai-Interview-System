# 🎯 AI Interview Prep

> **An AI-powered interview preparation platform for college students and job seekers.**  
> Built as a production-grade, full-stack web application based on the B.Tech project synopsis by **Team "Coffee and Code"** (*Shubhamji Gupta, Pawan Kumar, Ashish Kumar Sharma* at Maharishi Markandeshwar Deemed to be University).

---

## 🚀 Live Local URLs

| Service | URL | Description |
|---|---|---|
| **Frontend Application** | [`http://localhost:5173`](http://localhost:5173) | Modern React 19 + Tailwind v4 Single Page App |
| **Backend API** | [`http://localhost:8080/api`](http://localhost:8080/api) | Spring Boot 3.3.5 REST API with JWT Auth |
| **Database** | `127.0.0.1:3307` | Dedicated MariaDB / MySQL (`ai_interview_prep`) |

---

## 🔑 Demo Credentials

| Role | Email | Password | Pre-loaded Data |
|---|---|---|---|
| **Student** | `student@aiinterview.com` | `student123` | Completed interviews, scores, history, progress |
| **Admin** | `admin@aiinterview.com` | `admin123` | Full access to Question Bank & Role Management |

> 💡 *The login page includes 1-click demo credential autofill buttons for both Student and Admin accounts!*

---

## 🛠️ Tech Stack

### Frontend
- **Framework**: React 19 with TypeScript
- **Bundler & Tooling**: Vite 6, `@tailwindcss/vite`
- **Styling**: Tailwind CSS v4 with modern slate / indigo theme
- **Routing**: React Router v7 (`react-router-dom`)
- **HTTP Client**: Axios with Bearer JWT interceptors and auto-refresh/redirect
- **Icons & Visuals**: `lucide-react`, `canvas-confetti`

### Backend
- **Framework**: Java 21, Spring Boot 3.3.5
- **Security**: Spring Security 6 with stateless JWT authentication (`io.jsonwebtoken:jjwt:0.12.6`) and BCrypt password hashing
- **Persistence**: Spring Data JPA with Hibernate ORM
- **Database**: MariaDB / MySQL running on dedicated port 3307
- **Validation**: Jakarta Bean Validation (`spring-boot-starter-validation`)
- **Build System**: Apache Maven 3.9.9

### AI Engine (Modular Architecture)
- **Primary AI Provider**: Google Gemini API (`GeminiAiEvaluationService`) using Gemini 1.5 Flash
- **Intelligent Heuristic Fallback**: `MockAiEvaluationService` automatically activates when `GEMINI_API_KEY` is not set or network fails. Performs contextual keyword analysis, semantic coverage check, completeness grading, and delivers structured scores (1-10) with targeted strengths and weaknesses.
- **Service Delegator**: `AiEvaluationServiceManager` routes requests cleanly without frontend exposure.

---

## 📊 System Architecture

```mermaid
flowchart TD
    subgraph Client["Client Tier (Port 5173)"]
        UI["React 19 SPA (Vite + Tailwind v4)"]
        Router["React Router v7"]
        Store["Auth & Toast State Context"]
        AxiosClient["Axios API Client + JWT Interceptors"]
    end

    subgraph Server["Application Tier (Port 8080)"]
        Security["Spring Security Filter + JWT Validator"]
        Controllers["REST Controllers (Auth, Roles, Questions, Interviews, Admin)"]
        Services["Business Services (InterviewService, DashboardService, etc.)"]
        AIDelegator["AiEvaluationServiceManager"]
    end

    subgraph AI["AI Evaluation Tier"]
        GeminiService["Google Gemini 1.5 Flash (REST API)"]
        MockAIService["Intelligent Heuristic Fallback Evaluator"]
    end

    subgraph Data["Database Tier (Port 3307)"]
        DB[("MariaDB / MySQL (ai_interview_prep)")]
    end

    UI --> Router
    Router --> Store
    Store --> AxiosClient
    AxiosClient -- "HTTP Proxy (/api)" --> Security
    Security --> Controllers
    Controllers --> Services
    Services --> AIDelegator
    AIDelegator -- "If API Key Configured" --> GeminiService
    AIDelegator -- "Fallback / Standalone" --> MockAIService
    Services --> DB
```

---

## ✨ Key Features & User Journeys

### 1. 🎓 Student Experience
- **Interactive Practice Arena**:
  - Select target job role (Java Developer, Frontend Developer, Backend Developer, Full Stack, Python Developer, Data Analyst, Software Engineer, HR/Behavioral).
  - Select difficulty level (Beginner, Intermediate, Advanced) and question count.
  - Live session with countdown timer, auto-expanding code/text editor, question switcher, and instant answer submission.
- **Immediate AI Feedback**:
  - Detailed score out of 10.
  - Multi-dimensional breakdown: Correctness, Relevance, Completeness, Clarity.
  - Specific, actionable strengths and areas for improvement.
- **Comprehensive Performance Report**:
  - Overall readiness score and graduation badge.
  - Skill breakdown radar / bar visualizations.
  - Question-by-question comparative review (Candidate Answer vs Model Answer with AI comments).
- **Dashboard & Analytics**:
  - Key metrics: Total interviews, completed sessions, average score, personal best.
  - Recent interview sessions with quick resume/review actions.
  - Progress tracking over time.

### 2. 🛡️ Admin Experience
- **Analytics Overview**: Platform-wide metrics including total users, sessions conducted, active questions, and global average score.
- **Question Bank Management**:
  - Filter questions by role and difficulty.
  - Add new interview questions with expected topics and model answers.
  - Edit or toggle active/inactive status.
- **Role Management**:
  - Create, update, or remove interview tracks/roles.
  - Configure icons, descriptions, and baseline difficulties.
- **Session Audit**: Inspect any candidate's past interview session, review answers, and check AI feedback.

---

## ⚡ Quick Start Scripts

The project includes batch scripts in the root directory for easy single-click operation:

### Launch All Services
Double click or run:
```cmd
start-all.bat
```
*This starts MariaDB (port 3307), Spring Boot (port 8080), and Vite Dev Server (port 5173).*

### Stop All Services
Double click or run:
```cmd
stop-all.bat
```
*This cleanly stops any processes running on ports 5173, 8080, and 3307.*

---

## 🔧 Manual Setup & Running

### 1. Database
```cmd
"C:\Program Files\MariaDB 12.2\bin\mysqld.exe" --datadir="C:\Users\ashis\scratch\ai-interview\mariadb-data" --port=3307 --bind-address=127.0.0.1
```

### 2. Backend (Spring Boot)
```cmd
cd backend
"C:\Program Files\JetBrains\IntelliJ IDEA 2025.2\plugins\maven\lib\maven3\bin\mvn.cmd" spring-boot:run
```

### 3. Frontend (React + Vite)
```cmd
cd frontend
npm.cmd run dev -- --host 127.0.0.1 --port 5173
```

---

## 🤖 Configuring Google Gemini AI (Optional)

To enable live Gemini AI evaluations instead of the mock engine:
1. Obtain an API key from [Google AI Studio](https://aistudio.google.com/).
2. In `backend/src/main/resources/application.properties` (or as an environment variable):
   ```properties
   ai.gemini.api-key=YOUR_ACTUAL_GEMINI_API_KEY
   ai.gemini.model=gemini-1.5-flash
   ```
3. Restart the backend. The platform will automatically route evaluations through Gemini! If the key is omitted or invalid, it gracefully falls back to the smart mock evaluator.
---

## ☁️ Deploying to Render (Linux Compatible)

The repository is configured for modern, cross-platform cloud deployment on [Render](https://render.com).

Because the project contains a modern React single-page frontend and a robust Spring Boot backend, they should be deployed as two decoupled, high-performance services:

```mermaid
flowchart LR
    Browser["User Browser"] --> |"HTTPS (Static Assets & React Router)"| Frontend["Render Static Site (frontend/)"]
    Browser --> |"REST API Calls (CORS enabled)"| Backend["Render Web Service (backend/ Docker)"]
    Backend --> |"JDBC Connection"| DB[("MySQL / Cloud Database")]
```

### Option 1: One-Click Render Blueprint (Recommended)
1. Push your repository to GitHub.
2. In the Render Dashboard, click **New +** -> **Blueprint**.
3. Select this repository. Render will automatically read [`render.yaml`](file:///Users/shaileshkumar/.gemini/antigravity/scratch/ai-interview-system-github/render.yaml) and configure both services with proper build and rewrite settings.
4. Fill in the database credentials and the frontend's `VITE_API_BASE_URL` with your backend URL.

---

### Option 2: Manual Dashboard Setup

#### 1. Backend Service (Spring Boot REST API)
1. In Render Dashboard, click **New +** -> **Web Service**.
2. Connect your GitHub repository: `Ai-Interview-System`.
3. Configure the service settings:
   - **Name**: `ai-interview-backend`
   - **Root Directory**: `backend` (or leave empty if using root Dockerfile)
   - **Environment / Runtime**: `Docker`
   - **Dockerfile Path**: `Dockerfile` (or `backend/Dockerfile` if Root Directory is empty)
   - **Health Check Path**: `/api/health`
4. Add the required Environment Variables:
   - `PORT`: `8080` (or leave dynamic; Spring Boot binds automatically to `$PORT`)
   - `CORS_ORIGINS`: `https://<your-frontend-site>.onrender.com,http://localhost:5173`
   - `DB_HOST`: Your MySQL host (e.g. Aiven, Railway, AWS RDS, or PlanetScale)
   - `DB_PORT`: `3306`
   - `DB_NAME`: `ai_interview_prep`
   - `DB_USER`: Your MySQL username
   - `DB_PASSWORD`: Your MySQL password
   - `JWT_SECRET`: A secure random 256-bit string (e.g. `AIInterviewPrepSecretKeyForJwtTokenGenerationMustBe256BitsOrMoreLong2026`)
   - `AI_PROVIDER`: `mock` (or `gemini` if you add `GEMINI_API_KEY`)
   - *(Optional for instant preview without MySQL)*: `SPRING_PROFILES_ACTIVE`: `h2`
5. Click **Create Web Service**. Note the deployed backend URL (e.g., `https://ai-interview-backend.onrender.com`).

#### 2. Frontend Service (React Single Page App)
1. In Render Dashboard, click **New +** -> **Static Site**.
2. Connect your GitHub repository: `Ai-Interview-System`.
3. Configure the static site settings:
   - **Name**: `ai-interview-frontend`
   - **Root Directory**: `frontend`
   - **Build Command**: `npm install && npm run build`
   - **Publish Directory**: `dist`
4. Add the required Environment Variable:
   - `VITE_API_BASE_URL`: `https://<your-backend-subdomain>.onrender.com`
5. Configure React Router Rewrites (Crucial for page refreshes & direct links):
   - Under **Redirects / Rewrites** in the static site settings, click **Add Rule**:
     - **Type**: `Rewrite`
     - **Source**: `/*`
     - **Destination**: `/index.html`
6. Click **Create Static Site**.

---

## ⚡ Local Development Commands

| Platform | Command | Description |
|---|---|---|
| **Windows** | `powershell -ExecutionPolicy Bypass -File .\run.ps1` | Launches local MariaDB, Spring Boot, and Vite |
| **macOS / Linux** | `./start.sh` or `npm run dev:unix` | Launches local MySQL/MariaDB, Spring Boot, and Vite |
| **Frontend Only** | `npm run dev:frontend` | Runs Vite dev server on port 5173 with proxy to backend |
| **Backend Only** | `mvn -f backend/pom.xml spring-boot:run` | Starts Spring Boot on port 8080 |
| **Frontend Build** | `npm run build:frontend` | TypeScript check & Vite production bundle |
| **Backend Build** | `npm run build:backend` | Clean package Spring Boot runnable JAR |
