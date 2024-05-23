#!/bin/bash
# Script para esperar a que un servicio esté disponible antes de continuar

host="$1"
port="$2"
shift 2
cmd="$@"

# Esperar hasta que el servicio esté disponible o se alcance el tiempo máximo
until nc -z "$host" "$port"; do
  >&2 echo "El servicio $host:$port no está disponible, esperando..."
  sleep 1
done

>&2 echo "El servicio $host:$port está disponible, ejecutando comando: $cmd"
exec $cmd
