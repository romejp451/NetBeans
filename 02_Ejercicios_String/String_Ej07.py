frase = input("Dime una cadena de caracteres para intercambiarla de orden: ")

def intercambio_caracteres(frase):
    return frase[-1] + frase[1:-1] + frase[0]

print (intercambio_caracteres(frase))
