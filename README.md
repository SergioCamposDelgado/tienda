# Verifica tus remotos actuales

Primero, verifica los remotos configurados en tu repositorio local para asegurarte de que solo tienes el remoto `origin`:

```bash
git remote -v
```

Esto debería mostrar algo como:

```perl
origin  https://github.com/tu_usuario/tienda.git (fetch)
origin  https://github.com/tu_usuario/tienda.git (push)
```

Si no ves un remoto llamado `upstream`, es porque aún no lo has configurado.

---

# Agrega el repositorio original como remoto `upstream`

Ahora, debes agregar el repositorio original (el del fork) como un remoto llamado `upstream`:

```bash
git remote add upstream https://github.com/profeInformatica101/tienda.git
```

Asegúrate de que la URL sea correcta, dependiendo de la ubicación del repositorio original.

---

# Trae las ramas del repositorio original (`upstream`)

Una vez que has agregado el remoto `upstream`, debes traer todas las ramas del repositorio original para que tu repositorio local tenga acceso a ellas:

```bash
git fetch upstream
```

---

# Verifica las ramas remotas disponibles

Después de hacer `git fetch upstream`, puedes verificar las ramas remotas de `upstream` con:

```bash
git branch -r
```

Deberías ver algo como:

```arduino
upstream/feature/sin-pruebas
```

---

# Crea tu propia rama basada en `feature/sin-pruebas`

Ahora que tienes la referencia remota de la rama `feature/sin-pruebas` desde el repositorio original (`upstream`), puedes crear y cambiar a tu propia rama localmente:

```bash
git checkout -b mi-feature upstream/feature/sin-pruebas
```

Este comando creará una nueva rama local `mi-feature` y te cambiará a ella, basándote en la rama remota del repositorio original.

---

# Verifica el estado de la rama

Finalmente, verifica que te hayas cambiado correctamente a la rama `mi-feature`:

```bash
git status
```

---

# Sube los cambios a tu repositorio

Ahora que tienes la rama lista, sube los cambios a tu propio repositorio:

```bash
git push origin mi-feature
```

---

# Gestiona los cambios en tu repositorio

Ahora puedes continuar trabajando en la rama `mi-feature`, realizar cambios, hacer commits y seguir actualizándola con:

```bash
git add .
git commit -m "Descripción de los cambios"
git push origin mi-feature
```

Si en algún momento deseas actualizar tu rama con los cambios más recientes del repositorio original (`upstream`), puedes hacer lo siguiente:

```bash
git fetch upstream
git merge upstream/feature/sin-pruebas
```

Esto traerá los últimos cambios de `feature/sin-pruebas` y los fusionará en tu rama `mi-feature`.
