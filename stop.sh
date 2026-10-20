#!/bin/bash
echo "========================================================"
echo "  🛑 Stopping AI Interview Prep Services..."
echo "========================================================"

# Stop port 5173 (Frontend)
PID_5173=$(lsof -ti :5173)
if [ -n "$PID_5173" ]; then
  echo "Stopping Frontend (PID $PID_5173)..."
  kill -9 $PID_5173 2>/dev/null
fi

# Stop port 8080 (Backend)
PID_8080=$(lsof -ti :8080)
if [ -n "$PID_8080" ]; then
  echo "Stopping Backend (PID $PID_8080)..."
  kill -9 $PID_8080 2>/dev/null
fi

# Stop port 3307 (Database)
PID_3307=$(lsof -ti :3307)
if [ -n "$PID_3307" ]; then
  echo "Stopping Database (PID $PID_3307)..."
  kill -9 $PID_3307 2>/dev/null
fi

echo "All services have been stopped."
