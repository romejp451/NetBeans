texto_1 = input("Dime una frase y te dire si es un anagrama de la siguiente: ")
texto_2 = input("Dime la frase que quieres que compare con la primera: ")
texto_1 = texto_1.lower()
texto_1 = texto_1.replace(' ','')
texto_2 = texto_2.lower()
texto_2 = texto_2.replace(' ','')

print (f'¿La cadena "{texto_1}" es anagrama de "{texto_2}"?" {set(texto_1) == set(texto_2)}"')







