frase = input("Dime una frase y dire cuantas veces se repite cada letra: ")

diccionario= {}

for letra in frase:
    if letra in diccionario:
        diccionario[letra]=diccionario [letra]+1
    else: 
        diccionario [letra]=1

print ("%s Se repite %s veces." % (letra, diccionario))
