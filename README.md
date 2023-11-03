<h1 align="center"><b>Money Calculator App 💰 </b></h1>

## Descripción 📋

Money Calculator es una aplicación Java que simplifica la conversión de una moneda a otra de manera eficiente. Utilizando el patrón de diseño Modelo-Vista-Controlador (MVC) y el patrón Observer, la aplicación proporciona una interfaz intuitiva para realizar conversiones monetarias con facilidad.

# 👥 Equipo de desarrollo (Ctrl + Click para ver los perfiles)

[![GitHub](https://img.shields.io/badge/GitHub-Andrea%20Santana%20Lopez-purple?style=flat-square&logo=github)](https://github.com/AndreaSantalos)

## Características ✨

- **Conversión de Moneda:** Permite al usuario ingresar el monto en una moneda de origen y seleccionar la moneda de destino para obtener el monto convertido.

- **Actualización Automática:** Implementa el patrón Observer para actualizar automáticamente la interfaz cuando cambian los datos de conversión.

- **Interfaz Gráfica Amigable:** Desarrollada con Java Swing, la interfaz de usuario es fácil de entender y utilizar.

## Estructura del Proyecto 🏗️

El código sigue el patrón MVC para una organización clara y modular:

- **Modelo (Model):** Contiene la lógica de negocios y gestiona las tasas de cambio. La clase `MoneyCalculator` realiza los cálculos de conversión y mantiene el historial.

- **Vista (View):** Representa la interfaz de usuario. La clase `MoneyDisplayView, MoneyView y MoneyEditView` maneja la presentación y entrada de datos para las conversiones.

- **Controlador (Controller):** Gestiona las interacciones entre el usuario y la aplicación. La clase `MoneyEditController` maneja los eventos de usuario y actualiza el modelo y la vista en consecuencia.

El patrón Observer se utiliza para permitir que la vista se actualice automáticamente cuando cambian las tasas de cambio.

<ul align="center">		
  <a href="https://tradingview.github.io/lightweight-charts/docs" target="_blank">
    <img style="width:40rem"  src="model.PNG">
  </a>
</ul>

## Integración de API 🌐

- Se utiliza una API para obtener tasas de cambio actualizadas.

- Los componentes relevantes se encuentran en el paquete WebService.

##

## Requisitos 🛠️

- Java JDK 8 o superior.
- IDE compatible con Java (Eclipse, IntelliJ, etc.).

## Instrucciones de Uso 🚀

1. Clona el repositorio: `git clone https://github.com/AlejandroDavidArzolaSaavedra/MoneyCalculator`
2. Abre el proyecto en tu IDE preferido.
3. Ejecuta la clase `MoneyCalculatorController` para iniciar la aplicación.

## Contribuciones 🤝

¡Se aprecian las contribuciones! Si encuentras errores o tienes mejoras sugeridas, crea un _issue_ o envía una solicitud de _pull request_.
