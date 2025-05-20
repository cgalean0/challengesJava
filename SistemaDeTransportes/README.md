## Sistema de Transportes

---
🧾 **Contexto:**

Estás desarrollando un sistema que gestiona diferentes tipos de transportes. Hay transportes públicos y privados, algunos pueden llevar pasajeros, otros pueden transportar carga. El sistema ya tiene parte del código implementado y vos debés completar lo necesario para que funcione como se espera.

Clases ya implementadas:
*Colectivo.java*, *Pasajeros.java*, *Carga.java*, *Transporte.java*

---
### 🧩 Tareas a implementar vos
🚛 Clase Camion:

- Hereda de Transporte

- Implementa Carga

- Tiene un `pesoMaximo` en toneladas y un `costoPorToneladaKm`

- Implementa `calcularCosto(distanciaKm)` como: `(pesoMaximo * costoPorToneladaKm * distanciaKm)`

🚖 Clase Taxi:

- Hereda de Transporte

- Implementa Pasajeros

- Tiene una `capacidadPasajeros` (siempre 4) y una tarifa básica por km

- Implementa `calcularCosto(distanciaKm)` como: `(distanciaKm * tarifaBasica)`


🧪 Clase GestorTransportes:

Tiene un método:
````java
public static double calcularCostoTotal(List<Transporte> lista, double distanciaKm)
````
Debe:

- Recorrer todos los transportes

- Calcular el costo total (sumando el costo de cada uno)

- Si alguno lanza una excepción, debe ignorarlo y seguir.

---

### 💥 Bonus: 
Lanzá excepción si un transporte tiene un valor negativo de costo

Modificá **calcularCosto** en las clases que implementás para que lancen:
````java
throw new IllegalArgumentException("Costo negativo no permitido");
````