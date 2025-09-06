@echo off
SETLOCAL

:: Check if commit message was passed
IF "%~1"=="" (
    echo Usage: gitpush.bat "Your commit message"
    exit /b 1
)

:: Combine all arguments into a single commit message
SET "msg=%~1"
SHIFT
:loop
IF "%~1"=="" GOTO done
SET msg=%msg% %~1
SHIFT
GOTO loop

:done
git add .
git commit -m "%msg%"
git push
