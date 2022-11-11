nombre1 = input("Dime tu primer nombre: ")
nombre2 = input("Dime tu nombre segundo nombre (si tienes): ")
apellido = input("Dime tus/tu apellidos: ")
if nombre2 == (""):
    print (apellido+","+nombre1[0]+".")
else:
    print (apellido+","+nombre1[0]+"."+nombre2[0]+".")

