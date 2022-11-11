ASCII =input("Dime una frase y te la digo en numeros de la cadean ASCII:")

for c in ASCII:
    print('%s: %i' % (c, ord(c)))
