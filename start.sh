#!/bin/bash
PROJECT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

echo "========================================================"
echo "  🚀 Starting AI Interview Prep on macOS"
echo "========================================================"

# 1. Database (Port 3307)
if lsof -i :3307 >/dev/null 2>&1; then
  echo "✔ Database already running on port 3307"
else
  echo "[1/3] Starting Database on port 3307..."
  nohup mysqld --datadir="$PROJECT_DIR/mysql-mac-data" --port=3307 --mysqlx=OFF --bind-address=127.0.0.1 --socket=/tmp/mysql3307.sock > "$PROJECT_DIR/mysql.log" 2>&1 &
  sleep 2
fi

# 2. Backend (Spring Boot on Port 8080)
if lsof -i :8080 >/dev/null 2>&1; then
  echo "✔ Backend already running on port 8080"
else
  echo "[2/3] Starting Backend (Spring Boot) on port 8080..."
  nohup env DB_PORT=3307 mvn -f "$PROJECT_DIR/backend/pom.xml" spring-boot:run > "$PROJECT_DIR/backend.log" 2>&1 &
  sleep 4
fi

# 3. Frontend (React Vite on Port 5173)
if lsof -i :5173 >/dev/null 2>&1; then
  echo "✔ Frontend already running on port 5173"
else
  echo "[3/3] Starting Frontend (Vite) on port 5173..."
  nohup npm --prefix "$PROJECT_DIR/frontend" run dev -- --host 0.0.0.0 --port 5173 > "$PROJECT_DIR/frontend.log" 2>&1 &
  sleep 2
fi

echo "========================================================"
echo "  All services ready!"
echo "  Frontend:  http://localhost:5173"
echo "  Backend:   http://localhost:8080"
echo "  Database:  127.0.0.1:3307 (ai_interview_prep)"
echo "========================================================"
