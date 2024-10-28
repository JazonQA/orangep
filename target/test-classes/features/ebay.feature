#language: es

@CONSULTAEBAY

Característica: Consulta de Ebay
  Yo como usuario nuevo
  Quiero ingresar a la web
  Para buscar articulos mobiles




  @001 @EBAYCONSULTA
  Esquema del escenario:  [QA][Ebay] Consultar productos prueba basica

    Dado que la web esta disponible para ebay peru
    Cuando doy click en textbox buscar
    Y ingreso un producto "<articulo>"

    Ejemplos:

      | articulo  |
      | Celulares |