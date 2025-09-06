package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;

public class Persona {
        private int dni;
        private String nombre;
        private LocalDate fechaNacimiento;
        private String direccion;
        private String provincia;

        public int calcularEdad() {
            return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
        }

        public boolean esMayorDeEdad() {
            return this.calcularEdad() >= 18;
        }

        public void mostrarDatos() {
            System.out.println("DNI: " + this.dni);
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
            System.out.println("Direccion: " + this.direccion);
            System.out.println("Provincia: " + this.provincia);
            System.out.println("Edad: " + this.calcularEdad());
            if (this.esMayorDeEdad()) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }
        }

        public Persona() {
        }

        public Persona(int dni, String nombre, LocalDate fechaNacimiento, String direccion, String provincia) {
            this.dni = dni;
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.direccion = direccion;
            this.provincia = provincia;
        }

        public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
            this.dni = dni;
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.provincia = "Jujuy";
        }

        public int getDni() {
            return dni;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getProvincia() {
            return provincia;
        }

        public void setProvincia(String provincia) {
            this.provincia = provincia;
        }

        

    }

