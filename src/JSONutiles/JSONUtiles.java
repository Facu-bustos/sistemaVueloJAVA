package JSONutiles;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONUtiles {

    public static void grabarArray(JSONArray array) {
        try {
            FileWriter file = new FileWriter("cComprasVuelos.json");
            file.write(array.toString());
            file.flush();
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void grabar(JSONObject jsonObject) {
        try {
            FileWriter file = new FileWriter("comprasVuelos.json");
            file.write(jsonObject.toString());
            file.flush();
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }


public static void agregarVuelo(JSONObject nuevoVuelo) {
    try {
        File archivo = new File("comprasVuelos.json");
        JSONArray vuelosExistentes = new JSONArray();

        // Si el archivo existe y no está vacío leemso el contenido
        if (archivo.exists() && archivo.length() > 0) {
            String contenido = new String(Files.readAllBytes(Paths.get("comprasVuelos.json")), StandardCharsets.UTF_8);

            // inicializamos un JSONArray vacío
            if (contenido.startsWith("{")) {
                // Si el archivo contiene un objeto en lugar de un arreglo, es un error
                System.out.println("El archivo contiene datos no válidos. Reiniciando el archivo.");
                vuelosExistentes = new JSONArray();  // Reiniciamos el archivo
            } else {
                vuelosExistentes = new JSONArray(contenido);
            }
        } else {
            // Si el archivo no existe o está vacío, inicializamos un JSONArray vacío
            System.out.println("El archivo está vacío o no existe. Creando nuevo archivo.");
        }

        // Agregar el nuevo vuelo al JSONArray
        vuelosExistentes.put(nuevoVuelo);

        // Sobrescribir el archivo con el JSONArray actualizado
        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write(vuelosExistentes.toString(4));  // Indentación para mayor legibilidad
            writer.flush();
            System.out.println("Vuelo agregado correctamente.");
        }
    } catch (IOException | JSONException e) {
        System.err.println("Error al guardar el archivo: " + e.getMessage());
        e.printStackTrace();
    }
}

    public static void reprogramarVuelo(JSONObject nuevoVuelo) {
        try {
            File archivo = new File("VuelosReprogramados.json");
            JSONArray vuelosExistentes = new JSONArray();

            // Si el archivo existe y no está vacío leemso el contenido
            if (archivo.exists() && archivo.length() > 0) {
                String contenido = new String(Files.readAllBytes(Paths.get("VuelosReprogramados.json")), StandardCharsets.UTF_8);

                // Si el contenido no es un JSONArray válido, inicializamos un JSONArray vacío
                if (contenido.startsWith("{")) {
                    // Si el archivo contiene un objeto en lugar de un arreglo, es un error
                    System.out.println("El archivo contiene datos no válidos. Reiniciando el archivo.");
                    vuelosExistentes = new JSONArray();  // Reiniciamos el archivo
                } else {
                    vuelosExistentes = new JSONArray(contenido);
                }
            } else {
                // Si el archivo no existe o está vacío, inicializamos un JSONArray vacío
                System.out.println("El archivo está vacío o no existe. Creando nuevo archivo.");
            }

            // Agregar el nuevo vuelo al JSONArray
            vuelosExistentes.put(nuevoVuelo);

            // Sobrescribir el archivo con el JSONArray actualizado
            try (FileWriter writer = new FileWriter(archivo)) {
                writer.write(vuelosExistentes.toString(4));  // Indentación para mayor legibilidad
                writer.flush();
                System.out.println("Vuelo agregado correctamente.");
            }
        } catch (IOException | JSONException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }




    public static void grabarUsuarios(JSONObject jsonObject) {
        try {
            FileWriter file = new FileWriter("usser.json");
            file.write(jsonObject.toString());
            file.flush();
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static JSONTokener leer(String archivo) {
        JSONTokener tokener = null;

        try {
            tokener = new JSONTokener(new FileReader(archivo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return tokener;
    }
}