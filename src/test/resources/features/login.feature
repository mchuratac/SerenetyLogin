Feature: Ingresar al Sistema SGCRED

#  Scenario: Login a la home de SGCRED
#    Given Pepe accede a la ruta de SGCRED
#    When he ingresa el usuario "administrador@tpido.com" y la contraseña "clave" y le da click en el botón Ingresar
#    Then he visualiza en la página home del SGCRED el texto "Bienvenido"

  Scenario Outline: Loguearme a la home de SGCRED
    Given Usuario accede a la ruta de SGCRED
    When he ingresa el usuario "<nombreUsuario>" y la contraseña "<contraseña>" y le da click en el botón Ingresar
    Then he se cierra el icono del Popup
    Then he visualiza en la página home del SGCRED el texto "Usuario"
    Then he cierra la sesión
    Examples:
      | nombreUsuario | contraseña |
      | CIYAZU        | prueba     |
      | JURO          | prueba     |
      | NISI          | prueba     |