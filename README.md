# DetPalindromo

En el presente archivo se llevó a cabo la creación de un pequeño programa que te ayudará a determinar si una palabra es palíndromo o no lo es.

## ¿Qué es un palíndromo?
Es una palabra que se lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo: *reconocer*, *oso*, *ana*.

## Características
- Solicita una palabra por consola usando `Scanner`.
- Valida que la entrada no esté vacía.
- Convierte el texto a minúsculas antes de evaluarlo.
- Usa un método recursivo (`esPalindromoAux`) que compara el primer y el último carácter, y avanza hacia el centro de la palabra.

## Tecnologías
- Java
- NetBeans IDE

## Ejemplo de uso

Entrada con palíndromo:
```
Ingrese la Palabra: Reconocer
reconocer: Es Palindromo
```

Entrada que no es palíndromo:
```
Ingrese la Palabra: Casa
casa: No es Palindromo
```

Entrada vacía:
```
Ingrese la Palabra:
No ingresaste ninguna palabra
```

## Cómo ejecutarlo

**Desde NetBeans:**
1. Abre el proyecto `detPalindromo`.
2. Haz clic derecho en el proyecto y elige **Run**.

**Desde la terminal** (dentro de la carpeta `src`):
```
javac detpalindromo/DetPalindromo.java
java detpalindromo.DetPalindromo
```

## Autor
Galileo Villegas Sánchez
TSU en Desarrollo de Software Multiplataforma, UTHH
