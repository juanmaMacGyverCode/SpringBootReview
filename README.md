# Capitulo 2 - Creando una aplicación sencilla

Para que la aplicación funcione hay que asegurarse de realizar las siguientes instrucciones vía terminal para instalar todas las dependencias:

```
./mvnw generate-resources
node/npm install --save-dev parcel
node/npm install --save react react-dom
```

Y en caso de realizar cambios y no ves que esos cambios se trasladan al navegador:

```
./mvnw clean install
```