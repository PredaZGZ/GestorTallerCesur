# 🔧 División de Tareas — GestorTallerCesur (4 personas)

## Estado actual del proyecto

El proyecto es una **app CLI en Java** para que el "jefe" de un taller gestione citas, empleados, clientes, vehículos y facturas. La estructura de clases ya existe pero **casi todas las clases están vacías** (solo tienen campos declarados). Hay mucho trabajo por hacer.

### Resumen de cada archivo

| Archivo | Estado | Qué tiene | Qué le falta |
|---|---|---|---|
| [Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java) | 🟡 Parcial | Menú principal con `switch`, submenús impresos | Lógica real de cada opción, bucle principal, instancia de [Taller](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java#4-28), submenús funcionales |
| [Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java) | 🟡 Parcial | Listas (`ArrayList`) de todas las entidades, método [addCoche()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java#13-26) | Métodos CRUD para Empleado, Cliente, Cita, Factura. Métodos de búsqueda |
| [Coche.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Coche.java) | 🟢 Casi listo | Constructor, getters/setters, [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) | Relación con [Cliente](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cliente.java#3-10) (tiene el campo pero no se usa en constructor) |
| [Empleado.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java) | 🟢 Casi listo | Constructor, getters/setters, [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45), [cambiarEstado()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#37-40) | Getter/setter de `sueldo`, `turno` no está en constructor |
| [Cliente.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cliente.java) | 🔴 Vacío | Solo campos: `nombre`, `apellido`, `dni` | Constructor, getters/setters, [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) |
| [Cita.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cita.java) | 🔴 Vacío | Solo campos: `fecha`, `hora`, `cliente`, `coche`, `factura`, `empleado` | Constructor, getters/setters, [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) |
| [Factura.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Factura.java) | 🔴 Vacío | Solo campos: `id`, `listaElementos` | Constructor, getters/setters, [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45), calcular total |
| [Item.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Item.java) | 🔴 Vacío | Clase base vacía | Campos comunes (`nombre`, `precio`), constructor, getters/setters |
| [Pieza.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Pieza.java) | 🔴 Vacío | Extiende [Item](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Item.java#3-6), constructor vacío | Campos propios (ej: `marca`, `referencia`), constructor real |
| [Servicio.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Servicio.java) | 🔴 Vacío | Extiende [Item](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Item.java#3-6), constructor vacío | Campos propios (ej: `horasTrabajo`), constructor real |

---

## 👥 División por personas (4 miembros)

La división está hecha para que **cada persona trabaje en archivos diferentes** y así minimizar conflictos en Git.

---

### 🧑 Persona 1 — Gestión de Clientes y Vehículos

**Archivos:** [Cliente.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cliente.java), [Coche.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Coche.java)  
**Parte del [Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java):** Métodos CRUD de clientes y coches  
**Parte del [Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java):** Submenú `case 3` (Clientes) y `case 4` (Vehículos)

#### Tareas concretas:

1. **[Cliente.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cliente.java)** — Completar la clase:
   - Constructor con `nombre`, `apellido`, `dni`
   - Getters y setters para todos los campos
   - [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) con formato legible
   - Añadir campo `telefono` (opcional)

2. **[Coche.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Coche.java)** — Mejorar la clase:
   - Añadir [Cliente](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cliente.java#3-10) al constructor (vincular coche con dueño)
   - Getter/setter para `cliente`
   - Mejorar [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) (añadir separadores)

3. **[Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java)** — Añadir métodos:
   - `addCliente(...)`, `buscarClientePorDni(...)`, `eliminarCliente(...)`
   - `buscarCochePorMatricula(...)`, `eliminarCoche(...)`
   - `listarClientes()`, `listarCoches()`

4. **[Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java)** — Implementar submenús:
   - `case 3`: Buscar cliente, añadir cliente, modificar cliente
   - `case 4`: Buscar vehículo, añadir vehículo (vinculado a cliente)

---

### 🧑 Persona 2 — Gestión de Empleados

**Archivos:** [Empleado.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java)  
**Parte del [Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java):** Métodos CRUD de empleados  
**Parte del [Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java):** Submenú `case 2` (Empleados) + **estructura general del Main** (bucle, instancia Taller)

#### Tareas concretas:

1. **[Empleado.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java)** — Completar la clase:
   - Añadir `turno` al constructor
   - Getter/setter de `sueldo` y `turno`
   - Mejorar [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) para mostrar toda la info

2. **[Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java)** — Añadir métodos:
   - `addEmpleado(...)`, `buscarEmpleadoPorNombre(...)`, `eliminarEmpleado(...)`
   - `listarEmpleados()`, `listarEmpleadosDisponibles()`
   - `modificarEmpleado(...)`

3. **[Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java)** — **Estructura general + submenú empleados**:
   - Crear instancia de [Taller](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java#4-28) en el [main()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java#7-64)
   - Envolver todo en un **bucle `do-while`** para que no se cierre tras una opción
   - Implementar `case 6` (guardar y salir)
   - Implementar `case 2`: Contratar empleado, modificar empleado, ver horario

> [!IMPORTANT]
> **La Persona 2 crea la estructura base del [Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java)** (bucle, instancia de Taller), y las demás personas implementan sus `case` dentro de esa estructura. Coordinar para evitar conflictos.

---

### 🧑 Persona 3 — Gestión de Citas

**Archivos:** [Cita.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cita.java)  
**Parte del [Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java):** Métodos CRUD de citas  
**Parte del [Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java):** Submenú `case 1` (Citas)

#### Tareas concretas:

1. **[Cita.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cita.java)** — Completar la clase:
   - Constructor con `fecha`, `hora`, `cliente`, `coche`, `empleado`
   - Getters y setters para todos los campos
   - [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) con formato legible
   - Getter/setter de `factura` (se asigna después)

2. **[Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java)** — Añadir métodos:
   - `agendarCita(...)`, `cancelarCita(...)`, `modificarCita(...)`
   - `listarCitasFuturas()`, `buscarCitasPorCliente(...)`
   - `listarCitasDeHoy(...)` (comparar con fecha actual)

3. **[Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java)** — Implementar submenú:
   - `case 1`: Ver futuras citas, agendar cita, cancelar cita, modificar cita
   - Pedir datos al usuario por consola (fecha, hora, seleccionar cliente/coche/empleado)

---

### 🧑 Persona 4 — Gestión de Facturas, Piezas y Servicios

**Archivos:** [Item.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Item.java), [Pieza.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Pieza.java), [Servicio.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Servicio.java), [Factura.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Factura.java)  
**Parte del [Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java):** Métodos CRUD de facturas  
**Parte del [Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java):** Submenú `case 5` (Facturas)

#### Tareas concretas:

1. **[Item.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Item.java)** — Completar la clase base:
   - Campos: `nombre` (String), `precio` (double)
   - Constructor, getters/setters
   - [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45)

2. **[Pieza.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Pieza.java)** — Completar:
   - Campos propios: `marca`, `referencia`
   - Constructor que llame a `super(nombre, precio)` + campos propios
   - [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) sobreescrito

3. **[Servicio.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Servicio.java)** — Completar:
   - Campos propios: `horasTrabajo` (int), `descripcion`
   - Constructor que llame a `super(nombre, precio)` + campos propios
   - [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) sobreescrito

4. **[Factura.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Factura.java)** — Completar:
   - Constructor, getters/setters
   - `addItem(Item item)`, `removeItem(...)`
   - `calcularTotal()` — sumar precios de todos los ítems
   - [toString()](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java#41-45) con lista de ítems y total

5. **[Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java)** — Añadir métodos:
   - `addFactura(...)`, `buscarFacturaPorId(...)` 
   - `buscarFacturasPorCliente(...)`, `buscarFacturasPorMatricula(...)`
   - `listarFacturas()`

6. **[Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java)** — Implementar submenú:
   - `case 5`: Buscar por cliente, por ID, por matrícula, por empleado, crear factura

---

## 📋 Tabla resumen: quién toca qué archivo

| Archivo | Persona 1 | Persona 2 | Persona 3 | Persona 4 |
|---|:---:|:---:|:---:|:---:|
| [Cliente.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cliente.java) | ✅ | | | |
| [Coche.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Coche.java) | ✅ | | | |
| [Empleado.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Empleado.java) | | ✅ | | |
| [Cita.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Cita.java) | | | ✅ | |
| [Item.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Item.java) | | | | ✅ |
| [Pieza.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Pieza.java) | | | | ✅ |
| [Servicio.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Servicio.java) | | | | ✅ |
| [Factura.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Factura.java) | | | | ✅ |
| [Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java) | 🟡 parte | 🟡 parte | 🟡 parte | 🟡 parte |
| [Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java) | 🟡 case 3,4 | 🟡 estructura + case 2 | 🟡 case 1 | 🟡 case 5 |

> [!WARNING]
> **[Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java) y [Main.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java)** son archivos compartidos. Para evitar conflictos en Git:
> 1. **Persona 2 crea primero** la estructura del [Main](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Main.java#4-65) y los métodos vacíos en [Taller.java](file:///c:/Users/David/Documents/GestorTallerCesurDavid-/Taller.java) (push al repo)
> 2. Las demás personas hacen **pull** y rellenan sus partes
> 3. Alternativamente, cada persona puede trabajar en una **rama diferente** (`feature/clientes`, `feature/empleados`, `feature/citas`, `feature/facturas`) y hacer **merge** al final

---

## 🔀 Flujo de trabajo Git recomendado

```
1. Persona 2 crea la estructura base → push a main
2. Cada persona crea su rama:
   git checkout -b feature/clientes    (Persona 1)
   git checkout -b feature/empleados   (Persona 2)
   git checkout -b feature/citas       (Persona 3)
   git checkout -b feature/facturas    (Persona 4)
3. Cada uno trabaja en su rama y hace commits frecuentes
4. Cuando terminen, hacen Pull Request a main
5. Resolver conflictos en Taller.java y Main.java juntos
```
