# Prueba Tecnica Con Java y Spring Boot

Este es un proyecto que utiliza Spring Boot y Java para crear una API y una base de datos MySQL para almacenar datos. A continuación, se proporciona una descripción general del proyecto y cómo puedes configurarlo y ejecutarlo en tu entorno local.

## Descripción

Este proyecto es una API construida con Spring Boot y Java que realiza las siguientes tareas:

- **Registrar los vehiculos:** Registrar los vehículos que se tienen disponibles para realizar los pedidos.

- **Registrar los conductores:** Registrar los conductores que están contratados por la empresa.

- **Asociar un Conductor:** Asociar un conductor a uno o varios vehículos. En este punto se espera que al tener
un conductor seleccionado sólo cargue los vehículos que NO tiene asignados para
realizar la asignación

- **Desasociar un Conductor:** Desasociar a un conductor de un vehículo. En este punto se espera que al tener un
conductor seleccionado sólo cargue los vehículos que ya han sido asignados
previamente para quitar la asociación.

## Requisitos

Asegúrate de tener instalados los siguientes componentes en tu sistema:

- Java JDK (versión 17 o superior)
- Spring Boot (versión 3.1.4 o superior)
- MySQL (versión 8.0 o superior)

