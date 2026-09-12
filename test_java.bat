@echo off
title Tests Java - Calculadora
echo === Corriendo tests Java ===
echo.
"%~dp0apache-maven-3.9.6\bin\mvn.cmd" -f "%~dp0calculadora\pom.xml" test
echo.
echo === Proceso terminado ===
pause
