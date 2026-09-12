@echo off
title Tests Kotlin - Calculadora
echo === Corriendo tests Kotlin ===
echo.
"%~dp0apache-maven-3.9.6\bin\mvn.cmd" -f "%~dp0kotlin\pom.xml" test
echo.
echo === Proceso terminado ===
pause
