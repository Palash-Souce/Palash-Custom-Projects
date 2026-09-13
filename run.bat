@echo off
cd /d "%~dp0"

echo Compiling pure Java code...
javac SelfPhoto.java

if %errorlevel% neq 0 (
    echo Compilation failed!
    pause
    exit /b
)

echo.
echo Running SelfPhoto application...
java SelfPhoto

echo.
pause
