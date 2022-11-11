from re import sub

frase= str(input('Escribe una frase que como maximo tenga 50 caracteres: '))
while len(frase) > 50:
    print ("Te has pasado maquina.")
    frase= str(input("Intentalo de nuevo: "))

print (frase)

print()

patron = ' +'
resultado = sub(patron, '', frase)

print(resultado)




