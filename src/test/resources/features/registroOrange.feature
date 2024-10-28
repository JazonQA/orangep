#language: es

Característica: registro de cliente
  Yo como usuario de administrador
  Quiero ingresar a la web
  Para registrar usuarios

  @002 @ORANGE
  Esquema del escenario:  [QA][Orange] Deseo ingresar a la web orange como administrador y registrar un usuario

    Dado que la web esta disponible para orange
    Cuando ingrese el usuario "<usuario>"
    Y Ingrese la contraseña "<pass>"
    Y hago click en el boton login
    Y doy click en el boton PIM
    Entonces doy click la seccion agregar empleado
    Y ingreso primer "<nombre1>"
    Y ingreso segundo "<nombre2>"
    Y ingreso apellido "<apellido>"
    Y doy click en boton para agregar detalle de logeo







    Ejemplos:
      | usuario | pass     | nombre1 | nombre2 | apellido |
      | Admin   | admin123 | Jason   | Jhon    | Balcazer |



