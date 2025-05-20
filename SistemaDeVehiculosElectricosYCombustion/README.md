## Sistema de Vehículos Eléctricos y Combustión

-----
**Contexto:**

Estás desarrollando un sistema para gestionar distintos tipos de vehículos. Algunos funcionan a electricidad, otros a combustión. Algunos pueden recargarse, otros no. También hay vehículos híbridos.

La parte ya implementada es la clase *Vehiculo.java*

---
### 🎯 Lo que tenés que implementar

🚙 Clase AutoElectrico

- Hereda de Vehiculo

- Implementa Recargable

- Tiene un campo batería (en porcentaje, de 0 a 100)

- Tiene eficiencia (km por % de batería)

Implementá:

- autonomia(): batería × eficiencia

- recargar(): pone batería en 100

Constructor valida que eficiencia no sea negativa

🚛 Clase CamionCombustion

- Hereda de Vehiculo

- Tiene litros de combustible y consumo (litros cada 100km)

- autonomia() = (litros * 100) / consumo

Si consumo es cero, debe lanzar IllegalArgumentException

🚙 Clase Hibrido

- Hereda de Vehiculo

- Tiene internamente un AutoElectrico y un CamionCombustion

- autonomia() = suma de ambas autonomías

- recargar() = recarga el auto eléctrico

🧪 Clase Taller

Método static:
````java
public static void recargarSiSePuede(List<Vehiculo> lista)
````
- Recorre la lista

- Si un vehículo es Recargable, lo recarga (usando instanceof + casting)

- No debe lanzar excepción si alguno no lo es